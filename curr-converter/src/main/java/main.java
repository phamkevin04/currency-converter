import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class main {

    // main  function
    public static void main(String[] args) {
        System.out.println("\n----------------------------------");
        System.out.println("Welcome to the currency converter!");

        systemInformationOfCurrency();
        String currencyFromUser = getCurrencyFromString();
        String currencyFromLowercase = checkCurrencyFrom(currencyFromUser);

        if(currencyFromLowercase == "na") {
            exit(0);
        }

        System.out.println("\n");

        String currencyToUser = getCurrencyToString();
        String currencyToLowercase = checkCurrencyTo(currencyToUser);


    }

    // informational about the type of currencies the system takes
    static void systemInformationOfCurrency() {
        System.out.println("The system currently only takes the follow currencies: ");
        System.out.println("(1) United State Dollar");
        System.out.println("(2) Vietnam Dong");
        System.out.println("(3) Japanese Yen");

    }

    // get Currency from the user via user input
    static String getCurrencyFromString() {
        System.out.print("Please type in what currency you would like to convert from: ");
        Scanner scan = new Scanner(System.in);
        String fromCurrency = scan.nextLine();

        return  fromCurrency;
    }

    // check Currency typed in from the user
    static String checkCurrencyFrom(String fromCurrency) {
        String currencyType = "";
        fromCurrency = fromCurrency.toLowerCase(Locale.ROOT);

        if(fromCurrency.contains("united") || fromCurrency.contains("states") || fromCurrency.contains("usd")) {
            System.out.println("USD was selected");
            currencyType = "usd";
        }

        else if(fromCurrency.contains("vietnam") || fromCurrency.contains("dong")) {
            System.out.println("Dong was selected");
            currencyType = "dong";
        }

        else if(fromCurrency.contains("japan") || fromCurrency.contains("yen")) {
            System.out.println("Yen was selected");
            currencyType = "yen";
        }

        else {
            System.out.println("Looks like your input was not a keyword, exiting now");
            currencyType = "na"; // na = not avaliable
        }

        return currencyType;
    }

    // get Currency from the user via user input for the to currency
    static String getCurrencyToString() {
        System.out.print("Please type in what currency you would like to convert to: ");
        Scanner scan = new Scanner(System.in);
        String toCurrency = scan.nextLine();

        return  toCurrency;
    }

    // check Currency typed in for the TO currency from the user
    static String checkCurrencyTo(String fromCurrency) {
        String currencyType = "";
        fromCurrency = fromCurrency.toLowerCase(Locale.ROOT);

        if(fromCurrency.contains("united") || fromCurrency.contains("states") || fromCurrency.contains("usd")) {
            System.out.println("USD was selected");
            currencyType = "usd";
        }

        else if(fromCurrency.contains("vietnam") || fromCurrency.contains("dong")) {
            System.out.println("Dong was selected");
            currencyType = "dong";
        }

        else if(fromCurrency.contains("japan") || fromCurrency.contains("yen")) {
            System.out.println("Yen was selected");
            currencyType = "yen";
        }

        else {
            System.out.println("Looks like your input was not a keyword, exiting now");
            currencyType = "na"; // na = not avaliable
        }

        return currencyType;
    }

}
