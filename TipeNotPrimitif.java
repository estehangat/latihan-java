public class TipeNotPrimitif {
    public static void main(String[] args) {
        
        Integer intejer = 21;
        Long lung = 1_000_000L;

        Byte bite = null;

        System.out.println(intejer);
        System.out.println(lung);
        System.out.println(bite);

        bite = 127;

        System.out.println(bite);

        int satu = 100;
        Integer satu1 = satu;

        System.out.println(satu1);

        int dua = 121;
        Integer duaAgain = dua;
        byte biteAgain = duaAgain.byteValue();

        System.out.println(biteAgain);
    }
}