public class Markers {

    public String markerName;
    public double markerCost;

    Markers(String markerName, double markerCost){
        this.markerName = markerName;
        this.markerCost = markerCost;
    }

    public String getMarkerName(){
        return markerName;
    }

    public double getMarkerCost(){
        return markerCost;
    }
    
}