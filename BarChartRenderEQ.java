import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*; 
import org.jfree.ui.*; 
import java.util.*;

public class BarChartRenderEQ extends ApplicationFrame {
  //LOOK HERE
  private ImportData id = new ImportData("https://corgis-edu.github.io/corgis/datasets/csv/global_emissions/global_emissions.csv");
  
  //STUDY THIS
  public BarChartRenderEQ() {
      super( "Emmisions Data" );        
      JFreeChart barChart = ChartFactory.createBarChart(
         "Emmisions ",           
         "",            
         "",            
         createDataset(id.getData()),    //NOTICE THIS !      
         PlotOrientation.VERTICAL,           
         true, true, false);
      
      // HOW TO COLOR BARS
      // CategoryPlot plot = barChart.getCategoryPlot();
      // BarRenderer renderer = (BarRenderer) plot.getRenderer();

      // // set the color (r,g,b) or (r,g,b,a)
      // Color color = new Color(255, 129, 189);
      // Color color1 = new Color(150, 129, 189);
      // Color color2 = new Color(0, 129, 189);
      // renderer.setSeriesPaint(0, color);
      // renderer.setSeriesPaint(1, color1);
      // renderer.setSeriesPaint(2, color2);


      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
      this.pack( );          
      this.setVisible( true ); 
   }
   
   private CategoryDataset createDataset(ArrayList<Record> records) {      
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

      //Create a dataset --
      for(Record r : records){
         String airport = r.getValueByIndex(0);
         String month = r.getValueByIndex(4);
         String year = r.getValueByIndex(5);
         int delaysCarrier = Integer.parseInt(r.getValueByIndex(6));

         if(airport.equals("SFO") && month.equals("January")){
            dataset.addValue(delaysCarrier, airport, year);
         }
      }
      return dataset; 
   }

   public static void main(String[] args) {
      new BarChartRender();
   }
}