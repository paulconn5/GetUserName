import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString;  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        int retInt = 0;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                done = true;
            } else {
                System.out.println("You must enter a integer.");
            }
            pipe.nextLine();
        }while(!done);
        return retInt;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        int retInt = 0;
        do {
            System.out.print("\n" + prompt + low + "-" + high + ": "); // show prompt add space
            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    done = true;
                }
                else {
                    System.out.println("You must enter an integer between " + low + "-" + high);
                }
            } else {
                System.out.println("You must enter an integer.");
            }
            pipe.nextLine();
        }while(!done);
        return retInt;

    }

    public static double getDouble(Scanner pipe, String prompt) {
        boolean done = false;
        double retDouble = 0;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                done = true;
            } else {
                System.out.println("You must enter a double.");
            }
            pipe.nextLine();
        }while(!done);
        return retDouble;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean done = false;
        double retDouble = 0;
        do {
            System.out.print("\n" + prompt + ": " + low + "-" + high + ": "); // show prompt add space
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high) {
                    done = true;
                }
                else {
                    System.out.println("You must enter a double between " + low + "-" + high);
                }
            } else {
                System.out.println("You must enter a double.");
            }
            pipe.nextLine();
        }while(!done);
        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean complete = false;
        boolean retBool = false;
        String retString;
        do {
           System.out.print("\n" + prompt + ": "); // show prompt add space
           retString = pipe.nextLine();
           if (retString.equalsIgnoreCase("Y")) {
               complete = true;
           }
           else if (retString.equalsIgnoreCase("N")) {
               complete = true;
               retBool = true;
           }
           else {
               System.out.println("Enter [Y/N]");
           }
       }while(!complete);
    return retBool;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String retString;
        do {
            System.out.print("\n" + prompt + " " + regEx + ": "); // show prompt add space
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                done = true;
            }
            else {System.out.println("You must follow the regex pattern!");}
        } while(!done);

        return retString;

    }

    //Pretty Header Program
    public static void prettyHeader(String msg) {
        for (int i=1; i<61; i++) {
            System.out.print("*");
        }
        System.out.print("\n***");
        for (double s = 0.5*(54-msg.length()); s>0; s--) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (double s = 0.5*(54-msg.length()); s>0; s--) {
            System.out.print(" ");
        }
        System.out.print("***\n");
        for (int i=1; i<61; i++) {
            System.out.print("*");
        }
    }
}


