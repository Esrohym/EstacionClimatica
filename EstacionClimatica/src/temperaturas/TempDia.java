package temperaturas;

import fechas.Fecha;

public class TempDia {
	
	private int tempMax;
	
	private int tempMin;
	
	private Fecha fechamodi;
	
	
	
	public TempDia() {
		
}
	
	public TempDia(Fecha fechamodi,int tempMax,int tempMin) {
		
	
		
		this.tempMax=tempMax;
		
		this.tempMin=tempMin;
		
		this.fechamodi=fechamodi;		
		
}
	
	//getter dia
	public int getDia() {
		
		
		return fechamodi.getDia();
		
	}
	
	//getter mes
	public int getMes() {
		
		return fechamodi.getMes();
		
	}
	
	//getter año
	public int getAgno() {
		
		return fechamodi.getAño();
		
	}
	

	public String toString(){
		
		
		return "Medicion hecha el: "+fechamodi+'\n'+'\n'+"La temperatura maxima fue de: "+tempMax+'\n'
		+"La temperatura minima fue de: "+tempMin+'\n'+"La media de temperatura fue de: "+(tempMax+tempMin)/2;
		
		
	}
	
	
	
}
