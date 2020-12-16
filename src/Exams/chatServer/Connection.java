package Exams.chatServer;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public final class Connection implements Closeable {
    private final Socket socketConnection;
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;
    private boolean isClosed;

    public Connection(Socket socketConnection) {
        isClosed = false;
        this.socketConnection = socketConnection;
        try {
            inputStream = new ObjectInputStream(this.socketConnection.getInputStream());
            outputStream = new ObjectOutputStream(this.socketConnection.getOutputStream());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public ObjectInputStream getInputStream() {
        return inputStream;
    }

    public ObjectOutputStream getOutputStream() {
        return outputStream;
    }

    public void writeMessage(Message message) throws IOException {
        message.setMessageDateTimeSend();
        outputStream.writeObject(message);
        outputStream.flush();
    }

    public Message readMessage() throws IOException, ClassNotFoundException {
        return (Message) inputStream.readObject();
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
        outputStream.close();
        socketConnection.close();
        isClosed = true;
    }
}
