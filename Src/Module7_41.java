import java.util.List;


public class Module7_41 {

	public void takeList(List<? extends String> list){
		list.add("Foo");
		Object o = list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
