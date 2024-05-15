package factory;

public class Android implements Phone{
    @Override
    public void getSpecifications() {
        System.out.println("version 10, customization");
    }
}
