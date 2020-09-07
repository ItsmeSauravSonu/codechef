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
	     int rd = 0;
	     while(t-->0){
	         int n = scn.nextInt();
	        
	        if(n%2==0){
	            rd++;
	        }
	        else{
	            rd--;
	        }
	     }
	     if(rd>0){
	         System.out.println("READY FOR BATTLE");
	     }
	     else{
	         System.out.println("NOT READY");
	     }
	 }
	 catch(Exception e){
	     return;
	 }
	}
}
