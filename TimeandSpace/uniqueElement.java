package TimeandSpace;

public class uniqueElement {
    public static void main(String[] args) {
        
    
    int Arr[] ={2, 3, 5, 6, 3, 6, 2};
    int unique =0;

    for(int num :Arr){
        unique ^=num;
    }

    System.out.print(unique);
}
}
