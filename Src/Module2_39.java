
public class Module2_39 {

	public enum Dogs {collie, harrier, shepherd};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog)
		{
		case collie:
			System.out.print("collie");
			//break;
		case default:
			System.out.print("retriever");
            //break;
		case harrier:
			System.out.print("harrier");
			//break;
			
		}

	}

}
