
public class Palavra {

	
	private String palavra;
	
	final String[] palavrasReservadas = {"Program", "Var", "Begin", "End",
			"While", "Do", "For", "To", "If", "Then", "Else", "Repeat", "Until"};
	final char[] letra = {'a','A', 'b','B', 'c','C', 'd','D', 'e','E', 'f','F', 'g','G', 'h','H', 'i','I', 'j','J', 'k','K', 'l','L', 'm','M', 'n','N', 'o','O', 'p','P', 'q','Q', 
			'r','R', 's','S', 't','T', 'u','U', 'v','V', 'w','W', 'x','X', 'y','Y', 'z','Z'};

	public Palavra(String palavra) {
		this.palavra = palavra;
	}
	
	public Palavra() {
		
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String[] getPalavrasReservadas() {
		return palavrasReservadas;
	}

	public String verificador(String palavra) {
		String aux = getPalavra();
		String resultado = "";
		boolean contadorReal = false;
		boolean checar = false;
		int contador = 0;
		for (int i = 0; i < palavrasReservadas.length; i++) {
			if (aux == palavrasReservadas[i]) {
				resultado = aux + " é uma Palavra Reservada. \n";
				checar = true;
			}
		}
		if(checar == false) {
			if(aux.charAt(0) == '\'') {
				if(aux.charAt(aux.length() - 1) == '\'') {
					resultado = getPalavra() + " é Literal \n ";
					return resultado;
				}
			}else if (aux.charAt(0) == '"') {
				if(aux.charAt(aux.length() - 1) == '"') {
					resultado = aux + " é Literal \n ";
				}
			}else if ((aux.charAt(0) == '0') || (aux.charAt(0) == '1') || (aux.charAt(0) == '2')|| (aux.charAt(0) == '3') || (aux.charAt(0) == '4') || (aux.charAt(0) == '5') || (aux.charAt(0) == '6')|| (aux.charAt(0) == '7')
						|| (aux.charAt(0) == '8') || (aux.charAt(0) == '9')) {
				for(int i = 0; i < aux.length(); i++ ) {
					if ((aux.charAt(i) == '0') || (aux.charAt(i) == '1') || (aux.charAt(i) == '2')|| (aux.charAt(i) == '3') || (aux.charAt(i) == '4') || (aux.charAt(i) == '5') || (aux.charAt(i) == '6')|| (aux.charAt(i) == '7')
							|| (aux.charAt(i) == '8') || (aux.charAt(i) == '9')) {
						contador += 1;
					}else if (aux.charAt(i) == '.') {
						contadorReal = true;
						contador += 1;
					}
				}
				if (contador == aux.length()) {
					if(contadorReal == true) {
						resultado = aux + " é Real \n";
						return resultado;
					}else {
						resultado = aux + " é Inteiro \n";
						return resultado;
					}
				}
			}else {
				boolean x = false;
				for (int i = 0; i < letra.length; i++) {
					if(aux.charAt(0) == letra[i]) {
						if(aux.charAt(aux.length() - 1) == '_') {
							resultado = aux + " não reconhecido. \n";
							x = true;
							return resultado;
						}else {
							resultado = aux + " é uma Variável. \n";
							x = true;
							return resultado;
						}
					}else if (x == false) {
						resultado = aux + " não reconhecido. \n";
						 
					}
				}
			}
		}else {
			return resultado;
		}
		return resultado;
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Palavra [palavra=");
		builder.append(palavra);
		builder.append("]");
		return builder.toString();
	}
	
	
}
