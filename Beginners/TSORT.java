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
		    int arr[] = new int[t];
		    for(int i=0; i<t;i++){
		        arr[i] = scn.nextInt();
		    }
		    Arrays.sort(arr);
		    for(int i = 0;i<t;i++){
		        System.out.println(arr[i]);
		    }
		    
		}
		catch(Exception e){
		    return;
		}
	}
}
