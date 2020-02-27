import com.sun.source.tree.WhileLoopTree;
import jdk.nashorn.internal.ir.WhileNode;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {

        System.out.println("\nHere is your Simple Calculator!\n");


        System.out.println("Your sum is: "+add(1,2,3,4));
        System.out.println("Your product is: "+multiply(1,2,3,4,5));


    }

    public static int add(int... number)
    {
        int total=0;
        for(int num:number) {
            total +=num;
        }


        return total;

    }

    public static int multiply(int... number)
    {
        int prod=1;

        for(int num: number)
        {
            prod*=num;

        }

        return prod;
    }





}
