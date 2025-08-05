package twodArrays;

public class Creating {
     public static void main(String[] args) {
        int a[][]=new int [3][4];
        // System.out.println(a);
        //Accessing the rows..
        // System.out.println(a[0]);
        // System.out.println(a[2]);

        //Accessing the columns .
        // int B[][]= {{1,2,3},{2,3,4},{4,5,6}};
        // System.out.println(B[1]);

        for(int i=0;i<3;i++){ //loop over rows
            for(int j=0;j<4;j++){   //Loop over columns
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


     }
}
