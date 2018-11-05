import robo.*;

/*
	Classe para testes com o robô
*/
public class TestaRoboOutrosTestes {
	/*
		Testes com o robô
	*/
	public static void main(String[] args) {
		/* teste 1 - OK
		IRobo robo = new Robo();
		
		robo.adicionaObstaculo(1,2);
		robo.adicionaObstaculo(1,3);
		robo.adicionaObstaculo(1,4);
		robo.adicionaObstaculo(1,5);
		robo.adicionaObstaculo(1,6);
		robo.adicionaObstaculo(1,7);
		robo.adicionaObstaculo(1,8);
		robo.adicionaObstaculo(2,8);
		robo.adicionaObstaculo(3,8);
		robo.adicionaObstaculo(4,8);
		robo.adicionaObstaculo(5,8);
		robo.adicionaObstaculo(6,8);
		robo.adicionaObstaculo(7,8);
		robo.adicionaObstaculo(9,9);
		robo.adicionaObstaculo(8,7);
		robo.adicionaObstaculo(7,6);
		robo.adicionaObstaculo(7,5);
		robo.adicionaObstaculo(7,4);
		robo.adicionaObstaculo(7,3);
		robo.adicionaObstaculo(9,5);
		robo.adicionaObstaculo(8,3);
		robo.adicionaObstaculo(8,2);
		robo.adicionaObstaculo(8,1);
		robo.adicionaObstaculo(7,1);
		robo.adicionaObstaculo(6,1);
		robo.adicionaObstaculo(5,1);
		robo.adicionaObstaculo(5,2);
		robo.adicionaObstaculo(4,2);
		robo.adicionaObstaculo(3,2);
		robo.adicionaObstaculo(3,1);
		robo.adicionaObstaculo(2,4);
		robo.adicionaObstaculo(3,4);
		robo.adicionaObstaculo(4,4);
		robo.adicionaObstaculo(5,4);
		robo.adicionaObstaculo(5,5);
		robo.adicionaObstaculo(5,6);
		robo.adicionaObstaculo(4,6);
		robo.adicionaObstaculo(3,6);
		//38 obstáculos
		
		robo.adicionaBloco(4,5);
		robo.adicionaBloco(4,1);
		robo.adicionaBloco(7,7);
		robo.adicionaBloco(7,2);
		//4 blocos
		
		robo.buscaBlocos(); 
		robo.mensageiro().imprimeMensagens(); //*/
		
	
		/* teste 2 - Bloco isolado por obstáculos
		IRobo robo = new Robo();
		
		robo.adicionaObstaculo(1,3);
		robo.adicionaObstaculo(1,4);
		robo.adicionaObstaculo(1,5);
		robo.adicionaObstaculo(1,6);
		robo.adicionaObstaculo(1,7);
		robo.adicionaObstaculo(1,8);
		robo.adicionaObstaculo(1,9);
		robo.adicionaObstaculo(3,3);
		robo.adicionaObstaculo(3,4);
		robo.adicionaObstaculo(3,5);
		robo.adicionaObstaculo(3,6);
		robo.adicionaObstaculo(3,7);
		robo.adicionaObstaculo(3,8);
		robo.adicionaObstaculo(3,9);
		robo.adicionaObstaculo(5,3);
		robo.adicionaObstaculo(5,4);
		robo.adicionaObstaculo(5,5);
		robo.adicionaObstaculo(5,6);
		robo.adicionaObstaculo(5,7);
		robo.adicionaObstaculo(5,8);
		robo.adicionaObstaculo(5,9);
		robo.adicionaObstaculo(7,5);
		robo.adicionaObstaculo(7,6);
		robo.adicionaObstaculo(7,7);
		robo.adicionaObstaculo(7,8);
		robo.adicionaObstaculo(7,9);
		robo.adicionaObstaculo(9,9);
		robo.adicionaObstaculo(9,7);
		robo.adicionaObstaculo(9,5);
		robo.adicionaObstaculo(9,3);
		robo.adicionaObstaculo(9,1);
		robo.adicionaObstaculo(8,3);
		robo.adicionaObstaculo(7,3);
		robo.adicionaObstaculo(8,1);
		robo.adicionaObstaculo(6,0);
		robo.adicionaObstaculo(6,1);
		robo.adicionaObstaculo(5,1);
		robo.adicionaObstaculo(4,1);
		robo.adicionaObstaculo(3,1);
		robo.adicionaObstaculo(2,1);
		//40 obstáculos
		
		robo.adicionaBloco(0,2);
		robo.adicionaBloco(9,2);
		robo.adicionaBloco(9,0);
		robo.adicionaBloco(3,0);
		//4 blocos com 1 bloqueado
		
		robo.buscaBlocos(); 
		robo.mensageiro().imprimeMensagens(); //*/
		
		
		/* teste 3 - Número inferior de blocos
		IRobo robo = new Robo();
		
		robo.adicionaObstaculo(0,3);
		robo.adicionaObstaculo(1,3);
		robo.adicionaObstaculo(1,4);
		robo.adicionaObstaculo(2,1);
		robo.adicionaObstaculo(7,0);
		robo.adicionaObstaculo(7,1);
		robo.adicionaObstaculo(8,1);
		//7 obstáculos
		
		robo.adicionaBloco(0,4);
		robo.adicionaBloco(2,0);
		robo.adicionaBloco(8,0);
		//3 blocos
		
		robo.buscaBlocos(); 
		robo.mensageiro().imprimeMensagens(); //*/
		
		
		///* teste 4 - OK
		IRobo robo = new Robo();
		
		robo.adicionaObstaculo(0,3);
		robo.adicionaObstaculo(0,6);
		robo.adicionaObstaculo(1,4);
		robo.adicionaObstaculo(2,5);
		robo.adicionaObstaculo(3,6);
		robo.adicionaObstaculo(4,7);
		robo.adicionaObstaculo(5,8);
		robo.adicionaObstaculo(2,1);
		robo.adicionaObstaculo(8,4);
		//7 obstáculos
		
		robo.adicionaBloco(0,2);
		robo.adicionaBloco(0,4);
		robo.adicionaBloco(2,2);
		robo.adicionaBloco(7,2);
		//4 blocos
		
		robo.buscaBlocos(); 
		robo.mensageiro().imprimeMensagens(); //*/
	}
}