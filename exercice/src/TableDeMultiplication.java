
public class TableDeMultiplication {
    public static void main(String[] args) {
        System.out.println("\nTABLE DE MULTIPLICATION 1 a 10");
            System.out.println("============================== \n");
        for (int nbr = 1; nbr <= 10; nbr++) {
            
            for (int i = 1; i <= 10; i++) {

                System.out.println( nbr+ " * " + i + " = " + nbr * i);
            }

            System.out.println("\n");
        }

    }
}