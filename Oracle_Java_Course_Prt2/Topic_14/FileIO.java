import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class FileIO{
 public static void main(String[] args){
 try{
 new FileIO().writeToFile();
 }catch(IOException e){
 System.out.println("Unable to write to the file at this time");
 }
 }// main
public void writeToFile() throws IOException{
 // Create a File object
 File file = new File("Hello_World.txt");
 //Create a FileWriter object
 FileWriter fw = new FileWriter(file,true);
 //Create a BufferedWriter object
 //It requires a reference to a FileWriter object
 BufferedWriter bw = new BufferedWriter(fw);

 //Create a PrintWriter object.
 //It requires a reference to a BufferedWriter object.
 PrintWriter pw = new PrintWriter(bw);
 //Use the PrintWriter object to write to the text file.
 pw.println("Hello World!");
 // Confirmation Message
 System.out.println("Message written to text file.");
 // Close the PrintWriter stream
 pw.close();

 }// method
}// class
