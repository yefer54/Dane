
package dane;

import dane.Dane;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Dane> daneInfo = new ArrayList <>();
        String input;
        
        while (true) {
            input = JOptionPane.showInputDialog(null, "¿Desea agregar un nuevo departamento?, (escribe no para terminar)");
            if (input == null || input.equalsIgnoreCase("no")) {
                break;   
            } else {
                String departamento = JOptionPane.showInputDialog(null, "Ingrese el departamento: ");
                if (departamento == null) break;
             
                String municipio = JOptionPane.showInputDialog(null, "Ingrese el numero de municipios");
                if (municipio == null) break;
                int municipios;
                try{
                    municipios = Integer.parseInt(municipio);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es invalido.");
                    continue;
                }
                
                String extensiones = JOptionPane.showInputDialog(null, "Ingrese la extension en metros cuadrados: ");
                if (extensiones == null) break;
                int extension;
                try{
                    extension = Integer.parseInt(extensiones);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es invalido.");
                    continue;
                }
                
                String habitante = JOptionPane.showInputDialog(null, "Ingrese el numero de habitantes: ");
                if (habitante == null) break;
                int habitantes;
                try{
                    habitantes = Integer.parseInt(habitante);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es invalido.");
                    continue;
                }
                
                String temperaturas = JOptionPane.showInputDialog(null, "Ingrese la temperatura promedio");
                if (temperaturas == null) break;
                int temperatura;
                try{
                    temperatura = Integer.parseInt(temperaturas);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es invalido.");
                    continue;
                }
                
                String indicativos = JOptionPane.showInputDialog(null, "Ingrese el indicativo telefonico: ");
                if (indicativos == null) break;
                int indicativo;
                try{
                    indicativo = Integer.parseInt(indicativos);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El numero ingresado es invalido.");
                    continue;
                }
                
                daneInfo.add(new Dane(departamento, municipios, extension, habitantes, temperatura, indicativo));
                
            }
        }
        
        if (!daneInfo.isEmpty()) {

            Dane mayorExtension = daneInfo.get(0);
            Dane menorTemperatura = daneInfo.get(0);
            Dane mayorHabitantes = daneInfo.get(0);
            Dane menorExtension = daneInfo.get(0);
            
            for (Dane datos : daneInfo) {
                if (datos.getExtension() > mayorExtension.getExtension()) {
                    mayorExtension = datos;
                }
                if (datos.getTemperatura() < menorTemperatura.getTemperatura()) {
                    menorTemperatura = datos;
                }
                if (datos.getHabitantes() > mayorHabitantes.getHabitantes()) {
                    mayorHabitantes = datos;
                }
                if (datos.getExtension() < menorExtension.getExtension()) {
                    menorExtension = datos;
                }
            }
            
            for (Dane datos : daneInfo) {
                datos.imprimir();
                System.out.println(" ");
            }
            
            System.out.println(" ");
            System.out.println("Departamento con mayor extensión: " + mayorExtension.getDepartamento());
            System.out.println("Departamento con menor temperatura: " + menorTemperatura.getDepartamento());
            System.out.println("Departamento con mayor número de habitantes: " + mayorHabitantes.getDepartamento());
            System.out.println("Departamento con menor extensión: " + menorExtension.getDepartamento());
        }
        
    }
    
}

