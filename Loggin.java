import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;

public class Loggin {
    String resultsFileName;

    public Loggin(String fileName) {
        resultsFileName = fileName;
    }
    public void createFile() {
        try {
            assetExisitngFile();
            File resultsLog = new File(resultsFileName);
            if (resultsLog.createNewFile()) {
                System.out.println("File created: " + resultsLog.getName());
                //return True 
            } else {
                System.out.println("File already exists.");
                //return False
            }
            } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
      }

    public void writeOnFile(String data) {
        try {
            FileWriter output = new FileWriter(resultsFileName);
            // Writes the string to the file
            output.write(data);
            // Closes the writer
            output.close();
          }
          catch (Exception e) {
            e.getStackTrace();
          }
      }

      public void assetExisitngFile() {
        try {
            File fileToCheck = new File(resultsFileName);
            boolean existed; 
            existed = fileToCheck.exists();
            if (existed){
                fileToCheck.delete();
            }
          }
          catch (Exception e) {
            e.getStackTrace();
          }
      }


}
