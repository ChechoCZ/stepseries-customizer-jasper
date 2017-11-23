package Customizer;

import java.awt.BasicStroke;

import net.sf.jasperreports.engine.JRChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
 
public class StepSeries implements JRChartCustomizer
{ 
 
    public void customize(JFreeChart chart, JRChart jasperChart)
    {
    	XYStepRenderer renderer = new XYStepRenderer();
	    renderer.setBaseShapesVisible(true);
	    renderer.setSeriesStroke(2, new BasicStroke(2.0f));	    
	    renderer.setBaseToolTipGenerator(new StandardXYToolTipGenerator());
	    renderer.setDefaultEntityRadius(6);
	    XYPlot plot = chart.getXYPlot();
	    plot.setRenderer(renderer);
    }
}