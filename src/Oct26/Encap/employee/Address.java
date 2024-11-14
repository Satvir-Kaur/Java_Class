package Oct26.Encap.employee;

public class Address {
    String Street;
    String city;
    String postalCode;

    public Address(String street, String city, String postalCode) {
        Street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
