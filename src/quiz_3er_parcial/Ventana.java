
package quiz_3er_parcial;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jesusdavid.parra
 */
public class Ventana extends JFrame {
    
    //1era parte
    private Choice razas;
    private JTextField nombre,edad,fVacuna;
    private JLabel name,age,vacuna,raza;
    private JButton agregar;
    
    //2da parte
    private JTextArea listado;
    
    EscribiendoArchivo archivo;
    String recopilacion = "";
    
    //3era parte
    private JTextField nombre2,vacunacion;
    private JLabel name2,vacunacion2;
    private JButton actualizar;
    
   
    public Ventana(String titulo){
        super(titulo);
        this.setLayout(null);
        this.setSize(500, 500);
        
        // PRIMERA PARTE
        razas = new Choice();
        razas.add("Pitbull");
        razas.add("Collie");
        razas.add("Poddle");
        razas.add("Cocker");
        razas.add("Doberman");
        razas.add("Mestizo");
        razas.setBounds(55, 30, 160, 200);
        recopilacion+=razas.getSelectedItem();
        
        
        
        // etiquetas
        name = new JLabel("Nombre");
        name.setBounds(5, 5, 50, 20);
        
        age = new JLabel("Edad");
        age.setBounds(240, 5, 50, 20);
        
        raza = new JLabel("Raza");
        raza.setBounds(5, 30, 50, 20);
        
        vacuna = new JLabel("Fecha Vacuna");
        vacuna.setBounds(240, 30, 80, 20);
   
        
       
        
        // Entradas de texto
        
        nombre = new JTextField("");
        nombre.setBounds(55, 5, 160, 20);
        nombre.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
                
                recopilacion+= "-"+event.getActionCommand();
                //archivo = new EscribiendoArchivo(recopilacion);
            }
        });
        edad = new JTextField("");
        edad.setBounds(280, 5, 180, 20);
        edad.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
                
                recopilacion += "-" +event.getActionCommand();
                
            }
        });
        fVacuna = new JTextField("");
        fVacuna.setBounds(330, 30, 130, 20);
        fVacuna.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
            
                recopilacion+= "-" +event.getActionCommand();
                
            }
        });
        
        // Boton agregar
      
        agregar = new JButton("Agregar");
        agregar.setBounds(240, 60, 80, 30);
        agregar.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
                
                archivo = new EscribiendoArchivo(recopilacion);
            }
        });
        
        // SEGUNDA PARTE
        
        listado = new JTextArea("Nombre                   Raza                     Edad                 Ingreso                Vacunacion",5,15);
        listado.setBounds(5, 100, 470, 300);
        listado.setEditable(false);
        listado.setAutoscrolls(true);
        
        
        //TERCERA PARTE
        
        //Entradas de texto
        nombre2 = new JTextField("");
        nombre2.setBounds(55, 405, 160, 20);
        nombre2.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
                //JOptionPane.showMessageDialog( null, "nombre " + event.getActionCommand());
            }
        });
        vacunacion = new JTextField("");
        vacunacion.setBounds(300, 405, 160, 20);
        vacunacion.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent event ){ 
                //JOptionPane.showMessageDialog( null, "nombre " + event.getActionCommand());
            }
        });
        
        //Etiquetas 
        
        name2 = new JLabel("Nombre");
        name2.setBounds(5, 405, 50, 20);
        
        vacunacion2 = new JLabel("Vacunación");
        vacunacion2.setBounds(220, 405, 80, 20);
        
        //Boton actualizar
        
        actualizar = new JButton("Actualizar");
        actualizar.setBounds(240, 430, 100, 30);
        
        
        // Primera parte
        this.getContentPane().add(razas);
        this.getContentPane().add(nombre);
        this.getContentPane().add(edad);
        this.getContentPane().add(fVacuna);
        this.getContentPane().add(name);
        this.getContentPane().add(age);
        this.getContentPane().add(raza);
        this.getContentPane().add(vacuna);
        this.getContentPane().add(agregar);
        //Segunda parte
        this.getContentPane().add(listado);
        //Tercera parte
        this.getContentPane().add(nombre2);
        this.getContentPane().add(vacunacion);
        this.getContentPane().add(name2);
        this.getContentPane().add(vacunacion2);
        this.getContentPane().add(actualizar);
        //Caracteristicas Frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Fin añadiendo al Frame
    }
    
}
