package view;

import controller.SapoControll;

public class Main 
{
	public static void main(String[] args)
	{
		
		SapoControll sapo[] = 
			{
				new SapoControll("Rodolfo", 1),
				new SapoControll("Rodrigo", 2),
				new SapoControll("Jessica", 3),
				new SapoControll("Matheus", 4),
				new SapoControll("Bela", 5)
			};
		SapoControll aux = new SapoControll(null, 0);
		
		for(int i = 0; i < 5; i++)
		{
			sapo[i].sapoCorrida();
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if (sapo[i].positions < sapo[j].positions)
				{
					aux = sapo[i];
					sapo[i] = sapo[j];
					sapo[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("O sapo " + sapo[i].sapoName + " com a id " + sapo[i].identification + " terminou em " + sapo[i].positions + "° lugar");
		}
		
	}
}
