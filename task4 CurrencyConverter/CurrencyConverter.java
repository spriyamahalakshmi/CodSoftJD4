import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defining exchange rates 
        final double usdToEur = 0.90; // 1 USD = 0.90 EUR (approximate)
        final double usdToJpy = 114.13; // 1 USD = 114.13 JPY (approximate)

        
        System.out.println("Welcome to the Currency Converter!");

        // Getting user input for from and to currencies
        System.out.print("Enter the currency you want to convert from: ");
        String fromCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the currency you want to convert to: ");
        String toCurrency = scanner.nextLine().toUpperCase();

        // Getting user input for amount
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Performming conversion based on user input
        double convertedAmount = 0.0;
        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "EUR":
                        convertedAmount = amount * usdToEur;
                        break;
                    case "JPY":
                        convertedAmount = amount * usdToJpy;
                        break;
                    default:
                        System.out.println("Conversion not supported for " + toCurrency);
                }
                break;
            case "EUR":
                //conversion logic for EUR to other currencies (modify usdToEur for actual rate)
                convertedAmount = amount * (1 / usdToEur);  // Assuming conversion rate is reciprocal
                break;
            case "JPY":
                //conversion logic for JPY to other currencies (modify usdToJpy for actual rate)
                convertedAmount = amount * (1 / usdToJpy);  // Assuming conversion rate is reciprocal
                break;
            default:
                System.out.println("Unsupported currency: " + fromCurrency);
        }

        // printing the conversion result
        if (convertedAmount != 0.0) {
            System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
        }

        scanner.close();
    }
}
