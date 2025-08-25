package TimeandSpace;

public class pairSum {
    public static void main(String[] args) {
        int Arr[] = {1,2,4,2,6,8,4,8,9,3};
        int num = 4;
        int count =0;

        for(int i=0;i<Arr.length;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i]+Arr[j] == num){
                    count++;
                    System.out.print(Arr[i]  + " , " +Arr[j]);
                }
            }
        }
        System.out.print(count);
        
    }
}
