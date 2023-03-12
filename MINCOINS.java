// https://www.codechef.com/problems/MINCOINS
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
		    int x = s.nextInt();
		    int tens = x/10;
		    int fives = (x%10)/5;
		    if(x%10==0){
		        System.out.println(tens);
		    }else if(x%5==0){
		        System.out.println(tens+fives);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}
