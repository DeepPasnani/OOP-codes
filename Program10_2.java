import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
 
public class Program10_2 extends Application
{
    private double dx = 3;
    private boolean running = false;
    private AnimationTimer timer;
 
    @Override
    public void start(Stage stage)
    {
        Pane pane = new Pane();
        Circle ball = new Circle(20, Color.DODGERBLUE);
        ball.setCenterX(50); ball.setCenterY(150);
        pane.getChildren().add(ball);
        Slider speedSlider = new Slider(1, 15, 3);
        Button startBtn = new Button("Start");
        Button stopBtn  = new Button("Stop");
        timer = new AnimationTimer()
        {
            @Override public void handle(long now)
            {
                if (!running) return;
                dx = speedSlider.getValue() * Math.signum(dx);
                ball.setCenterX(ball.getCenterX() + dx);
                if (ball.getCenterX() + ball.getRadius() >= pane.getWidth() ||
                    ball.getCenterX() - ball.getRadius() <= 0)
                    dx = -dx;
            }
        };
        timer.start();
        startBtn.setOnAction(e -> running = true);
        stopBtn.setOnAction(e  -> running = false);
        HBox controls = new HBox(10, startBtn, stopBtn,
            new Label("Speed:"), speedSlider);
        controls.setPadding(new Insets(8));
        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(controls);
        stage.setScene(new Scene(root, 600, 350));
        stage.setTitle("Bouncing Ball");
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
