package controller;

public class SapoControll 
{
	
	private String sapoNome;
	private int identification;
	private int metros = 0;
	
	public SapoControll(String nome, int num)
	{
		this.sapoNome = nome;
		this.identification = num;
		
	}
	
	
	public void sapoCorrida()
	{
		new Thread()
		{
			public void run() 
			{
				
				
				
				
				
				
			}
		}.start();
	}
	
	
	
	//cada sapo pula de 0m a 100m
	//Distancia maxima é de 1000m
	//Identificação do pulo de cada sapo
	//Cada sapo tem uma classificação
	
	
}
