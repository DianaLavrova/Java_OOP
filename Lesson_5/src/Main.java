public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", "engeneer", "ivan@mail.ru",
                3456, 3000, 25);
        Person person1 = new Person("Petr", "Petrov", "saller", "petr@mail.ru",
                1234, 2000, 60);
        Person person2 = new Person("Alex", "Alexin", "fronend-engeneer", "alex@mail.ru",
                8970, 9000, 46);
        Person person3 = new Person("Mikael", "Mikaelov", "manager", "mikael@gmail.com",
                4567, 10000, 32);
        Person person4 = new Person("Lida", "Lidova", "lawyer", "lida@mail.ru",
                768, 7000, 40);

        Person[] persons = new Person[5];
        persons[0] = person;
        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;
        persons[4] = person4;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age > 40) {
                persons[i].information();
            }
        }

    }
}
