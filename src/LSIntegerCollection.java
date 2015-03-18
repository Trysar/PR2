import java.util.Vector;
public class LSIntegerCollection implements IntegerCollection {

	private Vector<CoppiaInt> elementi;
	private int card;

	LSIntegerCollection(){
		elementi = new Vector<CoppiaInt>();
		card=0;
	}

	public int occurrences(Integer elem){
		int i=0;
		while(i<elementi.size()){
			if (elementi.elementAt(i).numUguale(elem)) return elementi.elementAt(i).getOccorrenze();
			i++;
		}
		return 0;
	}

	public int size(){
		return card;
	}

	public void insert(Integer elem){
		int ind;
		try {ind=trovaIndice(elem);} catch (Exception e){
			// non esisteva l'elemento
			CoppiaInt n = new CoppiaInt(elem.intValue());
			elementi.add(n);
			card++;
			return;
		}

		elementi.elementAt(ind).incrementa();
		return;

	}

	public Integer extractMax() throws Exception{
		CoppiaInt max=null;
		int i=0;
		while(i<elementi.size()){
			if (elementi.elementAt(i).getOccorrenze()>max.getOccorrenze()) max=elementi.elementAt(i);
			i++;
		}
		if (max==null) throw new Exception("non si faaa!");

		return new Integer(max.getNumero());

	}





	private int trovaIndice(Integer elem) throws Exception{
		int i=0;
		while(i<elementi.size()){
			if (elementi.elementAt(i).numUguale(elem)) return i;
			i++;
		}
		//ricordarsi di catturare l'eccezione
		throw new Exception("eccezione checked per quando non esiste l'elemento cercato");
	}
}