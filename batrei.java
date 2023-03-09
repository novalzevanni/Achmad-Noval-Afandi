import java.util.Scanner;

public class batrei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai baterai anda (0-100): ");
        int batrei = input.nextInt();

        if (batrei >= 75 && batrei == 100) {
            System.out.println("Baterai penuh (" + batrei + "%)");
        } else if (batrei >= 50) {
            System.out.println("Baterai cukup (" + batrei + "%)");
        } else if (batrei >= 25) {
            System.out.println("Baterai sedang (" + batrei + "%)");
        } else {
            System.out.println("Baterai lemah (" + batrei + "%)");
        }
    }
}






