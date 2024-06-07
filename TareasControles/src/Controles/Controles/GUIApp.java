package Controles;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GUIApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear los controles
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        
        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        
        Label selectionLabel = new Label();
        Label selectionLabel2 = new Label(); 
        Rectangle colorRect = new Rectangle(80 , 20); 
        
        Button confirmButton = new Button("Confirmar");

        confirmButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue().toString();
            
            Color selectedColor = colorPicker.getValue();
            
            selectionLabel.setText("Fecha seleccionada: " + selectedDate);
            selectionLabel2.setText("Color seleccionado: "); 

            colorRect.setFill(selectedColor); // Mostrar el color seleccionado en el cuadro de muestra
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        
        // Agregar los controles en el orden deseado
        root.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton, selectionLabel, selectionLabel2, colorRect);

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Controles DatePicker y ColorPicker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
