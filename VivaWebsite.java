import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class VivaWebsite extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        HBox header = new HBox(20);
        header.setPadding(new Insets(15, 20, 15, 20));
        header.setStyle("-fx-background-color: #2c3e50;");

        Label logo = new Label("MyJavaFXSite");
        logo.setTextFill(Color.WHITE);
        logo.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button btnHome = createNavButton("Home");
        Button btnAbout = createNavButton("About");
        Button btnContact = createNavButton("Contact");

        header.getChildren().addAll(logo, spacer, btnHome, btnAbout, btnContact);

        VBox sidebar = new VBox(10);
        sidebar.setPadding(new Insets(20));
        sidebar.setPrefWidth(150);
        sidebar.setStyle("-fx-background-color: #ecf0f1;");
        sidebar.getChildren().addAll(new Label("Dashboard"), new Label("Settings"), new Label("Profile"));

        VBox content = new VBox(20);
        content.setPadding(new Insets(40));
        content.setAlignment(Pos.TOP_LEFT);

        Label title = new Label("Welcome to the Landing Page");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        Label description = new Label("This is a simple website-style layout designed using JavaFX components.");
        description.setWrapText(true);

        content.getChildren().addAll(title, description);

        BorderPane root = new BorderPane();
        root.setTop(header);
        root.setLeft(sidebar);
        root.setCenter(content);

        Scene scene = new Scene(root, 900, 600);
        primaryStage.setTitle("JavaFX Website Design Concept");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createNavButton(String text) 
    {
        Button btn = new Button(text);
        btn.setStyle("-fx-background-color: transparent; -fx-text-fill: white; -fx-cursor: hand;");
        return btn;
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
