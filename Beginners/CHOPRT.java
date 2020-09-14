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
		    while(t>0){
		        int a = scn.nextInt();
		        int b = scn.nextInt();
		        if(a>b){
		            System.out.println(">");
		        }
		        else if(a<b){
		            System.out.println("<");
		        }
		        else{
		            System.out.println("=");
		        }
		        t--;
		    }
		    
		}
		catch(Exception e){
		    return;
		}
	}
}
