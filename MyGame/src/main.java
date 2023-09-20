import javax.swing.*;


public class main {
    public static void main(String[] args){
        JFrame window=new JFrame();
        GamePanel gamePanel=new GamePanel();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("MyGame");
        window.add(gamePanel);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
