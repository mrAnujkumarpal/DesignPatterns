package creational.factory;

public class MarkerFactory {


    public Marker orderMarker(String str) {

        if (str.equalsIgnoreCase("RED")) {
            return new RedMarker();
        }
        if (str.equalsIgnoreCase("Blue")) {
            return new BlueMarker();
        }
        if (str.equalsIgnoreCase("GREEN")) {
            return new GreenMarker();
        }
        return null;
    }
}
