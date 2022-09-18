import java.math.BigDecimal;
import java.math.RoundingMode;

public class A {
public static void main(String[] args) {
	

    // BigDecimal object to store the result
    BigDecimal res;

    // For user input
    // Use Scanner or BufferedReader

    // Object of String created
    // Holds the value
    String input1
        = "31.24";

    // Convert the string input to BigDecimal
    BigDecimal a
        = new BigDecimal(input1);

    // Scale for BigDecimal
   // int newScale = 5;

    try {

        // Using setScale() method
        // Using RoundingMode.CEILING
        res = a.setScale(5, RoundingMode.HALF_UP);

        // Display the result in BigDecimal
        System.out.println(res);
    }
    catch (Exception e) {

        // Print Exception
        System.out.println(e);
    }
}


}
