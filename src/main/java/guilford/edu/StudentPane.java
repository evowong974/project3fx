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
    private Label studentYearLabel;
    private Label studyAwayLabel;
    private Label graduationYearLabel;
    
    // TextFields attributes
    private TextField nameField;
    private TextField emailField;
    private TextField studentYearField;
    private TextField studyAwayField;
    private TextField graduationYearField;


    
    // Submit Button attribute 
    private Button submitButton;


    // ImageView attributes 
    private ImageView imageView;

    

    // constructor

    public StudentPane(Student student) {
        this.student = student;
        submitButton = new Button("Submit");

        // Instantiate ImagaView attribute  
        File avatar = new File(this.getClass().getResource("GuilfordTree.jpg")
        .getPath());
        System.out.println("file:" + avatar.getPath());
        this.imageView = new ImageView("file:" + avatar.getPath());
        
        // Instantiate Labels
        this.nameLabel = new Label("Name");
        this.emailLabel = new Label("Email");
        this.studentYearLabel = new Label("Student Year");
        this.studyAwayLabel = new Label("Study Away");
        this.graduationYearLabel = new Label("Graduation Year");



        // Instantiate TextFields
        this.nameField = new TextField();
        this.emailField = new TextField();
        this.studentYearField = new TextField();    
        this.studyAwayField = new TextField();
        this.graduationYearField = new TextField();


        // Add Labels to the GridPane
        this.add(this.nameLabel, 0, 0);
        this.add(this.emailLabel, 0, 1);
        this.add(this.studentYearLabel, 0, 2);
        this.add(this.studyAwayLabel, 0, 3);
        this.add(this.graduationYearLabel, 0, 4);

        // Add TextFields to the GridPane
        this.add(this.nameField, 1, 0);
        this.add(this.emailField, 1, 1);
        this.add(this.studentYearField, 1, 2);
        this.add(this.studyAwayField, 1, 3);
        this.add(this.graduationYearField, 1, 4);
    

        // Add the Submit Button to the GridPane
        this.add(this.submitButton, 1, 5);

        // Add the ImageView to the write of the GridPane
        this.add(imageView, 2, 0, 1, 5);


        // We can change the image to be of a different size
        imageView.setFitHeight(200);
        // And preserve the aspect ratio (the ratio of width to height)
        imageView.setPreserveRatio(true);
        // // Rotate it by 45 degrees
        // imageView.setRotate(45);

        // Add a listener for the Submit Button that changes the labels
        // Set the name label to the name field's text
        this.submitButton.setOnAction(e -> {
            this.nameLabel.setText("Name: " + nameField.getText());
            this.emailLabel.setText("Email: " + emailField.getText());
            this.studentYearLabel.setText("Student Year: " + studentYearField.getText());
            this.studyAwayLabel.setText("Study Away: " + studyAwayField.getText());
            this.graduationYearLabel.setText("Graduation Year: " + graduationYearField.getText());
            System.out.println(e.toString());
        });

        // Steps 4 and 5: Write an event listener and connect it to the component
        // that triggers the event
        // rotate the image by 90 degrees everytime the user clicks on the image
        imageView.setOnMouseClicked(e -> {
            imageView.setRotate(imageView.getRotate() + 90);
            
        });


        }





    
}

