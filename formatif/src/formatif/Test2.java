package formatif;
/*
* Author : ashwin
*Date : 16-Dec-2020
*Method qui permet de faire la moyenne des nombres impaires contenues dans un tableau de 20 nombres entiers
*génerés au hazard
*/
public class Test2 {

	public static void main(String[] args) 
	{
		{
			// code pour generer 20 nombre au hazzard
			int [] myTab = new int [20];
			for(int i= 0; i<20; i++)
			{myTab[i] = (int)(Math.random() * (i+1));}
			
			for(int i : myTab)
			{System.out.println(ashwin(myTab));} 
			}
	}
// method pour trouver les nombre impaire puis trouver la moyenne
	static int ashwin(int []nbr)
	
	{
		int somme=0;
		for (int i = 0; i < nbr.length; i++) {
			
		if(nbr[i]%2!=0)// Si le nombre ne peut pas etre divisé par 2
			
		for (int j = 0; j < nbr.length; j++) 
		{
			somme+=nbr[i];  // ajouter les nombre impaire ensemble
		}
			return somme/nbr.length; // diviser la somme des nombre impaire sur la quantité de nombre impaire
		}
		return somme;

		
		}
	
}


	

