package Exams.Farm;
/*
На Ферме есть фермер, домашние животные (и птицы). Максимальное количество животных (и птиц) на ферме - 10.

        Фермер живет за счет ресурсов, собираемых с животных. Изначально фермер создается с 5 единицами ресурсов.
        Фермер должен иметь возможность:
        1. собрать ресурсы с домашних животных, которые могут давать ресурсы
        2. съесть домашнее животное, которое пригодно в пищу (когда на ферме не останется животных, которые дают ресурсы).
        При этом расчет ресурсов следующий: 1кг животного -  1 единица ресурса
        3. прогнать дикое животное, которое пришло на ферму
        4. кормить домашнее животное

        Домашние животные: Корова, Кот, Курица, Кролик
        обладают следующими характеристиками:
        имя, вес, скорость, здоровье, количество ресурсов (у каждого свое и 0, если животное на дает ресурс)
        Есть домашние животные, которые дают ресурсы:  Корова, Курица
        Есть домашние животные, которые пригодны в пищу: Кролик, Корова, Курица
        Домашнее животное может убежать от дикого животного, если его скорость больше.
        Домашнее животное может восполнять здоровье (+1, но не больше изначального).
        Животные восполняют здоровье во время кормления.

        Дикие животные:
        Волк, Медведь, Лисица.
        обладают следующими характеристиками:
        имя, вес, скорость, сила
        Дикое животное может съесть (либо ранить) домашнее животное, если оно не убежит.
        Если домашнее животное было съедено, то оно не остается на ферме
        (из массива удалять не обязательно, можно использовать какой нибудь флаг, onFarm:true/false)!
        Если фермер прогнал дикое животное с фермы 3 раза, то в 4й раз оно не может прийти на ферму.

        День на ферме (метод passDay):
        1. Фермер тратит 2 единицы ресурсов (если ресурсов не осталось, игра заканчивается).
        2. Приходит дикое животное (выбирается рандомно из массива с дикими животными),
        пытается поймать (съесть, либо ранить) домашнее животное (выбирается рандомно).
        Если домашнее животное убежало, дикое уходит ни с чем.
        3. Иногда (рандомно) фермер может прогнать дикое животное.
        4. Фермер кормит всех животных (животные восполняют здоровье)
        5. Фермер собирает ресурсы с животных, с которых можно их собирать.
        Если таких не осталось, съедает животное, пригодное в пищу (если такие остались).
*/
public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот Вася");

        System.out.println("Имя: " + cat1.getName());
        System.out.println("Скорость: " + cat1.getSpeed());
        System.out.println("Вес: " + cat1.getWeight());
        System.out.println("Здоровье: " + cat1.getHealth());
        System.out.println("Кол-во ресурсов: " + cat1.getResourceCount());
        System.out.println("Съедобное: " + cat1.isCanBeEaten());

    }
}
