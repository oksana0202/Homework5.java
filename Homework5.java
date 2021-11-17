/**
 * JAVA 1 Homework5
 * 
 * @author Oksana
 * @version 17.11.2021
 */

class Homework5 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Dorohin", "Director", "1@mail.ru", "111111", 100, 55);
        System.out.println (person. getFullName);

        Person person1 = new Person ("Oleg Petrov", "Manager", "2@mai.ru", "222222", 90, 45);
        System.out.println (person1);

        Person person2 = new Person ("Igor Orlov", "Manager", "3@mai.ru", "333333", 90, 34);
        System.out.println (person2);

        Person person3 = new Person ("Anna Gortman", "Manager", "4@mai.ru", "44444444", 90, 37);
        System.out.println (person3);

        Person person4 = new Person ("Olga Bosh", "Manager", "5@mai.ru", "555555", 85, 62);
        System.out.println (person4);

        for (int i = 0; i < person.length; i++) {
            if(person[i].getAge() > 40){
                person[i].printInfo();
            }
        }
    }
}

class Person {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

    Person(String fullName, String position, String email, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "fullName: \n" + fullName + "position: \n" + position + "email: \n" + email + "phone: \n" + phone + "salary: \n" + salary + "age: \n" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
