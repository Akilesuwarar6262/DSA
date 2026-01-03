package DSA.patterns;

public class heart {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                if ((j >= 4 - i && j <= 6 + i) || (j >= 10 - i && j <= 12 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}