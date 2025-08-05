package twodArrays;

public class SpiralMatrix {
    public static void main(String[] args) {


        int Arr[][] =  {{1,2,3,4,5,6},
                       {18,19,20,21,22,7 },
                       {17,29,29,30,23,8},
                       {16,27,26,25,24,9},
                       {15,14,13,12,11,10}};
                       spiralPrint(Arr);
    }   
    public static void spiralPrint(int Arr[][]){
        int rows = Arr.length;
        int cols = Arr[0].length;

        int left = 0;
        int right = cols-1;
        int top=0;
        int bottom = rows-1;

        while(left <= right && top <= bottom){

        for(int i=left;i<=right;i++){
             System.out.print(Arr[top][i] +" ");
        }
        top++;

        for(int i=top;i<=bottom;i++){
            System.out.print(Arr[i][right] +" ");
        }
        right--;

        if(top<=bottom){
        for(int i=right;i>=left;i--){
            System.out.print(Arr[bottom][i] +" ");
        }
    }
        bottom--;
        
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            System.out.print(Arr[i][left] +" ");
        }
    }
        left++;

    }

    }
}
