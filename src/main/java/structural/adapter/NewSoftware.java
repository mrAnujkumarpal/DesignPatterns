package structural.adapter;

interface JSonData{
    void JsonData();
}
public class NewSoftware implements JSonData{

    @Override
    public void JsonData() {
        System.out.println("Read JSON data...");
    }
}
