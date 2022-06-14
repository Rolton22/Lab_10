package com.example.lab_10;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Quadrilateral_List quad_list = new Quadrilateral_List();
    public static Parallelogram_List par_list = new Parallelogram_List();

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        TableView<Quadrilateral> quadrilateralTableView = new TableView<Quadrilateral>();

        TableColumn<Quadrilateral, String> x1Col = new TableColumn<Quadrilateral, String>("X1");
        TableColumn<Quadrilateral, String> x2Col = new TableColumn<Quadrilateral, String>("X2");
        TableColumn<Quadrilateral, String> x3Col = new TableColumn<Quadrilateral, String>("X3");
        TableColumn<Quadrilateral, String> x4Col = new TableColumn<Quadrilateral, String>("X4");
        TableColumn<Quadrilateral, String> y1Col = new TableColumn<Quadrilateral, String>("Y1");
        TableColumn<Quadrilateral, String> y2Col = new TableColumn<Quadrilateral, String>("Y2");
        TableColumn<Quadrilateral, String> y3Col = new TableColumn<Quadrilateral, String>("Y3");
        TableColumn<Quadrilateral, String> y4Col = new TableColumn<Quadrilateral, String>("Y4");
        TableColumn<Quadrilateral, String> sideACol = new TableColumn<Quadrilateral, String>("Side A");
        TableColumn<Quadrilateral, String> sideBCol = new TableColumn<Quadrilateral, String>("Side B");
        TableColumn<Quadrilateral, String> sideCCol = new TableColumn<Quadrilateral, String>("Side C");
        TableColumn<Quadrilateral, String> sideDCol = new TableColumn<Quadrilateral, String>("Side D");
        TableColumn<Quadrilateral, String> diagonal1Col = new TableColumn<Quadrilateral, String>("Diagonal N");
        TableColumn<Quadrilateral, String> diagonal2Col = new TableColumn<Quadrilateral, String>("Diagonal M");
        TableColumn<Quadrilateral, String> perimeterCol = new TableColumn<Quadrilateral, String>("Perimeter");
        TableColumn<Quadrilateral, String> squareCol = new TableColumn<Quadrilateral, String>("Square");

        x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        x4Col.setCellValueFactory(new PropertyValueFactory<>("x4"));
        y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        y4Col.setCellValueFactory(new PropertyValueFactory<>("y4"));
        sideACol.setCellValueFactory(new PropertyValueFactory<>("sideA"));
        sideBCol.setCellValueFactory(new PropertyValueFactory<>("sideB"));
        sideCCol.setCellValueFactory(new PropertyValueFactory<>("sideC"));
        sideDCol.setCellValueFactory(new PropertyValueFactory<>("sideD"));
        diagonal1Col.setCellValueFactory(new PropertyValueFactory<>("diagonal1"));
        diagonal2Col.setCellValueFactory(new PropertyValueFactory<>("diagonal2"));
        perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
        squareCol.setCellValueFactory(new PropertyValueFactory<>("square"));

        x1Col.setSortType(TableColumn.SortType.DESCENDING);


        ObservableList<Quadrilateral> quadrilateralList = getQuadrilateralList();
        quadrilateralTableView.setItems(quadrilateralList);

        quadrilateralTableView.getColumns().addAll(x1Col, x2Col, x3Col, x4Col, y1Col, y2Col, y3Col, y4Col, sideACol, sideBCol, sideCCol, sideDCol, diagonal1Col, diagonal2Col, perimeterCol, squareCol);


        //--------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<Parallelogram> parallelogramTableView = new TableView<Parallelogram>();

        TableColumn<Parallelogram, String> par_x1Col = new TableColumn<Parallelogram, String>("X1");
        TableColumn<Parallelogram, String> par_x2Col = new TableColumn<Parallelogram, String>("X2");
        TableColumn<Parallelogram, String> par_x3Col = new TableColumn<Parallelogram, String>("X3");
        TableColumn<Parallelogram, String> par_x4Col = new TableColumn<Parallelogram, String>("X4");
        TableColumn<Parallelogram, String> par_y1Col = new TableColumn<Parallelogram, String>("Y1");
        TableColumn<Parallelogram, String> par_y2Col = new TableColumn<Parallelogram, String>("Y2");
        TableColumn<Parallelogram, String> par_y3Col = new TableColumn<Parallelogram, String>("Y3");
        TableColumn<Parallelogram, String> par_y4Col = new TableColumn<Parallelogram, String>("Y4");
        TableColumn<Parallelogram, String> par_sideACol = new TableColumn<Parallelogram, String>("Side A");
        TableColumn<Parallelogram, String> par_sideBCol = new TableColumn<Parallelogram, String>("Side B");
        TableColumn<Parallelogram, String> par_sideCCol = new TableColumn<Parallelogram, String>("Side C");
        TableColumn<Parallelogram, String> par_sideDCol = new TableColumn<Parallelogram, String>("Side D");
        TableColumn<Parallelogram, String> par_diagonal1Col = new TableColumn<Parallelogram, String>("Diagonal N");
        TableColumn<Parallelogram, String> par_diagonal2Col = new TableColumn<Parallelogram, String>("Diagonal M");
        TableColumn<Parallelogram, String> par_perimeterCol = new TableColumn<Parallelogram, String>("Perimeter");
        TableColumn<Parallelogram, String> par_squareCol = new TableColumn<Parallelogram, String>("Square");

        par_x1Col.setCellValueFactory(new PropertyValueFactory<>("x1"));
        par_x2Col.setCellValueFactory(new PropertyValueFactory<>("x2"));
        par_x3Col.setCellValueFactory(new PropertyValueFactory<>("x3"));
        par_x4Col.setCellValueFactory(new PropertyValueFactory<>("x4"));
        par_y1Col.setCellValueFactory(new PropertyValueFactory<>("y1"));
        par_y2Col.setCellValueFactory(new PropertyValueFactory<>("y2"));
        par_y3Col.setCellValueFactory(new PropertyValueFactory<>("y3"));
        par_y4Col.setCellValueFactory(new PropertyValueFactory<>("y4"));
        par_sideACol.setCellValueFactory(new PropertyValueFactory<>("sideA"));
        par_sideBCol.setCellValueFactory(new PropertyValueFactory<>("sideB"));
        par_sideCCol.setCellValueFactory(new PropertyValueFactory<>("sideC"));
        par_sideDCol.setCellValueFactory(new PropertyValueFactory<>("sideD"));
        par_diagonal1Col.setCellValueFactory(new PropertyValueFactory<>("diagonal1"));
        par_diagonal2Col.setCellValueFactory(new PropertyValueFactory<>("diagonal2"));
        par_perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
        par_squareCol.setCellValueFactory(new PropertyValueFactory<>("square"));

        x1Col.setSortType(TableColumn.SortType.DESCENDING);


        ObservableList<Parallelogram> parallelogramList = getParallelogramList();
        parallelogramTableView.setItems(parallelogramList);

        parallelogramTableView.getColumns().addAll(par_x1Col, par_x2Col, par_x3Col, par_x4Col, par_y1Col, par_y2Col, par_y3Col, par_y4Col, par_sideACol, par_sideBCol, par_sideCCol, par_sideDCol, par_diagonal1Col, par_diagonal2Col, par_perimeterCol, par_squareCol);


        Label quadrilaterals_label = new Label("Quadrilaterals:");
        Label parallelograms_label = new Label("Parallelogram:");

        Label averageSquarelabel = new Label("Average area of quadrilaterals : " + quad_list.findAverageArea());
        Label maxParSquarelabel = new Label("Max square of quadrilaterals : " + par_list.findParallelogram_List_MaxSquare());
        Label minParSquarelabel = new Label("Min square of quadrilaterals : " +  par_list.findParallelogram_List_MinSquare());


        quadrilaterals_label.setPadding(new Insets(15));
        quadrilaterals_label.setFont(Font.font(15));

        parallelograms_label.setPadding(new Insets(15));
        parallelograms_label.setFont(Font.font(15));

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.getChildren().add(quadrilaterals_label);
        root.getChildren().add(quadrilateralTableView);
        root.getChildren().add(averageSquarelabel);
        root.getChildren().add(parallelograms_label);
        root.getChildren().add(parallelogramTableView);
        root.getChildren().add(maxParSquarelabel);
        root.getChildren().add(minParSquarelabel);



        Scene scene = new Scene(root, 1300, 500);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Quadrilateral> getQuadrilateralList() {

        final int N = 5;
        int X1, X2, X3, X4;
        int Y1, Y2, Y3, Y4;

        ObservableList<Quadrilateral> quadrilateralObservableList = FXCollections.observableArrayList();
        for (int i = 0; i < N; i++) {
            while (!Quadrilateral.isQuadliteralExists(X1 = (int) (Math.random() * 11), X2 = (int) (Math.random() * 11), X3 = (int) (Math.random() * 11), Y1 = (int) (Math.random() * 11), Y2 = (int) (Math.random() * 11), Y3 = (int) (Math.random() * 11), X4 = (int) (Math.random() * 11), Y4 = (int) (Math.random() * 11))) {
            }
            quadrilateralObservableList.add(new Quadrilateral(X1, X2, X3, X4, Y1, Y2, Y3, Y4));
            quad_list.add(new Quadrilateral(X1, X2, X3, X4, Y1, Y2, Y3, Y4));
        }
        return quadrilateralObservableList;
    }

    private ObservableList<Parallelogram> getParallelogramList() {
        final int N = 10;
        int X1, X2, X3, X4;
        int Y1, Y2, Y3, Y4;
        ObservableList<Parallelogram> parallelogramObservableList = FXCollections.observableArrayList();
        for (int i = 0; i < N; i++) {
            while (!Parallelogram.isQuadliteralExists(X1 = (int) (Math.random() * 11), X2 = (int) (Math.random() * 11), X3 = (int) (Math.random() * 11), Y1 = (int) (Math.random() * 11), Y2 = (int) (Math.random() * 11), Y3 = (int) (Math.random() * 11), X4 = (int) (Math.random() * 11), Y4 = (int) (Math.random() * 11))) {
            }
            parallelogramObservableList.add(new Parallelogram(X1, X2, X3, X4, Y1, Y2, Y3, Y4));
            par_list.add(new Parallelogram(X1, X2, X3, X4, Y1, Y2, Y3, Y4));
        }
        return parallelogramObservableList;

    }
}