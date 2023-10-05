public class SwitchStatement {
    public static void main(String[] args) {
        
        var nilai = "A";

        switch(nilai){
            case "A":
                System.out.println("Jago bener nilai A");
                break;
            case "B":
                System.out.println("Belajar lagi dek");
            case "C":
                System.out.println("Blog");
            default:
                System.out.println("Bjir");
        }

        switch(nilai){
            case "A" -> System.out.println("Omaygat");
            case "B", "C" -> System.out.println("Bujeti");
            default -> System.out.println("Blog");
        }

        String ingfo;
        switch(nilai){
            case "A" -> ingfo = "Omaygat";
            case "B", "C" -> ingfo = "Bujeti";
            default -> ingfo = "Tol";
        }
        System.out.println(ingfo);
        System.out.print("\n");

        ingfo = switch(nilai){
            case "A":
                yield "Iyah";
            case "B":
                yield "Mantaf";
            default:
                yield "Su";
        };
        System.out.println(ingfo);
    }
}