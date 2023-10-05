public class MethodVariable {
    public static void main(String[] args) {
        
        int[] a = {80,76,69,90,68};
        sayCongrats(a);
        sayCongrats(70, 80, 90, 60, 70);

    }

    static void sayCongrats(int...values){
        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Cumlaude bro");
        } else {
            System.out.println("Nambah lagi bro");
        }
    }
}