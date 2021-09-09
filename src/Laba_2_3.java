import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Math.*;
import java.util.Scanner;


public class Laba_2_3 {
    public static void main(String[] args) {

        System.out.println("Enter array size ");

        Scanner console = new Scanner(System.in);                   // Создание метода Scaner для записи в переменную

        int[][] Matrix = new int[5][5];
        int ArrayMatrix = 5;

        for (int i = 0; i < ArrayMatrix; i++) {
            for (int j = 0; j < ArrayMatrix; j++) {

                Matrix[i][j] =  (int) Math.round(Math.random() *((20-(-1))-1));
            }
        }

        for (int i = 0; i < ArrayMatrix; i++) {
            for (int j = 0; j < ArrayMatrix; j++) {

                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Enter number string ");

        int stringNumber = console.nextInt();


            for (int j = 0; j < ArrayMatrix; j++) {

               if((Matrix[stringNumber][j]%2==0))
               {
                   System.out.print(Matrix[stringNumber][j] + " ");
               }
            }

            System.out.println();

    }
}
