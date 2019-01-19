package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private LineChart<String, Number> v_t_chart;

    @FXML
    private LineChart<String, Number> u_t_chart;

    @FXML
    private Button startBtn;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField dField;

    @FXML
    private TextField startField;

    @FXML
    private TextField endField;

    @FXML
    private TextField stepField;

    @FXML
    void drawCharts(ActionEvent event) {
        ChartSeriesClass csc = new ChartSeriesClass();
        u_t_chart.getData().addAll(csc.uChartSeries(Double.parseDouble(stepField.getText()),Double.parseDouble(endField.getText()),Double.parseDouble(startField.getText()), Double.parseDouble(aField.getText()),Double.parseDouble(bField.getText()),Double.parseDouble(cField.getText()),Double.parseDouble(dField.getText())));
        v_t_chart.getData().addAll(csc.vChartSeries(Double.parseDouble(stepField.getText()),Double.parseDouble(endField.getText()),Double.parseDouble(startField.getText()), Double.parseDouble(aField.getText()),Double.parseDouble(bField.getText()),Double.parseDouble(cField.getText()),Double.parseDouble(dField.getText())));

    }

}
