package test;

import java.util.Scanner;
import java.util.*;
class assignment7
{
    int x,y,z;
    double area;
    int  s;
    public void area(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
//height=Math.sqrt(c*2-(a/2)*2);
        s=(x+y+z)/(2);
        area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("AREA OF TRAINGLE :"+area);
//System.out.println(s);
    }
}

class A{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side 1 :");
        int x=sc.nextInt();
        System.out.print("Enter Side 2 :");
        int y=sc.nextInt();
        System.out.print("Enter Side 3 :");
        int z=sc.nextInt();
        assignment7 traingle=new assignment7();
        traingle.area(x,y,z);
    }
}