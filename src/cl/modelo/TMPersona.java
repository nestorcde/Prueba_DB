/*
 * Nestor Damian Espinola Chaves
 * CI: 4.543.390
 * Analisis De Sistemas
 */
package cl.modelo;

/**
 *
 * @author user
 */
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
public class TMPersona implements TableModel{
    private List<Persona>personas;

    public TMPersona(List<Persona> lista) {
        this.personas = lista;
    }
    
    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch(columnIndex){
            case 0:{
                titulo = "Codigo";
                break;
            }
            case 1:{
                titulo = "Nombre";
                break;
            }
            case 2:{
                titulo = "Apellido";
                break;
            }
            case 3:{
                titulo = "Telefono";
                break;
            }
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?>clase = null;
        switch(columnIndex){
            case 0:{
                clase = Integer.class;
                break;
            }
            case 1:{
                clase = String.class;
                break;
            }
            case 2:{
                clase = String.class;
                break;
            }
            case 3:{
                clase = String.class;
                break;
            }
        }
        return (Class<?>) clase;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex);
        String valorStr = null;
        Integer valorInt = null;
        switch(columnIndex){
            case 0:{
                valorInt = p.getCodPersona();
                break;
            }
            case 1:{
                valorStr = p.getNomPersona();
                break;
            }
            case 2:{
                valorStr = p.getApePersona();
                break;
            }
            case 3:{
                valorStr = p.getTelPersona();
                break;
            }
        }
        if (valorInt != null){
            return valorInt;
        }else{
            return valorStr;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex);
        
        switch(columnIndex){
            case 0:{
                p.setCodPersona(aValue.hashCode());
                break;
            }
            case 1:{
                p.setNomPersona(aValue.toString());
                break;
            }
            case 2:{
                p.setApePersona(aValue.toString());
                break;
            }
            case 3:{
                p.setTelPersona(aValue.toString());
                break;
            }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
