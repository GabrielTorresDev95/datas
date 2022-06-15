package Produtos;

public class DataTeste {
		
	int dia;
	int mes;
	int ano;
	
	DataTeste () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	DataTeste(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
	
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void imprimirDataFormatada () {
		System.out.println(obterDataFormatada());
	}
}

