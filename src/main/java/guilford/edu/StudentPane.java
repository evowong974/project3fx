package guilford.edu;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class StudentPane extends GridPane {

    // individual attribute
    private Student student;

    // Labels
    private Label nameLabel;
    private Label emailLabel;
    private Label gNumberLabel;
    private Label guilfordCreditsLabel;
    private Label transferCreditsLabel;
    
    // TextFields attributes
    private TextField nameField;
    private TextField emailField;
    private TextField gNumberField;
    private TextField guilfordCreditsField;
    private TextField transferCreditsField;
    
    // Total Button attribute 
    private Button totalButton;
    // ImageView attributes 
    private ImageView imageView;

    // constructor

    public StudentPane(Student student) {
        this.student = student;
        totalButton = new Button("Calculate Total Credits");

        // Instantiate ImagaView attribute 
        File avatar = new File(this.getClass().getResource("GuilfordTree.jpg")
        .getPath());
        this.imageView = new ImageView(avatar.toURI().toString());
        // Instantiate Labels
        this.nameLabel = new Label("Name: ");
        this.emailLabel = new Label("Email: ");
        this.gNumberLabel = new Label("G-Number: ");
        this.guilfordCreditsLabel = new Label("Guilford Credits: ");
        this.transferCreditsLabel = new Label("Transfer Credits: ");

        // Instantiate TextFields
        this.nameField = new TextField();
        this.emailField = new TextField();
        this.gNumberField = new TextField();
        this.guilfordCreditsField = new TextField();
        this.transferCreditsField = new TextField();

        // Add Labels to the GridPane
        this.add(this.nameLabel, 0, 0);
        this.add(this.emailLabel, 0, 1);
        this.add(this.gNumberLabel, 0, 2);
        this.add(this.guilfordCreditsLabel, 0, 3);
        this.add(this.transferCreditsLabel, 0, 4);

        // Add TextFields to the GridPane
        this.add(this.nameField, 1, 0);
        this.add(this.emailField, 1, 1);
        this.add(this.gNumberField, 1, 2);
        this.add(this.guilfordCreditsField, 1, 3);
        this.add(this.transferCreditsField, 1, 4);

        // Add the ImageView to the write of the GridPane
        this.add(imageView, 2, 0, 1, 5);

        // We can change the image to be of a different size
        imageView.setFitHeight(100);
        // And preserve the aspect ratio (the ratio of width to height)
        imageView.setPreserveRatio(true);
        // Rotate it by 45 degrees
        imageView.setRotate(45);
        
    }
}
