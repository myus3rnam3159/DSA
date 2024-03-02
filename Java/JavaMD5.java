package Java;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}