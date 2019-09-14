
public class BinaryDisplayTree {

	static int treeNumb = 7;

	public BinaryDisplayTree(int treeNumb) {
		this.treeNumb = treeNumb;
	}

	public static void displayTree() {

		// vertical loop
		for (int i = 0; i < treeNumb; i++) {

		int spaces= treeNumb - i;
			for(int j=0; j<spaces; j++){
				System.out.print("-");
			}
			
			int holder = 1;
			
			for(int k=0; k<i;k++){
				
			System.out.print(i);
			
			if (holder<=i){
				
				System.out.print("-");
				holder++;
			}
			}
			
			for(int j=0; j<spaces; j++){
				System.out.print("-");
			}
			
			
			System.out.println();
			
			
		}

	}

	public static void main(String[] args) {
		displayTree();
	}

}
