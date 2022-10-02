package gymSingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GymOwnerTest {

    @Test
    void returnGymOwnerName(){
        GymOwner.getInstance().setGymOwnerName("Pedro Henrique");
        assertEquals("Pedro Henrique", GymOwner.getInstance().getGymOwnerName());
    }

    @Test
    void returnGymName(){
        GymOwner.getInstance().setGymName("Pumping Iron");
        assertEquals("Pumping Iron", GymOwner.getInstance().getGymName());
    }

    @Test
    void returnGymAddress() {
        GymOwner.getInstance().setGymAddress("Costa e Silva");
        assertEquals("Costa e Silva", GymOwner.getInstance().getGymAddress());
    }

}
