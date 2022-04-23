import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class physicsTest {

    @Test
    void eq() {
        physics phy = new physics();
        int x[] = {1, -1, 0};
        int y[] = {2, 3, -5};
        int z[] = {3, 4, -7};
        assertTrue(phy.eq(3, x, y, z));
    }

    @Test
    void eq1() {
        physics phy = new physics();
        int x[] = {3, 8};
        int y[] = {9, -2};
        int z[] = {-6, 6};
        assertFalse(phy.eq(2, x, y, z));
    }

    @Test
    void eq2() {
        physics phy = new physics();
        int x[] = {7};
        int y[] = {2};
        int z[] = {9};
        assertFalse(phy.eq(1, x, y, z));
    }

    @Test
    void eq3() {
        physics phy = new physics();
        int x[] = {1};
        int y[] = {2};
        int z[] = {3};
        assertThrows(IllegalArgumentException.class, () -> {
            phy.eq(0, x, y, z);
        });
    }

    @Test
    void eq4() {
        physics phy = new physics();
        int x[] = {4,-4};
        int y[] = {8,-8};
        int z[] = {9,-9};
        assertThrows(IllegalArgumentException.class, () -> {
            phy.eq(-2, x, y, z);
        });
    }
    @Test
    void eq5() {
        physics phy = new physics();
        int x[] = {-1,1};
        int y[] = {2,-2};
        int z[] = {5,-5};
        assertThrows(ArrayIndexOutOfBoundsException.class , () ->
        {phy.eq(4,x,y ,z);});
    }
}