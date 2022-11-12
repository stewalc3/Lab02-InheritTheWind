import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Lucas", "Stewart", "Mr.", 2000);
        p2 = new Person("000002", "Louis", "Nagy", "Mr.", 1999);
        p3 = new Person("000003", "Sean", "Gue", "Mr.", 1996);
        p4 = new Person("000004", "Nick", "Beavan", "Mr.", 2000);
        p5 = new Person("000005", "Hunter", "Moran", "Mr.", 2000);
        p6 = new Person("000006", "Tony", "Gentile", "Mr.", 2001);
    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setID() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void setYOB() {
    }

    @Test
    void fullName() {
    }

    @Test
    void formalName() {
    }

    @Test
    void getAge() {
        System.out.println(p1.getAge());
    }
    @Test
    void getAgeOverload() {
        System.out.println(p1.getAge(2050));
    }
}