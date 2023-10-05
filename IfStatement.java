public class IfStatement {
    public static void main(String[] args) {
        
        var nilai = 21;
        var absen = 9;

        if (nilai > 20 && absen >= 5){
            System.out.println("Mantap lulus bjir");
        } else if (nilai > 20 && absen < 5){
            System.out.println("Pas banget nilaimu bjir");
        } else {
            System.out.println("Belajar lagi bjir");
        }
    }
}
