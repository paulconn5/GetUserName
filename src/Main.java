import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        // Full Name Program
        Scanner in = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

        //Favorite Number Program
        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(in, "Enter your favorite int");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Favorite int: " + favInt + "\nFavorite Double: " + favDouble);

        //Date and Time of Birth Program
        int year;
        int month;
        int day;
        int hours;
        int minutes;
        year = SafeInput.getRangedInt(in, "Enter year: ", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter month: ", 1, 12);
        day = switch (month) {
            //31 days
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "Enter day: ", 1, 31);
            //28 days
            case 2 -> SafeInput.getRangedInt(in, "Enter day: ", 1, 28);
            //30 days
            default -> SafeInput.getRangedInt(in, "Enter day: ", 1, 30);
        };
        hours = SafeInput.getRangedInt(in, "Enter hours: ", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter minutes: ", 1, 59);
        System.out.println("You were born on " +
                month + "/" + day + "/" + year + ", at " + hours + ":"
                + minutes);


        //Check out at the $10 store program
        double price;
        double total = 0;
        boolean isDone;
        do {
            price = SafeInput.getRangedDouble(in, "Enter the price", 0.50, 9.99);
            isDone = SafeInput.getYNConfirm(in, "Continue shopping?");
            total = total + price;
        }while (!isDone);
        System.out.println("Your total is: " + total);


        //RegEx is magic program;
        String SSN;
        String ucID;
        String menuChoice;
        SSN = SafeInput.getRegExString(in, "Enter the regex", "[0-9]{3}-[0-9]{2}-[0-9]{4}");
        ucID = SafeInput.getRegExString(in, "Enter the regex", "[M|m][0-9]{5}");
        menuChoice = SafeInput.getRegExString(in, "Enter the regex", "[OoSsVvQq]");
        System.out.println("SSN: " + SSN + "\nUC ID: " + ucID + "\nMenu: " + menuChoice);

        //Pretty header program;
        SafeInput.prettyHeader("My amazing super message");
    }

}