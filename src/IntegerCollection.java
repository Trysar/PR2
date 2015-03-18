public interface IntegerCollection {
   // Commenti opportuni

   //EFFECTS: Restituisce il numero delle occorrenze dell'elemento passato
	//THROWS: NaI exception se non è un integer?
   public int occurrences(Integer elem);
   

   public int size( );
   
   //Overview: inserisce l'elemento passato, semplicemente
   
   public void insert(Integer elem);
   
   //Overview: restituisce l'elemento con il maggior numero di occorrenze e lo elimina dalla collection
   public Integer extractMax( ) throws Exception;


   
   // Altri metodi per operare sulla classe
}