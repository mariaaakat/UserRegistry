package manager;

import dto.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    @Test
    public void positiveCreateOrderTest(){
        Manager manager = new Manager();
        assertEquals("Заявка создана", manager.createOrder("Test1"));
    }

}
