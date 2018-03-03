package temperaturas;

import javax.swing.JOptionPane;

public class TestEstacionClimatica {
	
	// Programa principal de pruebas
	/*
	 * En el programa principal crea una estación, introduce cinco días pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos días.
	Luego borra dos (pedida por teclado y validándola de nuevo) y los vuelve a listar.
	 *
	 */
	public static void main (  String [] argv ){
	        
	        EstacionClimatica estacion  = new EstacionClimatica("Burgos",2017);
	       

	        JOptionPane.showMessageDialog(null,"Introduce 5 medidas","Atención",JOptionPane.INFORMATION_MESSAGE);
	        

	        for (int i=0; i<5; i++){
	             TempHumDia  medicion = EstacionClimatica.leerMedida();
	             if(!estacion.addDia(medicion)) {
	            	 
	            	 i-=1;
	             }
	             
	             
	        }
	        
	       estacion.listarDias();
	        
	       JOptionPane.showMessageDialog(null, "Introduce la fecha de la medida que quieres quitar","Mensaje",JOptionPane.INFORMATION_MESSAGE);
	       int medida1 = estacion.fechaAQuitar();
	       int medida2 = estacion.fechaAQuitar();
	      
	       estacion.delDia(medida1);
	       estacion.delDia(medida2);

	 
	       estacion.listarDias();      
	             
	    }            
	        
	 }



