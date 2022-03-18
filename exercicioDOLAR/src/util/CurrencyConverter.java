package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convercao(double dolar, int quantidade ) {
		double x =  dolar * quantidade;
		double c = x * IOF;
		 x = c + x;
		 return x;
	}
}
