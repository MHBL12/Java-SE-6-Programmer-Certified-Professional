public class Module3_4{
	public static void main(String[] args)
	{
	  java.util.List<A> list = new java.util.ArrayList<A>();
	  list.add(new B());
	  list.add(new C());
	  for (A a:list)
	  {
		  a.x();
		  a.y();
	  }
	  
	}	
}

class B implements A {
	public void x() {}
	public void y() {}
}


class C extends B{
	public void x(){}
}

interface A {void x();}

