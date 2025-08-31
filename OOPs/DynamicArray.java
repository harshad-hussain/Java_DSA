package OOPs;

public class DynamicArray {
    
    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
         data = new int[5];
         nextElementIndex  =0;
    }


    public void add(int elem){
        if(nextElementIndex == data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = elem;
        nextElementIndex++;
    }

    public  void add(int index,int elem){
        if(index > nextElementIndex){
            System.out.println("Index out of bound !");
            return;
        }
        if(nextElementIndex == data.length){
            doubleCapacity();
        }

        for(int i = nextElementIndex - 1; i >= index; i--) {
        data[i + 1] = data[i];
    }
        data[index] = elem;
        nextElementIndex++;
    }   

    public void printAll(){
        for( int i:data){
              System.out.print(i+ " ");
        }
    }

    private void doubleCapacity() {
            int temp[] = data;
            data = new int[2* temp.length];
            for(int i=0;i<temp.length;i++){
                data[i] = temp[i];
            }
    }

    public int removeLast(){
        if(nextElementIndex ==0){
            return -1;
        }
       int temp = data[nextElementIndex-1];
       data[nextElementIndex-1] =0;
       nextElementIndex--;
       return temp;
    }

    public int size(){
        return nextElementIndex;
    }

    public boolean isEmpty(){
        return nextElementIndex==0;
    }

    public int get(int i){
        if(i >= nextElementIndex){
            //Throw the error
            return -1;
        }
        return data[i];
    }
    
    public void set(int i,int elem){
        if(i>=nextElementIndex){
            //Error
            return;
        }
        data[i] = elem;
    }



}
