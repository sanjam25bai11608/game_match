import java.util.Scanner;

public class inputvalidator {

    public static int getInteger(
            Scanner scanner,
            String message) {

        while (true) {

            try {

                System.out.print(message);

                int value =
                        Integer.parseInt(scanner.nextLine());

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );
            }
        }
    }

    public static double getRating(
            Scanner scanner,
            String message) {

        while (true) {

            try {

                System.out.print(message);

                double rating =
                        Double.parseDouble(scanner.nextLine());

                if (rating >= 0 && rating <= 10) {
                    return rating;
                }

                System.out.println(
                        "Rating must be between 0 and 10."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid rating."
                );
            }
        }
    }

    public static String getText(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty."
            );
        }
    }
}
