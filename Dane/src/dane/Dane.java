
package dane;

public class Dane {
    
    private String departamento;
    private int municipios;
    private int extension;
    private int habitantes;
    private int temperatura;
    private int indicativo;

    public Dane(String departamento, int municipios, int extension, int habitantes, int temperatura, int indicativo) {
        this.departamento = departamento;
        this.municipios = municipios;
        this.extension = extension;
        this.habitantes = habitantes;
        this.temperatura = temperatura;
        this.indicativo = indicativo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }
    
    public void imprimir() {
        System.out.print(" ");
        System.out.print("\nSu departamento es: " + departamento);
        System.out.print("\nEl numero de municipios es: " + municipios);
        System.out.print("\nLa extension de tierra medida en mt2 es: " + extension);
        System.out.print("\nEl numero de habitantes es: " + habitantes);
        System.out.print("\nLa temperatura promedio en grados Celsius es: " + temperatura);
        System.out.print("\nEl indicativo telefonico es: " + indicativo);

    }
    
}
