paquete  queuex ;
import  java.util.Queue ;
import  java.util.LinkedList ;
import  javax.swing.JOptionPane ;
import  javax.swing.JTextField ;
Todos los derechos reservados
 *
 * @author junior loor
 * /
la  clase  pública QueueGrafica  extiende  javax.swing . JFrame {
Queue cola = nuevo  LinkedList ();
    Todos los derechos reservados
     * Crea un nuevo formulario QueueGrafica
     * /
    public  QueueGrafica () {
        initComponents ();
    }
    private  void  BTNinsertarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
Cola . agregar ( TXTinsertar . getText ());   
JOptionPane . showMessageDialog ( null , " Se inserto elemento " );
        
        TXTinsertar . setText ( " " ); // TODO agregue su código de manejo aquí:
    }                                           

    private  void  BTNimprimirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
if (cola . isEmpty () == true ) {
            JOptionPane . showMessageDialog ( null , " La cola esta vacia " );
        }
        más
        {
            TXTimprimir . setText ( TXTimprimir . getText () + cola . toString ());
        }         // TODO agregue su código de manejo aquí:
    }                                           

    private  void  BTNeliminarTodoActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                
Cola . claro();
 JOptionPane . showMessageDialog ( null , " Se ha eliminado toda la cola QUEUE " );
 TXTimprimir . setText ( " " );
// TODO agregue su código de manejo aquí:
    }                                               

    private  void  BTNbuscarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          

        Cadena valorBuscado =  TXTbuscar . getText ();

        si (refresco de cola . contiene (valorBuscado)) {
            JOptionPane . showMessageDialog ( nulo , " El elemento si se encuentra en la cola " );
        }
        else {
            JOptionPane . showMessageDialog ( null , " El elemento no se encuentra en la cola " );

        }
    }                                         

    private  void  BTNimprimirprimerelementoActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                          
        // TODO agregue su código de manejo aquí:
        if (cola . isEmpty () == true ) {
            JOptionPane . showMessageDialog ( null , " La cola esta vacia " );
        }
        más
        TXTimprimirprimerelemento . setText ( TXTimprimirprimerelemento . getText () + cola . peek () . toString () + "  " );
        
        TXTimprimirprimerelemento . getText ();
        
        
    }                                                         

    private  void  jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        disponer();
    }