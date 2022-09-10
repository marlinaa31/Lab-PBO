import java.util.Scanner;

public class Soal2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if(nilai < 41){
            System.out.println("Grade E");
        }
        else if (nilai >= 41 && nilai < 51){
            System.out.println("Grade D");
        }
        else if (nilai >= 51 && nilai < 60){
            System.out.println("Grade C");
        }
        else if (nilai >= 60 && nilai < 69){
            System.out.println("Grade BC");
        }
        else if (nilai >= 69 && nilai < 78){
            System.out.println("Grade B");
        }
        else if (nilai >= 78 && nilai < 87){
            System.out.println("Grade AB");
        }
        else if (nilai >= 87 && nilai <= 100){
            System.out.print("Grade A");
        }
        else {
            System.out.println("Invalid!");
        }
    }
}