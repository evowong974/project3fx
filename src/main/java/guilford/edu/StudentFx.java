package guilford.edu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentFx extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate a VBox root node
        VBox root = new VBox();
        // Add a label to the root node
        // root.getChildren().add(new Label("Hello World!"));

        // Instantiate a default Individual object
        Student student = new Student();

        // Instantiate an StudentPane object and add it to the root node
        root.getChildren().add(new StudentPane(student));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}