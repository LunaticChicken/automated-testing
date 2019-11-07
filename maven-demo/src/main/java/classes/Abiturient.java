package classes;

public class Abiturient { //id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
    private int id = 1, balls;
    private String surname, name, patronymic, address, phoneNumber;

    public Abiturient(String surname, String name, String patronymic, int balls) {
        id = id++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.balls = balls;
    }

    public Abiturient(String surname, String name, String patronymic, int balls, String address, String phoneNumber) {
        id = id++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.balls = balls;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getPatronymic() { return patronymic; }
    public int getId() { return id; }
    public int getBalls() { return balls; }

    @Override
    public String toString() {
        return surname + " " + name + "(" + balls + ")";
    }
}
