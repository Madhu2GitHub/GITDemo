package com.codearena;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ThirdFight 
{
	public static void main(String args[] ) throws Exception 
	{
       
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int t=0;t<T;t++)
        {
        	String str[]=br.readLine().split(" "); 
        	int k=0;
        	int len=str.length;
        	for(int i=len-1;i>=(len/2);i--)
        	{
        		String s=str[k];
        		str[k]=str[i];
        		str[i]=s;
        	}
        	for(int i=0;i<str.length;i++) System.out.print(str[i]+" ");
        	System.out.println();
        }

    }

}
