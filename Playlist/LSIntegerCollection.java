
import java.util.Vector;
public class LSIntegerCollection implements IntegerCollection {


	//Invariante di Rappresentazione:
    // per ogni i=0..elementi.size => 	elementi(i) != null &&
    // card = somma(elementi(i).occorrenze) &&
    // i!=j => elementi(i).numero != elementi(j).numero &&
    // elementi(i).occorrenze > 0;




	private Vector<CoppiaInt> elementi;
	private int card;

	LSIntegerCollection(){
		elementi = new Vector<CoppiaInt>();
		card=0;
	}

	public int occurrences(Integer elem)throws VoidIntegerException{
		if(elem==null)throw new VoidIntegerException("occurrences");
		
		int i=0;
		while(i<elementi.size()){
			if (elementi.elementAt(i).getNumero()==elem.intValue()) return elementi.elementAt(i).getOccorrenze();
			i++;
		}
		return 0;
	}

	public int size(){
		return card;
	}

	public void insert(Integer elem) throws VoidIntegerException{
		if(elem==null)throw new VoidIntegerException("occurrences");

		int ind;

		try {ind=trovaIndice(elem);} catch (Exception e){
			// non esisteva l'elemento
			CoppiaInt n = new CoppiaInt(elem.intValue());
			elementi.add(n);
			card++;
			return;
		}

		elementi.elementAt(ind).incrementa();
		card++;
		return;

	}

	public Integer extractMax() throws EmptyCollectionException{
		if (card==0 || elementi.size()<1) throw new EmptyCollectionException("extract max");

		int indmax=0;
		int i=0;

		while(i<elementi.size()){
			//non è il massimo dell'efficienza o dell'eleganza, ma ci penserà il compilatore a sistemare le cose(?forse?)
			if (elementi.elementAt(i).getOccorrenze()>elementi.elementAt(indmax).getOccorrenze()) indmax=i;
			i++;
		}
		
		//se c'è solo un elemento è anche quello da scegliere

		Integer max = new Integer(elementi.elementAt(indmax).getNumero());
		int ris=0;
		try{
			 ris=elementi.elementAt(indmax).decrementa();

		}catch (Exception e){
			throw new RuntimeException("qualcosa di molto brutto è successo D:");
		}
		if(ris==0) elementi.remove(indmax);
		card--;

		return max;

	}





	private int trovaIndice(Integer elem) throws Exception{
		if(elem==null) throw new Exception();

		int i=0;
		while(i<elementi.size()){
			if (elementi.elementAt(i).getNumero()==elem.intValue()) return i;
			i++;
		}
		//ricordarsi di catturare l'eccezione
		throw new Exception("eccezione checked per quando non esiste l'elemento cercato");
	}




	public boolean repok(){
		
		if (card==0 && elementi.size()==0) return true;

		CoppiaInt el=null;
		int c=0;
		for(int i = 0; i<elementi.size();i++){
			el=elementi.elementAt(i);
			if (el==null){ 
				System.out.println("el==null");
				return false;}
			if (el.getOccorrenze()<=0) {
				System.out.println("occorrenze negative");
				return false;}
			c=c+ el.getOccorrenze();
		}
		if(c!=card){
			System.out.println("cardinalità inconsistente");
			return false;}

		System.out.println("REPOK");
		return true;

	}
}