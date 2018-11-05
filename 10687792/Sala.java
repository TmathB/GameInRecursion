package robo;


public class Sala implements ISala {
		
		public int x = 0;
		public int y = 0;
		public int [][] tab;    

		
		
		public Sala(){
			this.tab = new int[TAMANHO_SALA][TAMANHO_SALA];
		}
    
        public boolean areaArmazenagem(int i, int i1){
			if((i == 0 || i == 1 )&&( i1 == 0 || i1 == 1 )){
				return true;
			}
			return false;
        }
   
        public int marcadorEm(int i,int i1){
			
			return tab[i][i1];
			
        }
        public boolean	marcaPosicaoArmazenagem(int i, int i1){// COLOCAR NO FOR
			if(tab[i][i1]!= BLOCO_PRESENTE  ){
				
				this.tab[i][i1] = BLOCO_PRESENTE;
				return true;
			}
			
		
            return false;
			
        }
        public boolean	marcaPosicaoBusca(int i, int i1, int i2){
			if(i >= 0 && i <= TAMANHO_SALA-1 && i1 >= 0 && i1 <= TAMANHO_SALA-1 && this.tab[i][i1] ==POSICAO_VAZIA){
				tab[i][i1] = i2;
				return true;
			}
			return false;
        }
        public boolean	posicaoBuscaValida(int i, int i1){
			if(i >= 0 && i <= TAMANHO_SALA-1 && i1 >= 0 && i1 <= TAMANHO_SALA-1 /*&&( tab[i][i1] == POSICAO_VAZIA || tab[i][i1]==BLOCO_PRESENTE&& tab[i][i1] != OBSTACULO_PRESENTE*/ &&tab[i][i1] != MARCA_PRESENTE)	
				return true;
			else
				return false;
        }
        public void removeMarcador(int k){
			for(int i = 0 ; i<tab.length ;i++){
					for(int j = 0; j<tab[i].length ; j++){
						if(tab[i][j] == k){
							removeMarcador(i,j);
					}
				}
			}
               
        }
        public void removeMarcador(int i, int i1){
			if(tab[i][i1] != OBSTACULO_PRESENTE && i >= 0 && i <= TAMANHO_SALA-1 && i1 >= 0 && i1 <= TAMANHO_SALA-1){
				tab[i][i1] = 0;
			}
        }
        

}
