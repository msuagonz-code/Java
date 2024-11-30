package clases;

public class Parametros {

	/* Nombres de Parametros
	 * Cuando se declara un parametro en un metodo o constructor se provee un nombre a este parámetro
	 * con el que se hace referencia en el cuerpo del método/contructor.
	 * 
	 * El nombre del parámetro debe ser único dentro de su ámbito (El término scope lo traduciré como ambito, y se refiere 
	 * a un trozo de código que está encerrado un bloque {}), no se puede llamar igual que otro parámetro o que otra
	 * variable local (), dentro del método o constructor que se está declarando
	 * 
	 * Un parametro, puede llamarse igual que un miembro de clase, en dado caso se dice que el parametro opaca el nombre del
	 * miembro de clase, y para poder acceder al miembro de clase se debe usar la palabra clave this
	 * 
	 * */
	
	public String miembro = "yo soy un miembro de clase";
	
	public Parametros(String miembro) {//El parámetro se llama igual que el miembro de clase
		
		System.out.println("Valor del parametro: " + miembro);//Se hace referencia a la variable parametros
		
	}
	
	public String getMiembro() {
		return this.miembro;
	}
	
	public void parametroPorValor(int parametro) {
		
		parametro = parametro + 5;
		
	}
	
	public void metodoSuma(Objeto paramObjeto) {
		paramObjeto.setVariable1(5);
		paramObjeto.setVariable2(5);
		paramObjeto.setResultado(paramObjeto.getVariable1() + paramObjeto.getVariable2());
	}

}
