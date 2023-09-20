import java.awt.*;
import javax.swing.*;
public class GamePanel extends JPanel implements Runnable {
        final int windowX=600;
        final int windowY=500;
        final int playerSize=8;
        mario m=new mario();

        private int playerX=100;
        private int playerY=100;
        final int playerSpeed=4;
        Keylistener Keyl=new Keylistener();
        Thread gameThread;
        public GamePanel(){
            this.setPreferredSize(new Dimension(windowX, windowY));
            this.setBackground(Color.DARK_GRAY);
            this.setDoubleBuffered(true);
            this.addKeyListener(Keyl);
            this.setFocusable(true);
        }

        public void gameStarter(){
            gameThread=new Thread(this);
            gameThread.start();
        }

        public void paint(Graphics g){
            super.paint(g);
            gameStarter();
            m.paint(g, playerX, playerY);
            

        }
        
        @Override
        public void run() {
            update();
            repaint();       
        }
            
                    
        public void update(){
            if(Keyl.upPressed==true){
                playerY-=playerSpeed;
            }else if(Keyl.downPressed==true){
                playerY+=playerSpeed;
            }else if(Keyl.leftPressed==true){
                playerX-=playerSpeed;
            }else if(Keyl.rightPressed==true){
                playerX+=playerSpeed;
            }
            
        }
        

    }
