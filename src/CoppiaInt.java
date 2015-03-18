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

	public void decrementa() throws Exception{
		if (occorrenze < 1) throw new Exception("non si dovrebbe fare");
		else occorrenze--;
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