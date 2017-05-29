package com.codearena;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
public class SecondFight 
{
	public static void main(String args[] ) throws Exception 
	{
       
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int t=0;t<T;t++)
        {
        	int N = Integer.parseInt(br.readLine());
        	boolean done=false;
        	for(int i=2;i<N;i++)
        	{
        		if(isPrime(N-2))
        		{
        			done=true;
        			System.out.println("Deepa");
        		}
        		if(done)
        			break;
        	}
        	if(!done)
        		System.out.println("Arjit");
        }

    }
	private static boolean isPrime(int num) 
	{
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}
	

}
