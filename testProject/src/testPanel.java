import javax.swing.*;
import java.awt.*;

/**
 * Vincent Verboven
 * 19/10/2022
 */
public class testPanel extends JPanel implements Runnable {
    private int posX = 100;
    private int posY = 100;
    final int textureSize = 16;
    final int scale = 4;
    final int scaledSize = textureSize * scale;
    final int maxColX = 16;
    final int maxRowY = 9;
    final int screenWidth = scaledSize * maxColX;
    final int screenHeight = scaledSize * maxRowY;

    Thread testThread;
    public testPanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }



    public void startTestThread(){
        testThread = new Thread(this);
        testThread.start();
    }

    @Override
    public void run() {
        while(testThread != null){

            update();

        }
    }
    public void update(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(posX,posY,scaledSize,scaledSize);
    }
}
