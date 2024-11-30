package clases;

public class Objeto {

	private int variable1;
	private int variable2;
	private int resultado;
	
	public Objeto() {
		this.setVariable1(0);
		this.setVariable2(0);
		this.setResultado(0);
	}

	public int getVariable1() {
		return this.variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
	
	public int getResultado() {
		return this.resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "[variable1 = " + variable1 + " , variable2 = " + variable2 + " , resultado = " + resultado + " ]";
	}

}
