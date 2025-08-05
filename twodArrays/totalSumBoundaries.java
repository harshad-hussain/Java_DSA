package twodArrays;

public class totalSumBoundaries {
    public static void main(String[] args) {
        int Arr[][] = {{1,2,3},
                      {4,5,6},
                 {7,8,9}};

     int N = Arr.length;
     int sum =0;

     boolean visited[][]= new boolean[N][N];

     for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(i==0 || j==0|| i==N-1 || j==N-1){
                sum +=Arr[i][j];
                visited[i][j]= true;
            }
        }
     }

     for(int i=0;i<N;i++){
        if(!visited[i][i]){
            sum+=Arr[i][i];
            visited[i][i]=true;
        }
     }

     for(int i=0;i<N;i++){
        int j=N-1-i;
        if(!visited[i][j]){
            sum+=Arr[i][j];
            visited[i][j]=true;
        }
     }

     System.out.println(sum);
    }
}
