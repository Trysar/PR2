public class EmptyCollectionException extends Exception {
	public EmptyCollectionException(){
		super("eccezione generica Collezione vuota");
	}

	public EmptyCollectionException(String msg){
		super(msg);
	}
}