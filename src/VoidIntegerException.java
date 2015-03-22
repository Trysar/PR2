public class VoidIntegerException extends Exception {
	public VoidIntegerException(){
		super("eccezione generica Integer non inizializzato");
	}

	public VoidIntegerException(String msg){
		super(msg);
	}
}