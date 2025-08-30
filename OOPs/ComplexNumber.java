package OOPs;

public class ComplexNumber {
     
    private int realNum;

    private int imaginaryNum;

    

    public ComplexNumber(int realNum, int imaginaryNum){
          this.realNum =realNum;
          this.imaginaryNum=imaginaryNum;
    }

    public int getReal(){
        return realNum;
    }

    public void setReal(int num){
        this.realNum= num;
    }

    public int getImaginary(){
        return imaginaryNum;
    }

    public void setImaginary(int num){
        this.imaginaryNum = num; 
    }

    public void print(){
        if(imaginaryNum > 0){
           System.out.println(realNum + " + " + imaginaryNum + "i");
        }
        else{
               System.out.println(realNum + " - " + (-imaginaryNum) + "i");
        }
    }

    public void add(ComplexNumber c2){
        this.realNum = realNum + c2.realNum;
        this.imaginaryNum = imaginaryNum + c2.imaginaryNum;
    }

    public void multiply(ComplexNumber c2){
        int newReal = this.realNum * c2.realNum - this.imaginaryNum *c2.imaginaryNum ;

        int newImaginary = this.realNum *c2.imaginaryNum +this.imaginaryNum * c2.realNum;

        this.realNum = newReal;
        this.imaginaryNum = newImaginary;
    }





}
