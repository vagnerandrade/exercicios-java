package entities;

public class Aluno {
	
	public String nome;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	
	public Double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public Double pontosfaltantes() {
		if (notaFinal() <60.0) {
			return 60.0 - notaFinal();
		}else {
			return 0.0;
		}
		
	}
	
}
