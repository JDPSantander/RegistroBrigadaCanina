
package quiz_3er_parcial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jesusdavid.parra
 */
public class EscribiendoArchivo {
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter arch;
    
    
    public EscribiendoArchivo(String datos){
        try{
            fw = new FileWriter("src/Archivo.txt");
            bw = new BufferedWriter(fw);
            arch = new PrintWriter(bw);
            arch.println(datos);
            arch.close();
        }catch(IOException e){
            System.out.println("Error al abrir el archivo");
        }
    }
}
