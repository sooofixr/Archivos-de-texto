public class Main {
     public static void main (String[] args) {  
        TextFileWriter writer = new
           TextFileWriter("ejemplo.txt");
        
        try {
           writer.openFile()