import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account(100); //initial balance of 100
    }

    @Test
    public void testWithdraw() {
        account.withdraw(50);
        assertEquals(50, account.getBalance(), 0);

        account.withdraw(60);
        assertEquals(50, account.getBalance(), 0);

        account.withdraw(40);
        assertEquals(10, account.getBalance(), 0);
    }
}
