package fechas;
public class Fecha
{
    private int dia;
    private int mes;
    private int a�o;
    
    public Fecha(int nuevoDia, int nuevoMes, int nuevoA�o) {
        dia = nuevoDia;
        mes = nuevoMes;
        a�o = nuevoA�o;
    }
    
    public void imprimir() {
        System.out.printf("%d/%d/%d", dia, mes, a�o);
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getA�o() {
        return a�o;
    }
    
    public void setDia(int nuevoDia) {
        dia = nuevoDia;
    }
    
    public void setMes(int nuevoMes) {
        mes = nuevoMes;
    }
    
    public void setA�o(int nuevoA�o) {
        a�o = nuevoA�o;
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + a�o;
    }
    
}
