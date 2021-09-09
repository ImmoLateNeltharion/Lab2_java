import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Math.*;
import java.util.Scanner;

public class Laba_2_4 {
    public static void main(String[] args) {

        System.out.println("Enter array size ");

        Scanner console = new Scanner(System.in);                   // Создание метода Scanner для записи в переменную

        int[][] Matrix = new int[3][3];
        int ArrayMatrix = 3;

        int AverageGeometric = 1;

        for (int i = 0; i < ArrayMatrix; i++) {
            for (int j = 0; j < ArrayMatrix; j++) {

                Matrix[i][j] =  (int) Math.round(Math.random() *20-10);
            }
        }

        for (int i = 0; i < ArrayMatrix; i++) {
            for (int j = 0; j < ArrayMatrix; j++) {

                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        int counter=0;

        for (int i = 0; i < ArrayMatrix; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if(Matrix[i][j] < 0)
                {   AverageGeometric = AverageGeometric * Matrix[i][j];
                    counter++;
                }
            }
        }
        System.out.println("Average " + AverageGeometric);

        if(AverageGeometric<0)
            AverageGeometric = AverageGeometric *(-1);
        System.out.println("Average " + Math.pow( (double) AverageGeometric, (double) 1/counter));
    }
}