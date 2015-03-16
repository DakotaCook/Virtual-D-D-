
public class main {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){
			Character temp = new Character();
			System.out.println("\n"+(i+1)+") "+temp.toString());
		}
		System.out.println("\nStarting Items:");
		for(int j = 0; j < 5; j++){
			Item item = new Item(0);
			System.out.println(j+1+") "+item.getName());
		}

	}

}
