package temperaturas;

import fechas.Fecha;

public class TempHumDia extends TempDia {
	
    private int HumMax;
	
	private int HumMin;
	
	
	public TempHumDia() {
		
	}
	
	public TempHumDia(Fecha fechamodi ,int tempMax,int tempMin,int HumMax,int HumMin) {
		
		
		super(fechamodi,tempMax,tempMin);
		
		this.HumMax=HumMax;
		
		this.HumMin=HumMin;
		
	}

	
	public String toString(){
		
		
		return super.toString()+'\n'+"La humedad Maxima fue de: "+HumMax+'\n'+"La humedad Minima fue de: "+HumMin+'\n'+"La media de"
				+ "humedad fue: "+(HumMax+HumMin)/2+'\n';
	}
}
