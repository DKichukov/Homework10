//import java.util.Arrays;public class zad2{    public static void printMul()    {        //declare variables and an array elements        int[] numbers = {10,9,8,7,6,5,4,3,2,1};        int[] num = new int[10];            //loop - read the elements            System.out.print("Numbers before: {");            for (int i = 0; i < numbers.length; i++)            {            //multiplication (elements X index) adn print "numbers before"            num[i] = numbers[i]*i;            System.out.print(numbers[i] + ",");            }            System.out.println("}");            System.out.print("Numbers after: {");            //print "number after"            for (int i = 0; i < num.length; i++)            {            System.out.print( num[i] + ",");            }            System.out.print("}");            //Print as String            //System.out.print("Numbers before:" + Arrays.toString(numbers));            //System.out.println();            //System.out.print("Numbers after: " + Arrays.toString(num));    }    public static void main(String[] args)    {        printMul();    }}