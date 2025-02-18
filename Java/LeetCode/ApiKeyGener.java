import java.security.SecureRandom;
import java.util.Base64;

public class ApiKeyGener {
    public static String getAPIKey() {
        byte[] key =  new byte[32];

        SecureRandom secRand = new SecureRandom();
        secRand.nextBytes(key);

        return Base64.getEncoder().encodeToString(key);
    }
}
