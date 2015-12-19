/**
 * 
 */
package models;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
/**
 * @author Levi Paradis
 *
 */
public class Mineral implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String colour;
	
	/**
	 * 
	 * @param name the name of the mineral
	 * @param colour the most common colour of the mineral
	 */
	public Mineral (String name,String colour){
		
	}
	
	/**
	 * @param args
	 */
	

		 
	public static void main(String[] args) {

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
