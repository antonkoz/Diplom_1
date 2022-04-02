package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void getName() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3", 988f);
        assertEquals("Название булочки не совпадает.","Флюоресцентная булка R2-D3", bun.getName());
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun("Краторная булка N-200i", 1255);
        assertTrue("Цена булочки не совпадает.",bun.getPrice() == 1255.00f);
    }
}