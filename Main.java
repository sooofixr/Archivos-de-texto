public class Main {
     public static void main (String[] args) {  
        TextFileWriter writer = new
           TextFileWriter("ejemplo.txt");
        
        try {
           writer.openFile();
           writer.writeToFile("Hola, munto!\n");
           writer.writeToFile("Este es un archivo de texto plano creado con Java y POO.");
          System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
             System .err.println("Error al cerrar el archivo: " + e.getMessage());
        }
     }
}
