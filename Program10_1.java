import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.Random;
 
public class Program10_1 extends Application
{
    @Override
    public void start(Stage stage)
    {
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);
        Random rng = new Random();
        Font font = Font.font("Times New Roman",
                              FontWeight.BOLD, FontPosture.ITALIC, 22);
        for (int i = 1; i <= 5; i++)
        {
            Text text = new Text("Text " + i);
            text.setFont(font);
            double opacity = 0.3 + rng.nextDouble() * 0.7;
            Color color = Color.color(rng.nextDouble(),
                                      rng.nextDouble(),
                                      rng.nextDouble(), opacity);
            text.setFill(color);
            vbox.getChildren().add(text);
        }
        stage.setScene(new Scene(vbox, 400, 300));
        stage.setTitle("Text Styles");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
