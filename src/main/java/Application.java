
public class Application {

    public static void main(String args[]) {
        Business coffeeBusiness = new Business("Java");
        Address coffeeBusinessAddress = new Address("123 Coffee Street", "Gotham", "Colorado", "80112" );
        Address printBusinessAddress = new Address("456 Federal Street", "Denver", "Colorado", "80202" );
        Business printBusiness =  new Business("Quick Printing");
        Business hotelBusiness =  new Business("Hotel 66");
        Address hotelBusinessAddress = new Address("66 Hotel blvd", "Chicago", "Illinois", "12121" );
        coffeeBusiness.addAddress(coffeeBusinessAddress);
        printBusiness.addAddress(printBusinessAddress);
        hotelBusiness.addAddress(hotelBusinessAddress);
    }
}
