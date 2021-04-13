package Lab03;

public class Alegrando {
	int tam_aquario, lombriga, pos_ini,tam_string, acao_atual=0;
	String animacao, aux, animacao_rv, aquario;
	Lombriga lomb_atual;
	Alegrando(String animacao){
		animacao_rv = animacao;
		aux = animacao.substring(0,2);
		tam_aquario = Integer.parseInt(aux);
		aux = animacao.substring(2,4);
		lombriga = Integer.parseInt(aux);
		aux = animacao.substring(4,6);
		pos_ini = Integer.parseInt(aux);
		this.animacao = animacao.substring(6);
		System.out.println("passa como parametro " + animacao_rv);
		lomb_atual = new Lombriga(tam_aquario, lombriga, pos_ini);
	}
	
	String apresenta(){
		return lomb_atual.aquario;
	}
	
	void passo() {
			switch(animacao.charAt(acao_atual)) {
			case 'C' : lomb_atual.crescer();break;
			case 'M' : lomb_atual.mover();break;
			case 'V' : lomb_atual.virar();break;
			}
			acao_atual++;
			System.out.println("passo - executa primeira ação " + animacao.charAt(acao_atual-1));
		}
	}


