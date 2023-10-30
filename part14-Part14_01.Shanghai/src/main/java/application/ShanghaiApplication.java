package application;

import javafx.application.Application;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create X-axis and Y axis
        NumberAxis xAxis = new NumberAxis(2006,2018,4);
        NumberAxis yAxis = new NumberAxis();

        // set label for axis
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        //create a data set
        XYChart.Series xySeries = new XYChart.Series();
        xySeries.setName("Shanghai");

        // add data manually
        xySeries.getData().add(new XYChart.Data(2007, 73));
        xySeries.getData().add(new XYChart.Data(2008, 68));
        xySeries.getData().add(new XYChart.Data(2009, 72));
        xySeries.getData().add(new XYChart.Data(2010, 72));
        xySeries.getData().add(new XYChart.Data(2011,74));
        xySeries.getData().add(new XYChart.Data(2012, 73));
        xySeries.getData().add(new XYChart.Data(2013, 76));
        xySeries.getData().add(new XYChart.Data(2014, 73));
        xySeries.getData().add(new XYChart.Data(2015, 67));
        xySeries.getData().add(new XYChart.Data(2016, 56));
        xySeries.getData().add(new XYChart.Data(2017, 56));
        
        
        // add the data into linechart
        lineChart.getData().add(xySeries);
        
        
        //display the chart
        Scene view =new Scene(lineChart);
        primaryStage.setScene(view);
        primaryStage.show();
    }

}
