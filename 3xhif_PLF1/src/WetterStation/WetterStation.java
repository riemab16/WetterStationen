package WetterStation;

import java.io.Serializable;

public class WetterStation implements Serializable {

    private String place;
    private int seaLevel;
    private float temp;
    private int humidity;

    public WetterStation(String place, int seaLevel, float temp, int humidity) {
        this.place = place;
        this.seaLevel = seaLevel;
        
    }

    public String getPlace() {
        return place;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public float getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }
    
    public void setTemp(float temp) throws Exception{
        if(temp <= -35 || temp >=45){
            throw new Exception("Temperatur nur zwischen -35° und +45° gültig");
        }
        this.temp = temp;
    }
    
     public void setHum(float temp) throws Exception{
        if(humidity < 0 || humidity > 100){
            throw new Exception("Luftfeuchtigkeit ungültig, nur zwischen 0% und 100% akzeptabel");
        }
        this.humidity = humidity;
    }
}
