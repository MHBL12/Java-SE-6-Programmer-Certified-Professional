
public enum Module2_37 {

	MR("Mr."), MRS("Mrs."), MS("Ms.");
	
	private final String title;
	private Module2_37(String t) { title = t;}
	public String format(String last, String first)
	{
		return title + " " + first + " " + last;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Module2_37.MR.format("Doe", "John"));

	}

}

