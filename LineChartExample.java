import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 

public class LineChartExample extends ApplicationFrame {

   public LineChartExample( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Years","Emmisions",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private CategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( 288000 , "CO2" , "1970" );
      dataset.addValue( 309000 , "CO2" , "1975" );
      dataset.addValue(  320000 , "CO2" ,  "1980" );
      dataset.addValue( 291000 , "CO2" , "1985" );
      dataset.addValue( 273000 , "CO2" , "1990" );

      dataset.addValue( 684000 , "N2O" , "1970" );
      dataset.addValue( 683000 , "N2O" , "1975" );
      dataset.addValue( 694000 , "N2O" ,  "1980" );
      dataset.addValue( 666000 , "N2O" , "1985" );
      dataset.addValue( 667000 , "N2O" , "1990" );

      dataset.addValue( 4690000 , "CH2" , "1970" );
      dataset.addValue( 4620000 , "CH2" , "1975" );
      dataset.addValue( 4890000 , "CH2" ,  "1980" );
      dataset.addValue( 4770000 , "CH2" , "1985" );
      dataset.addValue( 5090000 , "CH2" , "1990" );


      return dataset;
   }
   
   public static void main( String[ ] args ) {
      LineChartExample chart = new LineChartExample(
         "Emmisions Over Years" ,
         "Emmisions Over The Years");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}