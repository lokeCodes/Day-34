// https://www.codechef.com/problems/WGHTS
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
		    int weight = s.nextInt();
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    if(x==weight || y==weight || z==weight || (x+y)==weight || (y+z)==weight || 
		    (x+z)==weight || (x+y+z)==weight){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
