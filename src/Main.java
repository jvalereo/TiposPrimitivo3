import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Treinamento - Aula03, exercicio de fixa��o, tipo primitivos, string, char, int, double
		//Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo string, char, int , double
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		

		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Compucts:");
	    System.out.printf("%s, which price is $ %.2f%n", product1, price1);
	    System.out.printf("%s, which price is $ %.2f%n", product2, price2);
	    System.out.printf("%n");
	    System.out.printf("Record: %d, years old, code %d and %s%n", age, code, gender);
	    System.out.printf("%n");
	    System.out.printf("Measue with eight decimal place: %.8f%n", measure);
	    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
	    Locale.setDefault(Locale.US);
	    System.out.printf("US decimal point: %.3f%n",  measure);
	    
	    
	    // saida da aplica��o 

		
	    System.exit(0);
	    
	    //fim do programa

	}

}
