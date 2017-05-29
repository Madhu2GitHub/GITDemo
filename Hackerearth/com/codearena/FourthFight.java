package com.codearena;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FourthFight 
{
	public static void main(String args[] ) throws Exception 
	{
       
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer passwords[]=new StringBuffer[N];
        for(int i=0;i<N;i++)
        	passwords[i]=new StringBuffer(br.readLine());
        for(int i=0;i<N;i++)
        {
        	StringBuffer str=passwords[i];
        	str.reverse();
        	for(int j=i+1;j<N;j++)
        	{
        		if(str.toString().equals(passwords[j].toString()))
        		{
        			int len=passwords[i].reverse().length();
        			System.out.println(len + " "+ passwords[i].charAt(len));
        		}
        	}
        }
    }

}
