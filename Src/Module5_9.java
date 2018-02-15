import java.io.File;
public class Module5_9 {

	public static boolean doesFileExist(String[] directories, String filename)
	{
		String path = "";
		for (String dir: directories)
		{
			path = path + File.separator + dir;
		}
		File file = new File(path, filename);
		return file.exists();
	}
	
	
	public static void main(String[] args) {
		String[] s = {"Cheese", "Pepperoni", "Black Olives"};
		Module5_9 a = new Module5_9();
		boolean y = a.doesFileExist(s, "temp");

	}

}
