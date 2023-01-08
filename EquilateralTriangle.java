package DebJava;
import java.io.*;
public class EquilateralTriangle {

	static void pattern(int rows)
	{
		int i,j,k;
		int space = rows - 1;
        for (j = 1; j <= rows; j++) 
        {
        	if(j == rows) 
        	{
        		for(i = 1; i <= rows ; i++)
        			System.out.print("* ");
        	}
        	else 
        	{
        		for (i = 1; i <= space; i++) 
        		{
        			System.out.print(" ");
        		}
        		space--;
        		for (i = 1; i <= 2 * j - 1; i++) 
        		{
        			if(i == 1 || i == 2 * j - 1)
        				System.out.print("*");    
        			else
        				System.out.print(" ");
        		}
        	}
            System.out.println("");
        }	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(">> Enter the number of rows you want : ");
		pattern(Integer.parseInt(read.readLine()));
		
	}

}
