
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
        
        switch(columns){
            case 0: return ws.getPlace(); 
            case 1: return ws.getSeaLevel();
            case 2: return ws.getTemp();
            case 3: return ws.getHumidity();
            default: System.out.println("????");
        
        }
        return ws;
    }
   
    public void add(WetterStation w){
        stations.add(w);
        fireTableRowsInserted(stations.size()-1, stations.size()-1);
    }
    public void remove(int i){
        stations.remove(i);
        fireTableRowsDeleted(stations.size()-1, stations.size()-1);
    }
    public void setTemp(int i, float f)throws Exception{
        
    }
    
}
