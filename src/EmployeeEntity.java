
public final class EmployeeEntity {

    private final int id;
    private final String name;
    private final Address address;

    public EmployeeEntity(int id, String name, Address address) {
        this.id = id;
        this.name = name;

        Address temp = new Address();
        temp.setAddressLine1(address.getAddressLine1());
        temp.setAddressLine2(address.getAddressLine2());
        temp.setPincode(address.getPincode());
        temp.setStreetName(address.getStreetName());

        this.address = temp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        Address temp = new Address();

        temp.setAddressLine1(this.address.getAddressLine1());
        temp.setAddressLine2(this.address.getAddressLine2());
        temp.setPincode(this.address.getPincode());
        temp.setStreetName(this.address.getStreetName());

        return temp;
    }
}
