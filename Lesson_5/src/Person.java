public class Person {
    String name;
    String surname;
    String position;
    String email;
    int phonenumber;
    int salary;
    int age;

    public Person(String name, String surname, String position, String email, int phonenumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println("Сотрудник " + name + " " + surname + ", " + "должность: " + position + "," + " E-mail: " +
                email + "," + " Phone: " + phonenumber + "," + " Зарплата: " + salary + "," + " Возраст: " + age + ";");


    }
}
