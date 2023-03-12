// https://www.codechef.com/problems/SELFDEF
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int count=0;
		    for(int i=1;i<=n;i++){
		        int x = s.nextInt();
		        if(x>9 && x<61){
		            count=count+1; 
		        }
		    }
		    System.out.println(count);
		}
	}
}
