package structural.adapter;

public class XmlToJsonAdapter implements JSonData{

    XMLData xmlData;

    XmlToJsonAdapter(XMLData xmlData){
        this.xmlData=xmlData;
    }


    @Override
    public void JsonData() {
        xmlData.readXML();
        System.out.println("Now after convertion  this return json data .....");
    }
}
