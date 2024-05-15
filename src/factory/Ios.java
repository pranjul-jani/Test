package factory;

public class Ios implements Phone{
    @Override
    public void getSpecifications() {
        System.out.println("IOS version 17, triple camera setup");
    }
}
