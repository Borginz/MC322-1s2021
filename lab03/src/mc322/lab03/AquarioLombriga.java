package Lab03;

public class AquarioLombriga{
    int pos_ini,cabeca,tam_aquario,lombriga, lado = 0;
    String aquario;
    
    AquarioLombriga(int tam_aquario, int lombriga, int pos_ini){
        this.tam_aquario = tam_aquario;
        this.lombriga = lombriga;
        this.pos_ini = pos_ini-1;
         aquario = "";
        for(int i = 0; i < this.tam_aquario; i++) {
        	aquario = aquario +"#";
        }
        cabeca = this.pos_ini + this.lombriga - 1;
        
        char[] ch = aquario.toCharArray();
        ch[cabeca] = 'O';
        for(int i = this.pos_ini; i < cabeca;i++) {
        	ch[i] = '@';
        	
        }
  
        aquario = String.valueOf(ch);
    }
    
    void crescer(){
    	char[] ch = aquario.toCharArray();
    	if(lado == 0) {
    		if (pos_ini > 0) {
        		ch[pos_ini-1] = '@';
        		pos_ini--;
        		lombriga++;
        	} else {
        		System.out.println("Não pode crescer");
        	}
        	aquario = String.valueOf(ch);
    	}else {
    		if ( pos_ini < tam_aquario-1) {
    			ch[pos_ini+1] = '@';
    			pos_ini++;
    			lombriga++;
    		} else {
    			System.out.println("Não pode crescer");
    		}
    	}
    	
 
    	aquario = String.valueOf(ch);	
    }
    void mover(){
    	char[] ch = aquario.toCharArray();
    	if(lado == 0) {
    		if(cabeca != tam_aquario-1) {
    			ch[cabeca+1] = 'O';
    			ch[cabeca] = ch[cabeca-1];
    			ch[pos_ini] = '#';
    			pos_ini++;
    			cabeca++;
    			aquario = String.valueOf(ch);
    			
    		} else {
    			virar();
    		}
    		
    	} else if (lado == 1) {
    		if(cabeca !=0) {
    			ch[cabeca-1] = 'O';
    			ch[cabeca] = ch[cabeca+1];
    			ch[pos_ini] = '#';
    			pos_ini--;
    			cabeca--;
    			aquario = String.valueOf(ch);
    		}else {
    			virar();
    		}
    		
    	}
    	
    	
    	
    	
    }
    void virar(){
    	char[] ch = aquario.toCharArray();
    	char aux_char = ch[pos_ini];
    	ch[pos_ini] = ch[cabeca];
		ch[cabeca] = aux_char;
		int aux = pos_ini;
		pos_ini = cabeca;
		cabeca = aux;
		if(lado == 1) {
			lado = 0;
		}else {
			lado = 1;
		}
		aquario = String.valueOf(ch);
    }
 
    String apresenta(){
    	return aquario;
    
    }
}