// https://www.codechef.com/problems/CHEFAPPS
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		while(t-- > 0){
		    int s = sn.nextInt();
		    int x = sn.nextInt();
		    int y = sn.nextInt();
		    int z = sn.nextInt();
		    int res = x+y;
		    if(res+z<=s){
		        System.out.println(0);
		    }else{
		        int temp1 = x+z;
		        int temp2 = y+z;
		        if(temp1<=s || temp2<=s){
		            System.out.println(1);
		        }else{
		            System.out.println(2);
		        }
		    }
		}
	}
}
