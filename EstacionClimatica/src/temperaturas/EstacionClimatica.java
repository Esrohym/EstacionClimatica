package temperaturas;

import javax.swing.JOptionPane;

import fechas.Fecha;

public class EstacionClimatica
{

	//variables EstacionClimatica
	private String nombre;
 
	private int año;
 
	private TempHumDia mediciones[];  
 
	//constructor por defecto
	
 public EstacionClimatica()
 {
      
	 this.nombre = "";
      
	 this.año = 2000;  
     
	 mediciones = new TempHumDia[366]; 

      
 }
 
 //constructor con parametros
 public EstacionClimatica( String nombre, int año)
 {
      
	 this(); // Llamo al constructor por defecto
     
	 this.nombre = nombre;
     
	 this.año = año;
      
 }

 //metodo que almacena una medida si el año de la estacion corresponde con el año introducido por el usuario
 
 public boolean addDia ( TempHumDia media){
	 

	 if(media.getAgno()==año) {
		 
		 mediciones[(fechaEntero(media.getDia(),media.getMes(),media.getAgno()))-1]=media;
		 
		 JOptionPane.showMessageDialog(null, "La medida se ha introducido correctamente","Confirmación",JOptionPane.INFORMATION_MESSAGE);
		 
		 return true;
	 
	 }
	 else {
		 
		 JOptionPane.showMessageDialog(null,"El año Introducido no corresponde con el año de la estación.","ERROR",JOptionPane.ERROR_MESSAGE);
		 
		 return false;
		 
	 }
	 
 }
 
 //metodo que quita una medicion dependiendo 
 
 public boolean delDia ( int dias){
	 
	 mediciones[dias-1]=null;
	 
	 return true;
 }
 
 //metodo que imprime los datos de las medidas almacenadas 
 
 public void listarDias(){
    
	 for(TempHumDia valor:mediciones) {
		 
		 if(valor!=null) {
			 
			 System.out.println("Estacion "+nombre+'\n'+'\n'+valor.toString());
    	
		 }
	 }
 }
 
 // Método auxiliar que me indica si una fecha es correcta
 static boolean fechaOK (Fecha fecha){
	 
	 	
	 
	if(fecha.getMes()==2 && fecha.getDia()>0 && fecha.getDia()<30 && fecha.getAño()%4==0) {
		
		return true;
		
	}
	else if(fecha.getMes()==2 && fecha.getDia()>0 && fecha.getDia()<29 && fecha.getAño()%4!=0) {
		
		return true;
		
	}
	else if(fecha.getMes()%2==0 && fecha.getDia()>0 && fecha.getDia()<31 && fecha.getMes()!=2) {
		
			return true;
		
	}
	else if(fecha.getMes()%2==1 && fecha.getDia()>0 && fecha.getDia()<32) {
		
		return true;
	}
   
    return false;
 
 }
 
 // Metodo en el cual se introduce una fecha y si la fecha cumple con el estandar pedira la temperatura y la humedad
 public static TempHumDia leerMedida () {

      
	 Fecha fecha;
      
	 int tempmax, tempmin, hummax, hummin;
     
	 TempHumDia  medicion = new TempHumDia();
      
     boolean error = true;
     do {
     
    	 fecha =fechaSelect();

     if (fechaOK(fecha) ) {
          
    	 tempmax = Integer.parseInt(JOptionPane.showInputDialog(null,"Tº Máxima",1));
          
    	 tempmin = Integer.parseInt(JOptionPane.showInputDialog(null,"Tº Minima",1));
         
    	 hummax = Integer.parseInt(JOptionPane.showInputDialog(null,"Hº Máxima",1));
         
    	 hummin = Integer.parseInt(JOptionPane.showInputDialog(null,"Hº Minima",1));
         
    	 medicion = new TempHumDia (fecha, tempmax, tempmin, hummax, hummin);
         
    	 error = false;
         }
     else
     { 
         System.out.println("Fecha érronea");
     }
 
 } while (error);
 
 return medicion;
}
 
 
 public static Fecha fechaSelect() {
	 
	 return new Fecha(Integer.parseInt(JOptionPane.showInputDialog(null,"Dia","Dia Medicion",JOptionPane.QUESTION_MESSAGE)),
			 	Integer.parseInt(JOptionPane.showInputDialog(null,"Mes","Mes Medicion",JOptionPane.QUESTION_MESSAGE)),
			 	Integer.parseInt(JOptionPane.showInputDialog(null,"Año","Año Medicion",JOptionPane.QUESTION_MESSAGE)));
	 
 }
 
 //metodo que transforma una fecha introducida por el usuario a un entero entre 1 y 366 dependiendo de la fecha y luego la quita
 public int fechaAQuitar() {
	 
	 int [] dias_meses= {31,28,31,30,31,30,31,31,30,31,30,31};
	 
	 Fecha fecha=fechaSelect();
	 
	 int dias_totales=0;
	
	 if(fechaOK(fecha) && fecha.getAño()==año) {
		 
		 for (int i=0;i<fecha.getMes()-1;i++) {
			 
			dias_totales+=dias_meses[i];
			 
		 }
		 
	 }
	 
	 return dias_totales+fecha.getDia(); 
}
 
 
 
 //metodo que transforma la fecha a entero de 1 a 366
public static int fechaEntero(int dia,int mes,int año) {
	
	
	int [] dias_meses= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	int dias_totales=0;
	
	for (int i=0;i<mes-1;i++) {
		 
		dias_totales+=dias_meses[i];
		
		
	}
	
	if(año%4==0 && mes>2) {
		
		dias_totales+=1;
		
	}
	
	return dias_totales+dia;
	
}
 
 
}
