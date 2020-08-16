package test;

import java.util.Scanner;

class Base{
    int width,height;
    public Base(){
        this.width = 0;
        this.height = 0;
    }
    /*public void display(){
        System.out.println("Width is :"+width +" "+"Height is :"+height);
    }*/

}
class assignement2 extends Base{

    Scanner scan;
    public assignement2(){
        scan = new Scanner(System.in);
    }


    public void read_input(){
        System.out.print("Width :");
        width = scan.nextInt();
        System.out.print("Height :");
        height = scan.nextInt();
    }
    public void display(){
        System.out.println(width*height);
    }

    public static void main(String[] args) {
        assignement2 rectangle = new assignement2();
        rectangle.read_input();
        System.out.println(rectangle.width + " "+ rectangle.height);
        rectangle.display();
    }
}