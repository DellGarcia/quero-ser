package utils;

public class ResponseStucture {
	public static final String SALES_CHANNEL_STRUCTURE = 
			"Quantidades de Vendas por canal\n"
			+ "\n"
			+ "1 - Representantes			%d\n"
			+ "2 - Website					%d\n"
			+ "3 - App m�vel Android		%d\n"
			+ "4 - App m�vel iPhone		%d\n";
	
	public static final String TRANSFER_HEADER = 
			String.format("Necessidade de Transfer�ncia Armaz�m para CO\n\n"
			+ "%-8s\t%-8s\t%-8s\t%-8s\t%-8s\t%-8s\t%-8s\n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\t%-8s\t\t\t\t%-8s\n",
			
			"Produto", "QtCO", "QtMin", "QtVendas", "Estq.ap�s", "Necess.", "Transf. de", "Vendas", "Arm p/ CO");
}
