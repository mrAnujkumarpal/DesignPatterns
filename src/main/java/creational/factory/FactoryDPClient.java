package creational.factory;

public class FactoryDPClient {

    public static void main(String[] args) {

        MarkerFactory markerFactory = new MarkerFactory();
        Marker redMarker = markerFactory.orderMarker("RED");
        redMarker.getMarker();


        Marker blueMarker = markerFactory.orderMarker("Blue");
        blueMarker.getMarker();

    }

}
