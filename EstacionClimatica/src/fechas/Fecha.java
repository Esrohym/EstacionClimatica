package fechas;
public class Fecha
{
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAño) {
        dia = nuevoDia;
        mes = nuevoMes;
        año = nuevoAño;
    }
    
    public void imprimir() {
        System.out.printf("%d/%d/%d", dia, mes, año);
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setDia(int nuevoDia) {
        dia = nuevoDia;
    }
    
    public void setMes(int nuevoMes) {
        mes = nuevoMes;
    }
    
    public void setAño(int nuevoAño) {
        año = nuevoAño;
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
    
}
