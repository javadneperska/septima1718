package readtreetxt;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;



@SuppressWarnings("serial")
public class drawTree extends JFrame{

    public static void main(String[] args) {

        new drawTree();
                
    }



    
    public drawTree(){

        this.setSize(500, 500);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //this.setUndecorated(true);
        this.setTitle("Family Tree");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new DrawGraphics(), BorderLayout.CENTER);
        this.setVisible(false);
        
        
    }
    
    private class DrawGraphics extends JComponent {
        public void paint(Graphics g){
         Graphics2D graph2 = (Graphics2D)g;
         graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         
         graph2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    
         graph2.setStroke(new BasicStroke(6));
         graph2.setPaint(Color.BLACK);
         
      //   int x = 0;
      //  int y = 0;
ArrayList<ArrayList<String>>  array = NewJFrame.getArray();
int l = array.size();

                graph2.drawString(array.get(l-1).get(2)+" "+array.get(l-1).get(3), 50, 370);
                    graph2.draw(new Line2D.Float(250, 365, 340, 365));
                    graph2.draw(new Line2D.Float(340, 545, 340, 180));
               graph2.drawString(array.get(l-2).get(2)+" "+array.get(l-2).get(3), 350, 180);
                    graph2.draw(new Line2D.Float(600, 175, 710, 175));
                    graph2.draw(new Line2D.Float(710, 250, 710, 110));
                 graph2.drawString(array.get(l-3).get(2)+" "+array.get(l-3).get(3), 350, 550);
                    graph2.draw(new Line2D.Float(600, 550, 710, 550));
                    graph2.draw(new Line2D.Float(710, 620, 710, 480));
                graph2.drawString(array.get(l-4).get(2)+" "+array.get(l-4).get(3), 720, 105);
                   
                graph2.drawString(array.get(l-5).get(2)+" "+array.get(l-5).get(3), 720, 255);

                graph2.drawString(array.get(l-6).get(2)+" "+array.get(l-6).get(3), 720, 475);

                graph2.drawString(array.get(l-7).get(2)+" "+array.get(l-7).get(3), 720, 625);

                if(l>7){
                graph2.drawString(array.get(l-8).get(2)+" "+array.get(l-8).get(3), 1070, 70);
                graph2.drawString(array.get(l-9).get(2)+" "+array.get(l-9).get(3), 1070, 130);
                graph2.drawString(array.get(l-10).get(2)+" "+array.get(l-10).get(3), 1070, 220);
                graph2.drawString(array.get(l-11).get(2)+" "+array.get(l-11).get(3), 1070, 280);
                graph2.drawString(array.get(l-12).get(2)+" "+array.get(l-12).get(3), 1070, 440);
                graph2.drawString(array.get(l-13).get(2)+" "+array.get(l-13).get(3), 1070, 500);                
                graph2.drawString(array.get(l-14).get(2)+" "+array.get(l-14).get(3), 1070, 590);
                graph2.drawString(array.get(l-15).get(2)+" "+array.get(l-15).get(3), 1070, 650);
                
                    graph2.draw(new Line2D.Float(970, 100, 1060, 100)); //150
                    graph2.draw(new Line2D.Float(1060, 130, 1060, 70)); //60
                    
                    graph2.draw(new Line2D.Float(970, 250, 1060, 250)); //150
                    graph2.draw(new Line2D.Float(1060, 220, 1060, 280)); //60
                    
                    graph2.draw(new Line2D.Float(970, 470, 1060, 470)); //150
                    graph2.draw(new Line2D.Float(1060, 440, 1060, 500)); //60
                    
                    graph2.draw(new Line2D.Float(970, 620, 1060, 620)); //150
                    graph2.draw(new Line2D.Float(1060, 590, 1060, 650)); //60
                }
        
         
         
         
         // hore riadok 1,2,4,8,...
      /*   int counter = 0;
         double hore = 1;
         int mocnina = 1;
        graph2.draw(new Line2D.Float(20, 20, 100, 100));
          graph2.scale(1, 1);
            
        for (int i = mena.size()-1; i >= 0; i--) {
                counter++;

                System.out.println("hore pri:"+hore);
                System.out.println("osoba:"+counter);
                graph2.drawString(mena.get(i), 600+x, (600+y));
                
                if(counter == hore){
                   System.out.println("Hore");
                   hore= Math.pow(2, mocnina);
                   mocnina++;
                   counter = 0;
                   y -= 100;
                   x=-(mocnina*200)+100;
                if(hore == 8){
                       x-=200;
                }
                    System.out.println(x+" <--- x");
                }
                
                x+=200;

            }*/
        
         
        }


    }
    
}










