package controller;

import java.util.Random;

public class SapoControll 
{
	
	private String sapoName; //nome do sapo
	private int identification; //identificação do sapo
	private int meters = 0; //caminho andado do sapo
	public double positions; //posição final do sapo
	static int a = 0; //metodo para pegar a posiçãp do sapo
	
	
	public SapoControll(String nome, int num)
	{
		this.sapoName = nome;
		this.identification = num;
	}
	
	
	public void sapoCorrida() //a Thread inicia aqui
	{
		new Thread()
		{
			public void run() 
			{
				movimentoSapo();
			}
		}.start();
	}
	
	private void movimentoSapo() //movimentação do sapo, só termina quando chegar no while
	{
		Random dados = new Random(); 
		
//		int d2;
		int d10;
		
		while(this.meters < 30) //distancia da corrida
		{
//			d2 = dados.nextInt(2) + 1;		//o d2 eu utilizei para caso queira fazer uma brincadeira de ser 1/2 na corrida, caso sim ou caso não.
			
//			if(d2 == 1)
//			{
				d10 = dados.nextInt(11); //de 0m a 10m
				
				this.meters += d10; //metros percorridos
				System.out.println("E o sapo " + this.sapoName + " com id " + this.identification + " Pula " + d10 + "m");
//			}
//			else
//			{
//				System.out.println("O sapo " + this.sapoNome + " com id " + this.identification + " nao conseguiu pular");
//			}

		}
		
		a++;
		this.positions = a; //posição final do sapo, no caso o 'a' é uma static, utilizei ela para por achar a posição de cada sapo
		
	}
	
	public void classificacao() //metodo de printar a posição que está no private
	{
			System.out.println("O sapo " + this.sapoName + " com a id " + this.identification + " terminou em " + this.positions + "° lugar");
	}
	
	
	
	//cada sapo pula de 0m a 10m
	//Distancia maxima é de 30m
	//Identificação do pulo de cada sapo
	//Cada sapo tem uma classificação
	
	
}
