package exceptions;

public class NegativeNumberException extends Exception{
	public NegativeNumberException (String name, String weight) {
		super ("Est� intentando usar un n�mero negativo  \"" + weight + "\"  para el peso del ingrediente " + name);
	}
}
