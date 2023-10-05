public class Perbandingan {
    public static void main(String[] args) {
        
        int nilai1 = 21;
        int nilai2 = 9;

        System.out.println(nilai1 > nilai2);
        System.out.println(nilai1 < nilai2);
        System.out.println(nilai1 >= nilai2);
        System.out.println(nilai1 <= nilai2);
        System.out.println(nilai1 == nilai2);
        System.out.println(nilai1 != nilai2);

        System.out.print("\n");

        var kkm1 = 80;
        var kkm2 = 75;

        boolean luluskkm1 = kkm1 >= 90;
        boolean luluskkm2 = kkm2 >= 69;

        var lulus = luluskkm1 && luluskkm2;
        System.out.println(lulus);
    }
}