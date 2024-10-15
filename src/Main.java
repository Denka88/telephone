public class Main {
    public static void main(String[] args) {

//        Выполено
        Phone oleg = new Phone();
        Phone andrey = new Phone("Xiaomi", "88005553535");
        Phone vladimir = new Phone("89512534543", "Samsung", 720);

//        Сеттеры
        oleg.setName("Oleg");
        oleg.setNumber("89512534543");

        andrey.setName("Andrey");
//        гет нейм - Возвращает имя
        System.out.println(andrey.getName());
        System.out.println(andrey.getNumber());

//        getReceiveCall - Возвращает имя звонящего или имя и номер звонящего
        System.out.println(vladimir.getReceiveCall("vladimir"));
        System.out.println(vladimir.getReceiveCall("vladimir", "89889888989"));

    }
}