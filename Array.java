public class Array {
    public static void main(String[] args) {
        
        String[] stringArray = new String[3];
        stringArray[0] = "Daiva";
        stringArray[1] = "Paundra";
        stringArray[2] = "Lenathea";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        int[] intArray = {
            21, 9, 5, 1, 25, 923, 109
        };
        
        intArray[5] = 69;

        System.out.println(intArray[0]);
        System.out.println(intArray[5]);
        System.out.println(intArray.length);

        char[][] huruf = {
            {'a', 'b', 'c'},
            {'d','e','f'},
            {'g','h','i'}
        };
        
        System.out.println(huruf[1][0]);
        
    }
}
