import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;
    @BeforeEach
    void setUp() {
        w1= new Worker("000001", "Lucas", "Stewart", "Mr.", 2000, 50.50);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println(w1.calculateWeeklyPay(60));
    }

    @Test
    void displayWeeklyPay() {
        System.out.println(w1.displayWeeklyPay(40));
    }
}