// https://www.codechef.com/problems/WTRMIXING
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
		    
		    int initial_temp = s.nextInt();
		    int desired_temp = s.nextInt();
		    int hot_water = s.nextInt();
		    int cold_water = s.nextInt();
		    
		    
		    if(initial_temp==desired_temp){
		        System.out.println("Yes");
		    }else if(initial_temp<desired_temp){
                int temp = desired_temp-initial_temp;
                if(hot_water>=temp){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
		    }else{
                int temp = initial_temp-desired_temp;
                if(cold_water>=temp){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
		    }
 
		}
	}
	
}
