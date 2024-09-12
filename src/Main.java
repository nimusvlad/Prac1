import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        float sr = 0f;
        for(int i=0;i<10;i++)
        {
            sr+=arr[i];
        }
        System.out.println("Сумма всех элементов массива: " + Float.toString(sr));
        sr /= arr.length;
        System.out.println("Среднее арифметическое элементов массива: " + Float.toString(sr));
    }
}