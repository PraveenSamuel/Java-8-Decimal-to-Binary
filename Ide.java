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
		int a = 78;
		while(a>0){
		    if(a%2 == 0){
		        System.out.println(0);
		    }
		    else{
		        System.out.println(1);
		    }
		    int s = a/2;
		    a = s;
		}
	}
}
