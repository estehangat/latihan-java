public class RecursiveMethod {
    public static void main(String[] args) {
        
        System.out.println(faktorial(5));
        System.out.println(recursive(7));
        loop(50);

    }

    static int faktorial(int a){
        
        int result = 1;

        for (int i = 1; i <= a; i++){
            result *= i;
        }

        return result;
    }

    static int recursive(int a){
        
        if (a == 1){
            return 1;
        } else {
            return a * recursive(a - 1);
        }
    }

    static void loop(int a){
        if (a == 0){
            System.out.println("Done");
        } else {
            System.out.println("Loop " + a);
            loop(a - 1);
        }
    }
}