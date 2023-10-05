public class Method {
    public static void main(String[] args) {
        
        sayBujeti();
        names("Lenathea", "Ellay");
        System.out.println(pangkat(2, 4));
        System.out.println(operasi(9, "/", 3));

    }

    static void sayBujeti(){
        System.out.println("Bujeti");
    }

    static void names(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    static double pangkat(int a, int b){
        var total = Math.pow(a, b);
        return total;
    }

    static int operasi(int i, String oper, int j){
        switch(oper){
            case "+":
                return i + j;
            case "-":
                return i - j;
            case "*":
                return i * j;
            case "/":
                return i / j;
            default:
                return 0;
        }
    }
}