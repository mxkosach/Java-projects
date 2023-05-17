import java.util.Date;

//Лабораторная работа №2А
//В приведенных ниже заданиях необходимо вывести внизу фамилию разработчика, дату и время получения задания,
// а также дату и время сдачи задания. Добавить комментарии в программы в виде /** комментарий */,
// сгенерировать html-файл документации. В заданиях на числа объект можно создавать в виде массива символов.
//Ввести n чисел с консоли.
//Вывести на экран таблицу умножения

/**
 * @author Maksim Kosach
 * @version 1
 * * Вывод таблицы умножения
 */
public class Main {
    public static void showAuthorAndDate(Date dateOfReceipt) {
        Date dateNow = new Date();
        System.out.println("\n***********************");
        System.out.println("©Maksim Kosach, 2022");
        System.out.println("Date of receipt of the task:\t" + dateOfReceipt);
        System.out.println("Date of completion of the task:\t" + dateNow);
    }
    public static void main(String[] args) {
        int n=10;
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = i + 1;
        }
        System.out.println("Multiplication table:");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-1; j++) {
                System.out.print(numb[j] + "*" + numb[i] + "=" + numb[j] * numb[i]+"\t");
            }
            System.out.println();
        }

        Date date1 = new Date(1645086000000L);
        Main.showAuthorAndDate(date1);
    }
}