public class Phone {

    private String number;
    private String name;
    private String model;
    private int weight;


//    Выполнено
    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

//    Выполнено
    public Phone(String number, String model, int weight) {
        this(number, model);// Выполнено
        this.weight = weight;
    }

//    Выполнено
    public Phone() {
    }

//    Выполнено
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

//    Выполнено
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Выполнено
    public String getReceiveCall(String name) {

        return "Звонит " + name;

    }

//    Выполнено
    public String getReceiveCall(String name, String number) {

        return "Звонит " + name + " с номера " + number;

    }

}
