package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = createGridPane();

        ScrollPane scrollPane = createScrollPane();
        VBox imageBox = createImageBox();
        scrollPane.setContent(imageBox);

        gridPane.add(scrollPane, 0, 0, 1, 2);

        ListView<String> listView = createListView();
        gridPane.add(listView, 1, 0, 1, 1);
        listView.setStyle("-fx-background-color: black;");

        TextField textField = createTextField();
        gridPane.add(textField, 1, 1, 1, 1);
        textField.setStyle("-fx-background-color: blue;");

        Scene scene = new Scene(gridPane, 800, 600);
       
        
        primaryStage.setTitle("Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ColumnConstraints colum1 = new ColumnConstraints();
        colum1.setPercentWidth(35);
        ColumnConstraints colum2 = new ColumnConstraints();
        colum2.setPercentWidth(65);
        gridPane.getColumnConstraints().addAll(colum1, colum2);

        RowConstraints fila1 = new RowConstraints();
        fila1.setPercentHeight(70);
        RowConstraints fila2 = new RowConstraints();
        fila2.setPercentHeight(30);
        gridPane.getRowConstraints().addAll(fila1, fila2);

        return gridPane;
    }

    private ScrollPane createScrollPane() {
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        return scrollPane;
    }

    private VBox createImageBox() {
        VBox imageBox = new VBox();
        imageBox.setSpacing(10);

        Image icono1 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono1.png");
        ImageView imageView1 = new ImageView(icono1);
        imageView1.setFitHeight(50);
        imageView1.setFitWidth(50);
        Label label1 = new Label("nombre y apellido");
        label1.setAlignment(Pos.CENTER);
        VBox.setMargin(label1, new Insets(5));
        HBox hbox1 = new HBox(imageView1, label1);
        hbox1.setAlignment(Pos.CENTER_LEFT);
        hbox1.setSpacing(10);
        hbox1.setPadding(new Insets(5));
        hbox1.setBorder(new Border(new BorderStroke(
                Color.PURPLE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        imageBox.getChildren().add(hbox1);
        Image icono2 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono2.png");
        ImageView imageView2 = new ImageView(icono2);
        imageView2.setFitHeight(50);
        imageView2.setFitWidth(50);
        Label label2 = new Label("nombre y apellido");
        label2.setAlignment(Pos.CENTER);
        VBox.setMargin(label1, new Insets(5));
        HBox hbox2 = new HBox(imageView2, label2);
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.setSpacing(10);
        hbox2.setPadding(new Insets(5));
        hbox2.setBorder(new Border(new BorderStroke(
                Color.PURPLE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        imageBox.getChildren().add(hbox2);
        Image icono3 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono3.png");
        ImageView imageView3 = new ImageView(icono3);
        imageView3.setFitHeight(50);
        imageView3.setFitWidth(50);
        Label label3 = new Label("nombre y apellido");
        label3.setAlignment(Pos.CENTER);
        VBox.setMargin(label3, new Insets(5));
        HBox hbox3 = new HBox(imageView3, label3);
        hbox3.setAlignment(Pos.CENTER_LEFT);
        hbox3.setSpacing(10);
        hbox3.setPadding(new Insets(5));
        hbox3.setBorder(new Border(new BorderStroke(
                Color.PURPLE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        imageBox.getChildren().add(hbox3);
        Image icono4 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono4.png");
        ImageView imageView4 = new ImageView(icono4);
        imageView4.setFitHeight(50);
        imageView4.setFitWidth(50);
        Label label4 = new Label("nombre y apellido");
        label1.setAlignment(Pos.CENTER);
        VBox.setMargin(label4, new Insets(5));
        HBox hbox4 = new HBox(imageView4, label4);
        hbox4.setAlignment(Pos.CENTER_LEFT);
        hbox4.setSpacing(10);
        hbox4.setPadding(new Insets(5));
        hbox4.setBorder(new Border(new BorderStroke(
                Color.PURPLE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        imageBox.getChildren().add(hbox4);
        Image icono5 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono5.png");
        ImageView imageView5 = new ImageView(icono5);
        imageView5.setFitHeight(50);
        imageView5.setFitWidth(50);
        Label label5 = new Label("nombre y apellido");
        label5.setAlignment(Pos.CENTER);
        VBox.setMargin(label5, new Insets(5));
        HBox hbox5 = new HBox(imageView5, label5);
        hbox5.setAlignment(Pos.CENTER_LEFT);
        hbox5.setSpacing(10);
        hbox5.setPadding(new Insets(5));
        hbox5.setBorder(new Border(new BorderStroke(
                Color.PURPLE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        imageBox.getChildren().add(hbox5);

        return imageBox;
    }

    private ListView<String> createListView() {
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("ejemplo 1", "ejemplo 2", "ejemplo 3");
        listView.setBorder(new Border(new BorderStroke(
                Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        return listView;
    }

    private TextField createTextField() {
        TextField textField = new TextField();
        textField.setText("");
        textField.setBorder(new Border(new BorderStroke(
                Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        return textField;
    }

    public static void main(String[] args) {
        launch(args);
    }
}