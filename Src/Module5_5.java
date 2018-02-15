import java.io.*;

public class Module5_5 {
	public static void main(String [] args) { 
		Banana b = new Banana(); 
		b.serializeBanana(b);                  // assume correct serialization 
		b = b.deserializeBanana(b);  
		System.out.println(" restored "+ b.size + " "); 
	} 
}

class Food {
	Food() { System.out.print("1"); }
} 
class Fruit extends Food implements Serializable { 
	Fruit() { System.out.print("2"); } 
} 
class Banana extends Fruit { 
	int size = 42; 
// more Banana2 methods 
	public void serializeBanana(Banana b) {
		try{
		    FileOutputStream fos = new FileOutputStream("d:\\go.tmp");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(b);
		    oos.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}		
	}

	public Banana deserializeBanana(Banana b) {
		try{
		    FileInputStream fis = new FileInputStream("d:\\go.tmp");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    Banana bb = (Banana)ois.readObject();
		    ois.close();
		    return bb;
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return b;
	}

}
