public interface IntegerCollection {
   // Commenti opportuni

   




   //OVERVIEW: Conta e restituisce quante vole occorre elem nella collezione
   //EFFECTS: Restituisce il numero delle occorrenze dell'elemento passato
   //MODIFY: nulla
	//THROWS: VoidInteger exception se elem non è un integer inizializzato
   public int occurrences(Integer elem) throws VoidIntegerException;
   
   //OVERVIEW: conta il numero di elementi totale della collezione, zero per la collezione vuota
   public int size( );
   
   //OVERVIEW: Inserisce il numero intero descritto da elem nella collezione, indipendentemente dal fatto che esista già o no.
   //THROWS: VoidInteger exception se elem non è un integer inizializzato
   public void insert(Integer elem) throws VoidIntegerException;
   
   //OVERVIEW: Individua uno qualsiasi degli elementi che compare il maggior numero di volte, lo estrae dalla collezione e lo restituisce
   //MODIFY: rimuove un elemento dalla collezione. se non è vuota
   //THROWS: EmptyCollection exception se si tenta di estrarre da collezione vuota
   public Integer extractMax( ) throws EmptyCollectionException;

   //OVERVIEW: controlla che l'invariante di rappresentazione sia rispettato, restituisce l'esito
   public boolean repok();
   
}