import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declaration
        int[] num = {10, 1, 2, 3, 5, 6};
        int[] num1 = {6,7,8,9,10,11};
        int[] num2 = new int[6];
        int sum=0;
        int temp=0;
        int k=0;



        //loops
        for (int i = 0; i < num.length; i++) {
            sum = num[i];
            for (int j = 0; j < num1.length; j++)
            {
                temp= num1[j];
                if(sum ==temp){
                    num2[k] = sum;
                    k++;
                }
            }
        }
        System.out.print("Result elements =  {");
        for(int temp1:num2){
            if(temp1!=0) {
                System.out.print(temp1 + ",");
            }
            }
        System.out.print("}");
        System.out.println();
    }
    }


