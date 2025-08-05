package twodArrays;

public class rowWiseSum {
    public static void main(String[] args) {
        int Arr[][] = {{1,2,3},
                       {4,5,6}};

        int N= 3;
        int M = 3;

        for(int i=0;i<Arr.length;i++){
            int sum =0;
            for(int j=0;j<Arr[i].length;j++){
                sum += Arr[i][j];
            }
            System.out.print(sum +" " );
        }
        System.out.println();


    }
}
