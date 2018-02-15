import java.io.*;
public class Module5_8 implements Serializable{

private Tree tree = new Tree();	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Module5_8 f = new Module5_8();
    try{
    	FileOutputStream fs = new FileOutputStream("Forest.ser");
    	ObjectOutputStream os = new ObjectOutputStream(fs);
    	os.writeObject(f);
    	os.close();
    	
    	
    }
    catch(Exception ex)
    {
    	ex.printStackTrace();
    }
	}

}

class Tree{}
