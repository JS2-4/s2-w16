import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 

public class LineChartEmmisions extends ApplicationFrame {

   public LineChartEmmisions( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Years (By Two)","Emmisions Production CO2",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private CategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( 1091.239 , "United States" , "1992" );
      dataset.addValue( 1145.894 , "United States" , "1994" );
      dataset.addValue( 1215.071 , "United States" , "1996" );
      dataset.addValue( 1200.762 , "United States" , "1998" );      
      dataset.addValue( 1257.599 , "United States" , "2000" );
      dataset.addValue( 1244.766 , "United States" , "2002" );
      dataset.addValue( 1217.622 , "United States" , "2004" );
      dataset.addValue( 1182.917 , "United States" , "2006" );
      dataset.addValue( 1266.645 , "United States" , "2008" );
      dataset.addValue( 1308.832 , "United States" , "2010" );
      dataset.addValue( 1388.255 , "United States" , "2012" );
      dataset.addValue( 1455.804 , "United States" , "2014" );
      dataset.addValue( 1502.475 , "United States" , "2016" );
      dataset.addValue( 1641.041 , "United States" , "2018" );

      return dataset;
   }
   
   public static void main( String[ ] args ) {
      LineChartEmmisions chart = new LineChartEmmisions(
         "Emmisions Over Years" ,
         "Emmisions In CO2");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}