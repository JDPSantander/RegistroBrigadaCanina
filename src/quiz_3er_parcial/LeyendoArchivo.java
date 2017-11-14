
package quiz_3er_parcial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author jesusdavid.parra
 */
public class LeyendoArchivo {
    FileReader fr;
    BufferedReader archEnt;
    String linea,raza,nombre,edad,fVacuna;
    StringTokenizer tokenizer;
    
    public LeyendoArchivo(String nombreArchivo){
        try{
            fr = new FileReader(nombreArchivo);
            archEnt = new BufferedReader(fr);
            linea = archEnt.readLine();
            
            while(linea!=null){
                tokenizer = new StringTokenizer(linea);
                raza = tokenizer.nextToken();
                nombre = tokenizer.nextToken();
                edad = tokenizer.nextToken();
                fVacuna = tokenizer.nextToken();
                
            }
        }catch(IOException ex){
            System.out.println("El archivo no fue encontrado");
        }
    }
}
