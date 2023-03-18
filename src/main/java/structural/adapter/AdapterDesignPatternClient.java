package structural.adapter;

/*
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
The main goal for Adapter pattern is to convert an existing interface into another one the client expects.
Adapter :: Design between oldXML project ---->> New JSON project
 */



public class AdapterDesignPatternClient {
    public static void main(String[] args) {

        OLDSoftware oldSoftware=new OLDSoftware();

        XmlToJsonAdapter adapter=new XmlToJsonAdapter(oldSoftware);
        adapter.JsonData();

    }
}
