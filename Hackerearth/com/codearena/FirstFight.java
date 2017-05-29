package com.codearena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstFight 
{
	public static void main(String args[] ) throws Exception 
	{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int t=0;t<T;t++)
        {
            int N=Integer.parseInt(br.readLine());
            int col=-1,row=-1;
            for(int n=0;n<N;n++)
            {
                String str=br.readLine();
                if(str.indexOf('*')!=-1)
                {
                	row=n;
                	col=str.indexOf('*');
                }  
                int mid=N/2;
                if(col>mid)
                	col=col-mid;
                else
                	col=mid-col;
                if(row>mid)
                	row=row-mid;
                else
                	row=mid-row;
                
                System.out.println(row+col);
                
                
            }
            
        }
    }

}
