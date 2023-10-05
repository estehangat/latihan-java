public class Looping {
    public static void main(String[] args) {
        
        int n = 1;

        for (int i = 1;i<=10;i++){
            System.out.println("Perulangan " + i);
        }

        while (n <= 10){
            System.out.println("Perulangan " + n);
            n++;
        }

        do {
            System.out.println("Perulangan " + n);
        } while (n <= 7);
    }
}