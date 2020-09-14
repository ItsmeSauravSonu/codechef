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
	    int t = scn.nextInt();
	    while(t-->0){
	        int r,sum=0,temp;
	        int n = scn.nextInt();
	        temp = n;
	        while(n>0){
	            r = n%10;
	            sum=(sum*10)+r;
	            n = n/10;
	        }
	        if(temp==sum){
	            System.out.println("wins");
	        }
	        else{
	            System.out.println("losses");
	        }
	    }
	}
	catch(Exception e){
	    return;
	}
	}
}
