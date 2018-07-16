import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BusinessTest {

    Business coffeeBusiness;
    Business printBusiness;
    Address coffeeBusinessAddress;
    Address printBusinessAddress;
    Address hotelBusinessAddress;
    Business hotelBusiness;

    @AfterEach
    void tearDown() {
        coffeeBusiness.getAddresses().clear();
        coffeeBusiness = null;
        coffeeBusinessAddress = null;
        printBusiness = null;
        printBusinessAddress = null;
        hotelBusiness = null;
        hotelBusinessAddress = null;

    }

    @BeforeEach
    void setUp() {
        coffeeBusiness = new Business("Coffee");
        coffeeBusinessAddress = new Address("123 Coffee Street", "Gotham", "Colorado", "80112");
        printBusinessAddress = new Address("456 Federal Street", "Denver", "Colorado", "80202");
        printBusiness = new Business("Quick Printing");
        hotelBusiness = new Business("Hotel 66");
        hotelBusinessAddress = new Address("66 Hotel blvd", "Chicago", "Illinois", "12121");
    }

    @Test
    void getName() {
        assertEquals( "Coffee", coffeeBusiness.getName());
        assertEquals("Quick Printing", printBusiness.getName());
        assertEquals("Hotel 66",hotelBusiness.getName());
    }

    @Test
    void getAddresses() {
        coffeeBusiness.addAddress(coffeeBusinessAddress);
        assertEquals(1, coffeeBusiness.getAddresses().size());
        printBusiness.addAddress(printBusinessAddress);
        assertEquals(2, printBusiness.getAddresses().size());
        hotelBusiness.addAddress(hotelBusinessAddress);
        assertEquals(3, hotelBusiness.getAddresses().size());
    }

    @Test
    void addAddress() {
        Business postBusiness =  new Business("Post Office");
        Address postOfficeAddress =  new Address("555 Postal Blvd", "Bloomington", "Indiana", "40002");
        coffeeBusiness.addAddress(coffeeBusinessAddress);
        assertEquals(1, postBusiness.getAddresses().size());
        postBusiness.addAddress(postOfficeAddress);
        assertEquals(2, postBusiness.getAddresses().size());
        boolean foundAddress = false;
        for (Address address : postBusiness.getAddresses()) {
            if (postOfficeAddress.toString().equalsIgnoreCase(address.toString())) {
                foundAddress = true;
                break;
            }
        }
        assertTrue(foundAddress);
    }
}