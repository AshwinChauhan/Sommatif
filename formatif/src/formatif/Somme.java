package formatif;

public class Somme {

	public static void main(String[] args) 
	{
		int [] a= {14,12,24,12,2,9,8,3,1000,4,10};
		

	int somme=0;
		for(int i=0;i<a.length;i++)
		{
			somme+=a[i];  // somme = somme+a[i];
		}
		System.out.println(somme);

	}

}
