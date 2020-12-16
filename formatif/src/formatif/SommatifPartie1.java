package formatif;
/*
* Author : ashwin
*Date : 16-Dec-2020
*Trouver les erreurs avec le code en dessous
* 1. On n'a pas fermer le public static void main loop
* 2. Le method doit etre Static et pas public
*/
public class SommatifPartie1 
{

	public static void main(String[] args) 
	{
		System.out.println(saluerAmi("John"));
		
		/*
		 * Méthod permettant de saluer un ami en
		 * untilisant son nom
		 */
	}
		static String saluerAmi(String a)
		{
			String message="Bonjour mon ami" + a;
			return message;
		}
		

	}

