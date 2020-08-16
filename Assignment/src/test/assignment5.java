package test;

class complex{
    int real;
    int imaginary;

    public complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public complex sum(complex b){
        return new complex(this.real+b.real,this.imaginary+b.imaginary);
    }
    public complex difference(complex b){
        return new complex(this.real-b.real,this.imaginary-b.imaginary);
    }
    public complex product(complex b){
        return new complex( this.real*b.real - this.imaginary*b.imaginary , this.imaginary*b.real + this.real*b.imaginary);
    }
    public String toString(){
        return String.format("Real = %d : Imaginary = %d",this.real,this.imaginary );
    }
}
public class assignment5 {

    assignment5(){
        complex a = new complex(1,2);
        complex b = new complex(3,4);
        System.out.println((a.sum(b)).toString());
        System.out.println((a.difference(b)).toString());
        System.out.println((a.product(b).toString()));


    }

    public static void main(String[] args) {
        assignment5 test = new assignment5();
    }
}
