package template;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Exits the application
        Platform.exit();
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
