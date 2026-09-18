import java.io.FileWriter;
import java.io.IOException;

public class filemanager {

    private static final String FILE_NAME =
            "feedback.txt";

    public static void saveFeedback(feedback feedback) {

        try {

            FileWriter writer =
                    new FileWriter(FILE_NAME, true);

            writer.write(
                    feedback.toString() + "\n"
            );

            writer.close();

            System.out.println(
                    "Feedback saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving feedback."
            );
        }
    }
}
