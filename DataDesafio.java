package Produtos;

public class DataDesafio {
	public static void main(String[] args) {
		DataTeste d1 = new DataTeste ();
		d1.ano = 2021;
		
		var d2 = new DataTeste(12, 9, 1975);

		
		
		System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
