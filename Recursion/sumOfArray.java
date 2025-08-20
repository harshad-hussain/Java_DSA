package Recursion;

public class sumOfArray {


    public static int sum(int input[],int startIndex){  
    if(startIndex == input.length){
        return 0;
    }

    int total  = input[startIndex] + sum(input, startIndex+1);
    return total;
    }
    public static void main(String[] args) {
         int input[] ={1,2,3,4};
        System.out.print(sum(input, 0));
    }


}
