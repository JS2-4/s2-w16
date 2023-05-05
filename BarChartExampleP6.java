import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 

public class BarChartExampleP6 extends ApplicationFrame {
   
   public BarChartExampleP6( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",  //x-axis label        
         "Score",     //y-axis label
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String CD = "Carrier Delays";        
      final String LD = "Late Delays";        
      final String ND = "National Delays";        
      final String Y1 = "2004";
      final String Y2 = "2005";
      final String Y3 = "2006";
      final String Y4 = "2007";
      final String Y5 = "2008";
      final String Y6 = "2009";
      final String Y7 = "2010";
      final String Y8 = "2011";
      final String Y9 = "2012";               
      final String Y10 = "2013";               
      final String Y11 = "2014";               
      final String Y12 = "2015";               
      final String Y13 = "2016";               
             


      final DefaultCategoryDataset dataset =    new DefaultCategoryDataset( );  

      dataset.addValue( 640.0 , CD , Y1 );  
      dataset.addValue( 798.0 , CD , Y2 );  
      dataset.addValue( 889.0 , CD , Y3 );  
      dataset.addValue( 837.0 , CD , Y4 );  
      dataset.addValue( 731.0 , CD , Y5 );  
      dataset.addValue( 427.0 , CD , Y6 );  
      dataset.addValue( 359.0 , CD , Y7 );  
      dataset.addValue( 476.0 , CD , Y8 );  
      dataset.addValue( 460.0 , CD , Y9 );  
      dataset.addValue( 515.0 , CD , Y10 );  
      dataset.addValue( 819.0 , CD , Y11 );  
      dataset.addValue( 643.0 , CD , Y12 );  
      dataset.addValue( 560.0 , CD , Y13 );  
            
      dataset.addValue( 553.0 , LD , Y1 );  
      dataset.addValue( 733.0 , LD , Y2 );  
      dataset.addValue( 533.0 , LD , Y3 );  
      dataset.addValue( 803.0 , LD , Y4 );  
      dataset.addValue( 1081.0 , LD , Y5 );  
      dataset.addValue( 812.0 , LD , Y6 );  
      dataset.addValue( 904.0 , LD , Y7 );  
      dataset.addValue( 915.0 , LD , Y8 );  
      dataset.addValue( 758.0 , LD , Y9 );  
      dataset.addValue( 730.0 , LD , Y10 );  
      dataset.addValue( 1195.0 , LD , Y11 );  
      dataset.addValue( 986.0 , LD , Y12 );  
      dataset.addValue( 947.0 , LD , Y13 );

      dataset.addValue( 1992.0 , ND , Y1 );  
      dataset.addValue( 1166.0 , ND , Y2 );  
      dataset.addValue( 1205.0 , ND , Y3 );  
      dataset.addValue( 863.0 , ND , Y4 );  
      dataset.addValue( 3164.0 , ND , Y5 );  
      dataset.addValue( 1320.0 , ND , Y6 );  
      dataset.addValue( 2184.0 , ND , Y7 );  
      dataset.addValue( 1335.0 , ND , Y8 );  
      dataset.addValue( 1850.0 , ND , Y9 );  
      dataset.addValue( 827.0 , ND , Y10 );  
      dataset.addValue( 1161.0 , ND , Y11 );  
      dataset.addValue( 1116.0 , ND , Y12 );  
      dataset.addValue( 2194.0 , ND , Y13 );
             

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
    BarChartExampleP6 chart = new BarChartExampleP6("Airline Data", 
         "How are they doing?");
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}