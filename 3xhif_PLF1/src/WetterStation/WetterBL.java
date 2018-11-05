
package WetterStation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class WetterBL extends AbstractTableModel {
    private ArrayList<WetterStation> stations = new ArrayList<>();
    private String[] COLNAMES = {"Place","Sea Level","Temperature","rel. Humidity"};
    
    @Override
    public int getRowCount() {
       return stations.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }
    @Override
    public String getColumnName(int i){
        return COLNAMES[i];
    }
    @Override
    public Object getValueAt(int rows, int columns) {
        WetterStation ws = stations.get(rows);
        return ws;
    }
   
    
    
}
