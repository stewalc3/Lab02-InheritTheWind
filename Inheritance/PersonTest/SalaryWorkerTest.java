import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1;

    @BeforeEach
    void setUp() {
        sw1= new SalaryWorker("000001", "Lucas", "Stewart", "Mr.", 2000, 50.50, 105400);
    }
    @Test
    void calculateWeeklyPay() {
        System.out.println(sw1.calculateWeeklyPay(0));
    }
}