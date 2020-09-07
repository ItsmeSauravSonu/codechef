import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Scanner;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) throws IOException {
	    try{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i=0;i<t;i++){
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    System.out.println(a+b);
		}
	    }
	    catch (Exception e){
	        return ;
	    }
	    
		}
	}
