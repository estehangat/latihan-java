public class MethodOverloading {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Lenathea");
        sayHello("Lenathea", 0);
        
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String name, int angka){
        System.out.println("Hello " + name + " " + angka);
    }
}