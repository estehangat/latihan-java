package OOP;

public class PersonApp {
    public static void main(String[] args) {
        
        var person1 = new Person("Lenathea", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Daiva");

        var person2 = new Person("Ellay", "Tangerang");
        Person person3 = new Person("Maeng", "Tokyo");

        System.out.println(person2);
        System.out.println(person3);

        var person4 = new Person(21);
        System.out.println(person4.age);
    }
}