package OOPs;

public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        if(numerator==0){
            denominator=1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int  getNumerator(){
        return numerator;
    }

    public void setNumerator(int num){
        this.numerator = num;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int num){
        if(num==0){
            //Throw error
            return;
        }
        this.denominator = num;
        simplify();
    }


    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    private void simplify(){
        int gcd =1;
        int smaller = Math.min(numerator, denominator);
        for(int i=2;i<smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    } 

    public void add(Fraction f2){
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
           simplify();
    }

    public  static  Fraction add(Fraction f1, Fraction f2){
        int newnum = f1.numerator *f2.denominator + f1.denominator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newnum, newDeno);
        return f3;   
    }

    




}
