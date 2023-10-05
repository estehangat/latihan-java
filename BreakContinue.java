public class BreakContinue {
    public static void main(String[] args) {
        
        var angka = 100;

        while (angka >= 100){
            System.out.println("Looping ke-" + angka);
            angka++;

            if (angka == 128 + 1){
                break;
            }
        }

        for (int i = 1; i <=21; i++){
            if (i % 2 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}