import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.concurrent.*;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;




public class FxTest extends Application {
	
	
	
	private int count=0;
 	

	
	
	
	public void init()
	{
		System.out.println("init");
		
	}
	
	public void start(Stage myStage)
	{
		  final NumberAxis xAxis = new NumberAxis();
	        final NumberAxis yAxis = new NumberAxis();
	        xAxis.setLabel("Number of Month");
	        //creating the chart
	        final LineChart<Number,Number> lineChart = 
	                new LineChart<Number,Number>(xAxis,yAxis);
	        lineChart.setPrefSize(400, 400);
	                
	        lineChart.setTitle("Stock Monitoring, 2010");
	        //defining a series
	        XYChart.Series series = new XYChart.Series();
	        series.setName("My portfolio");
	        //populating the series with data
	        series.getData().add(new XYChart.Data(1, 23));
	        series.getData().add(new XYChart.Data(2, 14));
	        series.getData().add(new XYChart.Data(3, 15));
	        series.getData().add(new XYChart.Data(4, 24));
	        series.getData().add(new XYChart.Data(5, 34));
	        series.getData().add(new XYChart.Data(6, 36));
	        series.getData().add(new XYChart.Data(7, 22));
	        series.getData().add(new XYChart.Data(8, 45));
	        series.getData().add(new XYChart.Data(9, 43));
	        series.getData().add(new XYChart.Data(10, 17));
	        series.getData().add(new XYChart.Data(11, 29));
	        series.getData().add(new XYChart.Data(12, 25));
	        lineChart.getData().add(series);
		  
		
		Task<Integer> task = new Task<Integer>() {
		     public Integer call() throws  InterruptedException {
		    	  Thread.sleep(10000);
		        int i;
		        for ( i=1; i<=10000; i++) {
		            if (isCancelled()) {
		            
		           break;
		               
		            }
		            updateProgress(i, 10000);
		           
		        }
		        System.out.println(i);
		    	Integer j=i;
		     	return j;
	 
		    }
		};

		ProgressBar bar = new ProgressBar();
		bar.progressProperty().bind(task.progressProperty());
		
		System.out.println("start");
		myStage.setTitle("JavaFx Skeleton");
		FlowPane rootNode=new FlowPane(Orientation.VERTICAL,10,10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene=new Scene(rootNode,1200,600);
		myStage.setScene(myScene);
		Label label=new Label("");
		
   ObservableList<String> hashtypes= FXCollections.observableArrayList("djb2","sdbm","loselose");
   
   ListView<String> lv=new ListView(hashtypes);
   lv.setPrefSize(100, 80);
   MultipleSelectionModel<String> lvselectmodel=lv.getSelectionModel();
   lvselectmodel.selectedItemProperty().addListener((a,b,c)->label.setText(c));
   
   Button bt=new Button("Calculate");
   bt.setOnAction((n)->{ 
	    new Thread(task).start();
	   });
   
   rootNode.getChildren().addAll(lv,label,bt,lineChart);

	 myStage.show();

	}
	public void stop()
	{
		System.out.println("stop");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("launching javaFx application");
		launch(args);

	}

}
