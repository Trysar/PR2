
public class Test{

	public static void main(String[] args){
		LSIntegerCollection t= new LSIntegerCollection();

		try{
			t.insert(43);
			t.repok();
			t.insert(42);
			t.insert(42);
			
			t.insert(43);
			System.out.println ( "t.size-"+t.size());
			
			
			
			t.extractMax();
			t.extractMax();
			t.extractMax();
			t.extractMax();
			t.insert(42);
			t.repok();
			System.out.println(t.size());
			System.out.println(t.occurrences(42));
			



		}catch (Exception e){
			System.out.println("eccezziune!"+e);

		}

		System.out.println("OK!");

	}



}