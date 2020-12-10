package formatif;

import java.util.Scanner;

public class presenteounon {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		  int[] n = {14,12,24,12,2,9,8,3,1000,4,10};
		  
		  System.out.println("Quelle nombre est ce que vous voulais?");
		  int element = sc.nextInt();
		  
	        int toFind = element;
	        boolean found = false;

	        for (int i : n) {
	            if (i == toFind) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(toFind + " est presente.");
	        else
	            System.out.println(toFind + " n'est pas presente.");
	    }
	
	}