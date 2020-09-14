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
		    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int scrp1=0,scrp2=0; int ldp = 0; int lead = 0;
	    while(n>0)
		{
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			scrp1 = scrp1 + p1;
			scrp2 = scrp2 + p2;
			
			if(scrp1 > scrp2 && lead < (scrp1 - scrp2))
			{
				ldp = 1;
				lead = scrp1 - scrp2;
			}
			else if(scrp1 < scrp2 && lead < (scrp2 - scrp1))
			{
				ldp = 2;
				lead = scrp2 - scrp1;
			}
			
			n--;
		}
		System.out.println(ldp+" "+lead);
		}
		catch(Exception e){
		    return;
		}
	}
}
