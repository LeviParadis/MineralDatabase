/**
 * @author Levi Paradis
 */
package models;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	/**
	 * 
	 * @param fileName Deserialize from this given name
	 * @return the object it was deserialized to
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deserialize(String fileName) throws IOException, 
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
	/**
	 * 
	 * @param obj the Object to serialize
	 * @param fileName the file name to serialize the object to
	 * @throws IOException
	 */
	public static void serialize(Object obj, String fileName) 
			throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		fos.close();
	}
	
	
}
