import java.util.Arrays;public class upr3 {    public static void sortNumbersOrder() {//array with 12 numbers to be sort in order        //declaration of array        int[] numbers = {1, 6, 788, 90, 123, 546, 34, 211, 23, 15, 85, 45};        for (int i = 0; i < numbers.length; i++) {            for (int j = i + 1; j < numbers.length; j++)            {            if(numbers[i] > numbers[j])            {                int temp = numbers[i];                numbers[i] = numbers[j];                numbers[j] = temp;            }            }        }        System.out.print(Arrays.toString(numbers));    }    public static void main(String[] args)    {    sortNumbersOrder();    }}