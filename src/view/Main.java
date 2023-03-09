package view;

import controller.SapoControll;

public class Main 
{
	public static void main(String[] args)
	{
		
		SapoControll sapo[] = //vetor com os nomes e id dos sapos
			{
				new SapoControll("Rodolfo", 1),
				new SapoControll("Rodrigo", 2),
				new SapoControll("Jessica", 3),
				new SapoControll("Matheus", 4),
				new SapoControll("Bela", 5)
			};
		SapoControll aux = new SapoControll(null, 0); //auxiliar para fazer a troca
		
		for(int i = 0; i < 5; i++) //inicio da corrida
		{
			sapo[i].sapoCorrida();
		}
		
		try { //pausa para termino da corrida com as posições corretas dos sapos
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if (sapo[i].positions < sapo[j].positions) //sort para a classificação
				{
					aux = sapo[i];
					sapo[i] = sapo[j];
					sapo[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < 5; i++) //print da posição de cada
		{
			sapo[i].classificacao();
		}
		
	}
}
