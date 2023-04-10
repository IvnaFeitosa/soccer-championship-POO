package campeonatoDeFutebol;

public class Clube {

	        //iniciando os atributos
			private String nome;
			private int pontos;
			private int saldoGols;
			
			
			//Criando um construtor para iniciar os atributos
			public Clube(String nome) {
				this.nome=nome;
				this.pontos=0;
				this.saldoGols=0;
			}
			
			//Criando os getters para poder acessar os atriobutos que são privados
			
			public String getNome() {
			    return nome;
			}
			public int getPontos() {
				return pontos;

			}
			public int getSaldoGols(){
				return saldoGols;
			}
			
			//Criando os métodos para incrementar os pontos e o saldo de gols de acordo com as regras do campeonato
			public void ganhar(int golsMarcados, int golsSofridos) {
				pontos += 3;
				saldoGols += golsMarcados - golsSofridos;
			}
			public void empatar() {
				pontos += 1;
			}
			public void perder(int golsMarcados, int golsSofridos) {
				saldoGols += golsMarcados - golsSofridos;
			}

}
