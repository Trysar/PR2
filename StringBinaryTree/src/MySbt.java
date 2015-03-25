public class StringBinaryTree{
/*

*/
	private string val;
	private StringBinaryTree parent;
	private StringBinaryTree left, right;
	//tipo di figlio, destro= 1, sinistro = -1 
	private int type;

	public StringBinaryTree(){
		val=null;
		parent=null;
		left=null;
		right=null;
	}

	public StringBinaryTree(String value){
		this();
		//copyin?
		this.val=new String(value);
	}

	public StringBinaryTree(String value, StringBinaryTree left, StringBinaryTree right){
		this(value);

		/* 
		Forse sarebbe più corretto fare una copia dgli alberi figli, per evitare modifiche laterali
		ma sarebbe necessario almeno un metodo visitatore privato(non considero l'uso di handle readonly per il
		discorso dell'esposizione di stato).
		Quindi per ora usiamo quelli passati e speriamo bbbbene
		*/
		this.left=left;
		this.right=right;
	}

	public StringBinaryTree getLeft(){
		// come sopra, una copia sarebbe più adatta, ma anche parecchio più complicata
		return left;
	}

	public StringBinaryTree getRight(){
		return right;
	}

	public StringBinaryTree getParent(){
		return parent;
	}

	public void setLeft(StringBinaryTree newLeft){
		left= newLeft;
		left.setType(-1);

	}

	public void setRight(StringBinaryTree newRight){
		right=newRight;
		right.setType(1);
	}

	public void setParent(StringBinaryTree newParent){
		parent=newParent;
	}

	public boolean isRightChild(){
		return (this.getType()==1);
	}

	public boolean isLeftChild(){
		return (this.getType()==-1);
	}

	public String value(){
		return new String(val);
	}

	public void setValue(String value){
		val= new String(value);
	}




	private void setType(int t){
		type=t;
	}

	private int getType(){
		return type;
	}
}