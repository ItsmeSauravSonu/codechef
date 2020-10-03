/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scn = new Scanner(System.in);
		    int t = scn.nextInt();
		    while(t-->0){
		        int s=0;
		        int n = scn.nextInt();
		        int k = scn.nextInt();
		        int x = scn.nextInt();
		        int y = scn.nextInt();
		        if(y>n){
		            System.out.println("NO");
		        }
		        else{
		            for(int i=1;i<=n;i++){
		                if((x+k*i)%n==y){
		                    System.out.println("YES");
		                    s=1;
		                    break;
		                }
		            }
		        }
		        if(s==0){
		        System.out.println("NO");
		    }
		    }
		    
		}
		catch(Exception e){
		    return;
		}
	}
}
