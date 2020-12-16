package Exams.chatServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Connection connection;
    private String clientName;
    private boolean isOpen;
    private final Scanner scanner = new Scanner(System.in);
    private static String serverIp = "localhost";
    private static int serverPort = 8090;

    public Client() {
        try {
            this.connection = new Connection(new Socket(serverIp, serverPort));
            this.isOpen = true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void clientApplicationStart() {
        new Thread(new Writer()).start();
        new Thread(new Reader()).start();
    }

    public class Reader implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    if (connection.getInputStream().available() > 0) {
                        Message readMessage =  connection.readMessage();
                        System.out.println(readMessage);
                    }
                } catch (IOException | ClassNotFoundException ioException) {
                    ioException.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                if (!isOpen) break;
            }
        }
    }

    public class Writer implements Runnable {
        @Override
        public void run() {
            System.out.println("Введите Ваше имя: ");
            clientName = scanner.nextLine();
            while (true) {
                System.out.println("Введите сообщение: ");
                String messageText = scanner.nextLine();
                Message sendMessage = Message.getMessage(Client.this.clientName, messageText);
                sendMessage.setMessageDateTimeSend();
                try {
                    connection.writeMessage(sendMessage);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Client().clientApplicationStart();
    }
}
