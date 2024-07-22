/*
 * FileWriter is meant for writing streams of characters while 
FileOutputStream is used for writing streams of raw bytes. 
FileWriter deal with 16-bit characters while FileOutputStream deals with 8-bit bytes
 */
package FileHandling;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 *
 * To create a file in Java, you can use the createNewFile() method. 
 * This method returns a boolean value: true if the file was successfully created, 
 * and false if the file already exists. 
 */
public class CreateFile {
 
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
    

