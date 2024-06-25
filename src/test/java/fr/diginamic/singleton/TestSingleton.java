package fr.diginamic.singleton;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSingleton {
    @Test
    public void testSingleton() {
        ConfigurationSingleton config1 = ConfigurationSingleton.getInstance();
        ConfigurationSingleton config2 = ConfigurationSingleton.getInstance();

        assertSame(config1, config2);

        String dbUrl = config1.getProperty("db.url");
        String dbUser = config1.getProperty("db.user");
        String dbPassword = config1.getProperty("db.password");
        System.out.println("dbUrl=" + dbUrl + ", dbUser=" + dbUser + ", dbPassword=" + dbPassword);

        assertEquals("jdbc:mysql://localhost:3306/mabase", dbUrl);
        assertEquals("root", dbUser);
        assertEquals("1234", dbPassword);
    }
}
