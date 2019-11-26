import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Java program to read file using Scanner class in Java.
 * java.util.Scanner is added on Java 5 and offer convenient method to read data
 *
 * @author
 */
public class Lexer {
  
  public static String[] main(String fileName){
      String read = reader(fileName);
      read = read.toLowerCase();
      read = read.trim();
      String[] readArray = read.split(" ");
      String[] lexed = new String[readArray.length *2];
      int arrayCount = 0;
      for (int i = 0; i < readArray.length-1;i+=1){
        switch (readArray[i]){
            case "numb3r":
                lexed[arrayCount] = "int";
                lexed[arrayCount+1] = readArray[i]; 
                break;
            default:
                lexed[arrayCount] = "id";
                lexed[arrayCount+1] = readArray[i]; 
        }
        arrayCount += 2;
    }
    
    return lexed;


  }

    public static String reader(String fileName) {
  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  

 
}
}
