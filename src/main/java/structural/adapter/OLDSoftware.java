package structural.adapter;

interface XMLData {

    void readXML() ;
}

public class OLDSoftware implements XMLData {
    @Override
    public void readXML() {

        System.out.println(" Read only xml data ");
    }
}
