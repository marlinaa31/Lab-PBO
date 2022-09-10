import java.util.Scanner;

public class Soal3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t_segitiga, i, j;

        System.out.print("Inputkan tinggi segitiga: ");
        t_segitiga = input.nextInt();

        for (i = 0; i < t_segitiga; i++){
            for (j = 1; j <= t_segitiga - i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}