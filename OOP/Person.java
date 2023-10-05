package OOP;

class Person {
    String name;
    String address;
    Integer age;
    final String country = "Indonesia";

    Person(String param, String paramAddress){
        name = param;
        address = paramAddress;
    }

    Person(String param){
        this(param, null);
    }

    Person(Integer paramAge){
        age = paramAge;
    }

    void sayHello(String param){
        System.out.println("Hello " + param + ", My name is " + name);
    }
}