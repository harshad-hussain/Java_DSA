package TEST;

public class MaxProfit {
    public static void main(String[] args) {
        int budget[] = {30,20,53,14};

        int n = budget.length;

        for(int i=1;i<n;i++){
            int temp=budget[i];
            int j =  i-1;
            while(j >=0 && budget[j] > temp){
                budget[j+1] = budget[j];
                j--;
            }
            budget[j+1]= temp;;
        }

        int maxProfit =0;

        for(int k=0;k<n;k++){
            int price =  budget[k];
            int buyers = n-k;
            int profit = price * buyers;

            if(profit>maxProfit){
                maxProfit = profit;
            }

        }

        System.out.print(maxProfit);
    }

}
