import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Math.*;
import java.util.Scanner;

public class Laba_2_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();           // Создаем новый список
        ArrayList<Integer> arrayListDublicate = new ArrayList<>();  // Список для элементов дубликатов

        System.out.println("Enter array size ");

        Scanner console = new Scanner(System.in);                   // Создание метода Scaner для записи в переменную
        int arraySize = console.nextInt();

        for (int i = 0; i < arraySize; i++) {
            arrayList.add((int) (Math.random() * 10));                 // int для приведения, *10- диапазон от 0 до 10
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(i + " Element " +arrayList.get(i));
        }

        System.out.println();

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize-1; j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayListDublicate.add(arrayList.get(j));
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arrayListDublicate.size(); i++) {
            System.out.println("Dublicate elements " +arrayListDublicate.get(i));
        }

    }
}