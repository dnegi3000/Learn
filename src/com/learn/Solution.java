package com.learn;
import java.io.*;
import java.util.*;
/***
 * pallel drom
 * @author dnegi
 *
 */

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPal = true;
        if (A != null && A.length() > 0)
        	{

        	System.out.println( "aaa"+ A);
        	char string[] =A.toCharArray(); 
        		
        		int length = string.length-1;
        		for (int i = 0 ; i < string.length ;  i++         )
        		{
        			System.out.println(" string[i], string[length]" + string[i] + "   ::" + string[length]);
        			
        			if (string[i] != string[length])
        			{
        				isPal = false;
        			}
        			
        			length -- ;
        			if (i ==length || i > length )
        			{
        				break;
        			}
        			
        			
        		}
        	}
        
        System.out.println(" PALI : " + isPal);
        
    }
}
