package robo;

/*********************************************************************/
/** ACH 2002 - Introducao à Análise de Algoritmos                   **/
/** EACH-USP - Segundo Semestre de 2018                             **/
/**                                                                 **/
/** <nome do(a) aluno(a)>  Matheus Barbosa <numero USP> 10687792    **/
/**                                                                 **/
/*********************************************************************/

/**
	Classe que implementa os movimentos do robô.
*/
public class Robo implements IRobo {
	int[] dx = {0, 1,0,-1}; //Tentativas que o robo pode andar ao redor de si mesmo.
    int[] dy = {1, 0,-1,0};
	
	int coletados = 0; // Marcador para blocos coletados.
 
	int qtdeBlo = 0; // Marcador para quantidade de blocos inserido.
	int qtdeObs = 0; // Marcador para obstaculos de blocos inserido.
    int j = 1; // Marcador para quantidade de vezes que o robo ja andou.
	int ao = 0;
	
    public boolean buscaBloco(int i, int i1){
		
		
		int u,v; //Definem nova posição de busca
		int k = 0; //Tentaiva para os lados
		
		boolean feito = false;
		
		while(k<4){
			
			
			
			u = i + dx[k]; // Soma a tentativa para o robo ir para o lado
			v = i1 + dy[k];// Soma a tentativa para o robo ir para o lado
			
			
			
			
			if(S.posicaoBuscaValida(u,v)&& !S.areaArmazenagem(u, v)){ // Verifica se a busca é valida para entrar no laço
			
					j++; //Acrescenta uma posição andada pelo robo
					
					if(S.tab[u][v] == ISala.OBSTACULO_PRESENTE){ // Verifica se tem obstaculo presente
						
			
						mensageiro().mensagem(Mensageiro.OBSTACULO,u,v); 
						/** Volta a posição caso tenha obstaculo **/
						u = i; 
						v = i1;
						
					}else{
					
							if(S.tab[u][v] == ISala.BLOCO_PRESENTE){ // Verifica se tem bloco presensa
						
							S.tab[u][v] = ISala.POSICAO_VAZIA; // Marca posição como vasia
							
							//S.marcaPosicaoBusca(u,v,ISala.MARCA_PRESENTE);
							
							mensageiro().mensagem(Mensageiro.BUSCA,u,v); // Gera uma mensagem de busca
							mensageiro().mensagem(Mensageiro.CAPTURA,u,v);// Gera uma mensagem de captura
							
							
			
							
							return true; // Retorna o true para e dessa forma retorna tambem para todas chamadas recursivas
						}else{
						
							S.marcaPosicaoBusca(u,v,ISala.MARCA_PRESENTE); //Marca a casa como presente
							mensageiro().mensagem(Mensageiro.BUSCA,u,v); //Registra no mensageiro
							
							feito = buscaBloco(u, v); //Passo recursivo para a proxima busca caso não achou bloco nem obstaculo
						}
						if (feito) { // Se feito retona true altomaticamente vai retornando as casas
							
							mensageiro().mensagem(Mensageiro.RETORNO,u,v);
							S.removeMarcador(u, v); // Vai removendo enquanto vai retornando
							
							return true;	
						
						}
					}
			
			}
			k++; // Tenta outro lado para o robo tentar ir
		}
		return false;
    };

    public boolean guardaBloco(){
		
		
		if(S.marcadorEm(0,0) == ISala.POSICAO_VAZIA){//Verifica a primeria posição se esta livre e guarda o bloco
			S.marcaPosicaoArmazenagem(0,0);
			mensageiro().mensagem(Mensageiro.ARMAZENAGEM,0,0);
			return true; 
		}else if(S.marcadorEm(1,0) == ISala.POSICAO_VAZIA){ // Verifica a segunda posição se esta livre e guarda o bloco e gera mensageiro
			S.marcaPosicaoArmazenagem(1,0);
			mensageiro().mensagem(Mensageiro.ARMAZENAGEM,1,0);
			return true;
		}
		else if(S.marcadorEm(0,1) == ISala.POSICAO_VAZIA){// Verifica a terceira posição se esta livre e guarda o bloco e gera mensageiro
			S.marcaPosicaoArmazenagem(0,1);
			mensageiro().mensagem(Mensageiro.ARMAZENAGEM,0,1);
			return true;
		}
		else if(S.marcadorEm(1,1) == ISala.POSICAO_VAZIA){// Verifica a quarta posição se esta livre e guarda o bloco e gera mensageiro
			S.marcaPosicaoArmazenagem(1,1);
			mensageiro().mensagem(Mensageiro.ARMAZENAGEM,1,1);
			return true;
		}
        return false;
    };
	
	/** Adiciona obstaculos a sala */
	
    public void adicionaObstaculo(int i, int i1){
		 qtdeObs++; // Adicina ao marcador quando um obstaculo foi adicionado
		 S.marcaPosicaoBusca(i,i1,ISala.OBSTACULO_PRESENTE); // Marca na sala onde obstaculo é inserido
    };
	
	/** Adiciona Blocos a sala */

    public void adicionaBloco(int i, int i1){
		 qtdeBlo++; // Adiciona ao marcador quando um Bloco foi adicionado
         S.marcaPosicaoBusca(i,i1,ISala.BLOCO_PRESENTE);// Marca na sala onde Bloco é inserido
    };
	
	/** Nova busca */
	
    public void novaBusca(){
        S.removeMarcador(ISala.MARCA_PRESENTE);
    };
	
	/** Busca blocos até que todos sejam achados ou tenha andado pelo tabuleiro inteiro */
	
    public void buscaBlocos(){
		
		int k = 100;
		boolean achar = coletados < N_BLOCOS;
		
		
		do{	
			
			achar = buscaBloco(x,1);
				
			
			if(achar){ //Condicao que determina até quando tiver posições para correr e blocos validos
				
				/**Verifica se quantidade de casas andadas**/
				
				if(j>100)
					k = 200;
				if(j>150)
					k = 250;
				if(j>200)
					k = 300;
				if(j>300)
					k = 350;
					
				S.removeMarcador(ISala.MARCA_PRESENTE);
					
				mensageiro().mensagem(Mensageiro.RETORNO,x,y);
					
				guardaBloco();
				coletados ++;
					
			}else{
				
				break;
					
			}
				
		}while((j< k)&& S.tab[1][1] != ISala.BLOCO_PRESENTE );
		
		/*manda o mensageiro para respectivo status de busca*/
		
		if(achar){
			mensageiro().msgFim();
		}	
		else{
			mensageiro().msgNaoAchou();
		}
    }; 
	
	/** Coordenada x de início da busca */
	private static int x = ISala.X_INICIO_ARM;
	
	/** Coordenada y de início da busca */
	private static int y = ISala.Y_FIM_ARM+1;
	
	public Mensageiro mensageiro ; 
	
	public Sala S ;
	
	/** Construtor do robo que inicializa a sala e o mensageiro */
	
	public Robo() {
		this.S = new Sala();	
		this.mensageiro = new Mensageiro();
	}
	/**
	
		Retorna instância do mensageiro do robô
	*/
	public Mensageiro mensageiro() {
		return(this.mensageiro);
	}
}
