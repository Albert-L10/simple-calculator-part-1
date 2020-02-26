import com.sun.source.tree.WhileLoopTree;
import jdk.nashorn.internal.ir.WhileNode;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {

        int sum[]={1,2,3,4};
        int tot[]={1,2,3,4};
        int total=0;


        int temp=0;



        System.out.println("\nWelcome to MyCalculator!\n");

            String opt=" ";

            Scanner key=new Scanner(System.in);

        System.out.println("To add,Enter 'A' and to multiply,Enter 'B': ");
        opt=key.next();

            switch (opt) {

                case "A":
                    case "a":

                        System.out.println("your sum is: " +add(sum,total));

                break;

                case "B":
                case "b":


                    System.out.println("your product is: "+ multiply(tot,temp));



                break;


                default:
                    System.out.println("Your option is invalid!");
            }




    }

    public static int add(int sum[],int total) {


        int toAdd = 0;



        for(int j=0;j<sum.length;j++) {

            sum[j]+= toAdd;
            total+=sum[j];
        }


    return total ;
    }

    public static int multiply(int tot[],int temp)
    {

         temp=1;



        for(int i=0;i<tot.length;i++)
        {

            temp*=tot[i];

        }
        return temp;

    }





}
