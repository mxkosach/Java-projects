package by.bsu.first;

import java.util.Scanner;

//Лабораторная работа 1
//Ввести с консоли n целых чисел. На консоль вывести:
//10.Числа в порядке убывания частоты встречаемости чисел.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers and press <Enter>:");
        int n = scan.nextInt();
        //int n = 10;int array[] = {2, 5, 13, 2, 7, 2, 5, 27, 2, 13};
        int array[] = new int[n];

        System.out.println("Enter numbers and press <Enter>:");
        for (int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        scan.close();

        System.out.print("Our array: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        int repeat[][] = new int[n][2];
        int r = 0;
        boolean isFind;
        for (int i = 0; i < n; i++) {
            isFind = false;
            for (int j = 0; j < r; j++) {
                if (array[i] == repeat[j][0]) {
                    repeat[j][1]++;
                    isFind=true;
                    break;
                }
            }
            if (!isFind) {
                repeat[r][0] = array[i];
                repeat[r][1] = 1;
                r++;
            }
        }

        int temp0,temp1;
        for (int out = r-1; out >=1 ; out--) {
            for (int in = 0; in < out; in++) {
                if (repeat[in][1] < repeat[in + 1][1]) {
                    temp0 = repeat[in][0];
                    temp1 = repeat[in][1];
                    repeat[in][0] = repeat[in + 1][0];
                    repeat[in][1] = repeat[in + 1][1];
                    repeat[in + 1][0] = temp0;
                    repeat[in + 1][1] = temp1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            System.out.println(repeat[i][0] + " x" + repeat[i][1] + " times");
        }
        System.out.println("Числа в порядке убывания частоты встречаемости чисел:");
        for (int i = 0; i < r; i++) {
            System.out.print(repeat[i][0]+" ");
        }


    }
}