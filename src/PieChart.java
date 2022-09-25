
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.Value;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohammedhamdy32
 */
public class PieChart extends JFrame{
    int size;
    String []items=null;
    int []values=new int[4];

    public PieChart(String a ,String b,String s[],int values[],int size)
            {
                this.size=size;
                items=new String [size];
                PieDataset dataset = creatDataset(s,values);
                JFreeChart chart =createChart(dataset,b);
                ChartPanel charPanel=new ChartPanel(chart);
                charPanel.setPreferredSize(new java.awt.Dimension(500,300));
                setContentPane(charPanel);
                this.size=size;
                
            }
    public void setItems(String s[])
    {
        items=s;
    }
    public void setValues(int v[])
    {
        values=v;
    }
    private PieDataset creatDataset(String s[],int v[])
    {
        setItems(s);
        setValues(v);
        DefaultPieDataset result = new DefaultPieDataset();
        for(int i=0 ; i<size;i++)
        {
            result.setValue(items[i],v[i]);
           
        }
//        result.setValue("hallo", 50);
//        result.setValue("hi", 50);
//        result.setValue("mac", WIDTH);
        return result;
    }
    private JFreeChart createChart (PieDataset dataset ,String title)
    {
        JFreeChart chart =ChartFactory.createPieChart3D(title, dataset, true, true, false);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    public static void main(String[] args) {
        {
            String []s=new String[4];
            s[0]="hh";
            s[1]="ff";
            s[2]="fff";
            s[3]="frrf";
            int []value=new int[4];
            value[0]=20;
            value[1]=40;
            value[2]=50;
            value[3]=60;

            PieChart cc=new PieChart("Pir chart", "Pie Chart for votting",s,value,4);
            cc.pack();
            cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cc.setVisible(true);
        }
    }
    
}
