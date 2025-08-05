package twodArrays;

public class transpose {
    public static int[][] main(String[] args) {
        int rows = 3;
        int cols =3;

        int Arr[][] = {{1,2,3},
                       {4,5,6}};

        int trans[][] = new int[cols][rows];

        for(int i=0;i<Arr[0].length;i++){
            for(int j=0;j<Arr.length;j++){
                  trans[rows][cols] = Arr[j][i];
            }
            System.out.println();
        }
        return trans;

    }
}
