import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Math.*;
import java.util.Scanner;

public class Laba_2_2 {
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
            System.out.println(i + " Element " + arrayList.get(i));
        }

        for (int i = 0; i < arraySize; i++) {
            if (arrayList.get(i)!=0)
            {
                arrayListDublicate.add(arrayList.get(i)*arrayList.get(i));
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < arrayListDublicate.size(); i++) {
            System.out.println("Dublicate elements " +arrayListDublicate.get(i));
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < arrayListDublicate.size(); i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arrayListDublicate.get(i);
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arrayListDublicate.size(); j++) {
                //Если находим, запоминаем его индекс
                if (arrayListDublicate.get(j) < min) {
                    min = arrayListDublicate.get(j);
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arrayListDublicate.get(i);
                arrayListDublicate.set(i, arrayListDublicate.get(min_i));
                arrayListDublicate.set(min_i, tmp);
            }
        }

        for (int i = 0; i < arrayListDublicate.size(); i++) {
            System.out.println("Dublicate elements " +arrayListDublicate.get(i));
        }

    }
}
