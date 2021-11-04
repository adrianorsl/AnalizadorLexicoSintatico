
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lista = {"Program", "1254", "12.254", "teste", "'olá'", "AA_45", "ADES_", "_hdishd"}; 
		String resultado;
		
		Palavra verificar = new Palavra();
		
		for (int i = 0; i < lista.length; i++ ) {
			 verificar.setPalavra(lista[i]);
			 resultado = verificar.verificador(verificar.getPalavra());
			 System.out.println(resultado);
			
		}
	}

}
