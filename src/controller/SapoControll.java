package controller;

import java.util.Random;

public class SapoControll 
{
	
	public String sapoName;
	public int identification;
	public int meters = 0;
	public double positions;
	static int a = 0;
	
	
	public SapoControll(String nome, int num)
	{
		this.sapoName = nome;
		this.identification = num;
	}
	
	
	public void sapoCorrida()
	{
		new Thread()
		{
			public void run() 
			{
				movimentoSapo();
			}
		}.start();
	}
	
	private void movimentoSapo()
	{
		Random dados = new Random(); 
		
//		int d2;
		int d10;
		
		while(this.meters < 40) //distancia da corrida
		{
//			d2 = dados.nextInt(2) + 1;		
			
//			if(d2 == 1)
//			{
				d10 = dados.nextInt(11);
				
				this.meters += d10;
				System.out.println("E o sapo " + this.sapoName + " com id " + this.identification + " Pula " + d10 + "m");
//			}
//			else
//			{
//				System.out.println("O sapo " + this.sapoNome + " com id " + this.identification + " nao conseguiu pular");
//			}

		}
		
		a++;
		this.positions = a;
//		System.out.println("O sapo " + this.sapoName + " com a id " + this.identification + " terminou em " + this.positions + "° lugar");
		
	}
	
	
	
	//cada sapo pula de 0m a 10m
	//Distancia maxima é de 40m
	//Identificação do pulo de cada sapo
	//Cada sapo tem uma classificação
	
	
}
