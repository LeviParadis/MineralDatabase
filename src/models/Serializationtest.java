/**
 * 
 */
package models;

import java.io.IOException;

/**
 * @author Levi Paradis
 *
 */
public class Serializationtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName ="flourite.ser";
		Mineral flourite = new Mineral("flourite","purple");
		
		//serialize this to file
		try{
			models.SerializationUtil.serialize(flourite, fileName);
		} catch (IOException e){
			e.printStackTrace();
		}
		
		Mineral flouriteFromFile = null;
		try {
			flouriteFromFile = (Mineral) models.SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("flourite object::"+flourite);
		System.out.println("new flourite from file" +flouriteFromFile);
	}

}
