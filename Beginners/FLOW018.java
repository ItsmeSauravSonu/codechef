/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner scn = new Scanner(System.in);
		    int test = scn.nextInt();
		    while(test>0){
		        int n = scn.nextInt();
		        int fact =1;
		        for(int i=2;i<=n;i++){
		           fact = fact * i;
		            
		        }
		        System.out.println(fact);
		        test --;
		    }
		}
		catch(Exception e){
		    return;
		}
	}
}
