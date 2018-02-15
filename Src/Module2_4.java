
public class Module2_4 {
 private String desc;
 public String getDescription() {return desc;}
 public void setDescription(String d) {desc = d;}
 
 public static void modifyDesc(Module2_4 item, String desc)
 {
   item = new Module2_4();
   item.setDescription(desc);
 }
 
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module2_4 it = new Module2_4();
		it.setDescription("Gobstopper");
		Module2_4 it2 = new Module2_4();
		it2.setDescription("Fizzylifting");
		modifyDesc(it, "Scrumdiddlyumptious");
		System.out.println(it.getDescription());
		System.out.println(it2.getDescription());
		

	}

}
