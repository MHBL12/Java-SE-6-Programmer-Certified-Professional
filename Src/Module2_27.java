
public class Module2_27 {
   private String name;
   /*
   public Module2_27()
   {
	   this("fern");
   }
   */
   public Module2_27(String name) {
	   this.name = name;
   }
   public String getName() {
	   return name;
   }
}

public class Tree extends Module2_27 {
	
	public void growFruit() {}
	public void dropLeaves() {}
}
