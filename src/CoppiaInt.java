public class CoppiaInt{
	private int numero;
	private int occorrenze;

	CoppiaInt(Integer n){
		numero=n.intValue();
		occorrenze=1;
	}

	public void incrementa(){
		occorrenze++;
	}

	public int decrementa() throws Exception{
		if (occorrenze <= 0)throw new Exception("era l'ultimo elemento");
		occorrenze--;
		return occorrenze;
	}

	public int getOccorrenze(){
		return occorrenze;
	}

	public int getNumero(){
		return numero;
	}

	public boolean numUguale(Integer elem){
		if (elem.intValue()==numero) return true;
		else return false;

	}

}