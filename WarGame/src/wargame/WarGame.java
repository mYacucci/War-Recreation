package wargame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WarGame extends JFrame implements ActionListener
{
    ImageIcon[] cards = new ImageIcon[5];
    
            //0-2
            //1-3
            //2-4
            //3-5
            //4-6
    int p1score=0;
    int p2score=0;
    int round = 1;
    private int p1c;
    private int p2c;
    String ifresult;
    JLabel msg = new JLabel();
    JLabel p1 = new JLabel();
    JLabel p2 = new JLabel();
    JButton next = new JButton("Next Round");
    GridLayout layout = new GridLayout(2,2);
    private ImageIcon p1card = new ImageIcon();
    private ImageIcon p2card = new ImageIcon();
    public WarGame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(595,1000);
        setLayout(layout);
        add(p1);
        add(p2);
        add(msg);
        add(next);
        next.addActionListener(this);
        cards[0]= new ImageIcon("images/2.jpg");
        cards[1]= new ImageIcon("images/3.jpg");
        cards[2]= new ImageIcon("images/4.jpg");
        cards[3]= new ImageIcon("images/5.jpg");
        cards[4]= new ImageIcon("images/6.jpg");
    }
    public static void main(String[] args)
    {
        WarGame frame = new WarGame();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        switch(round)
        {
            case(1):
            {
                p1c=(int)(Math.random() * 4+2);
                p2c=(int)(Math.random() * 4+2);
                p1.setIcon(cards[(p1c-2)]);
                p2.setIcon(cards[(p2c-2)]);
                if(p1c>p2c)
                {
                    ifresult = "Player 1 won!";
                    p1score++;
                }
                else if(p1c<p2c)
                {
                    ifresult = "Player 2 won!";
                    p2score++;
                }
                else
                {
                    ifresult = "Players tied!";
                }
                msg.setText("<html>Player 1 rolled " + p1c + "<br> Player 2 rolled " + p2c+"<br>"+ifresult+"</html>");
                round++;
                break;
            }
            case(2):
            {
                p1c=(int)(Math.random() * 4+2);
                p2c=(int)(Math.random() * 4+2);
                p1.setIcon(cards[(p1c-2)]);
                p2.setIcon(cards[(p2c-2)]);
                if(p1c>p2c)
                {
                    ifresult = "Player 1 won!";
                    p1score++;
                }
                else if(p1c<p2c)
                {
                    ifresult = "Player 2 won!";
                    p2score++;
                }
                else
                {
                    ifresult = "Players tied!";
                }
                msg.setText("<html>Player 1 rolled " + p1c + "<br> Player 2 rolled " + p2c+"<br>"+ifresult+"</html>");
                round++;
                break;
            }
            case(3):
            {
                p1c=(int)(Math.random() * 4+2);
                p2c=(int)(Math.random() * 4+2);
                p1.setIcon(cards[(p1c-2)]);
                p2.setIcon(cards[(p2c-2)]);
                if(p1c>p2c)
                {
                    ifresult = "Player 1 won!";
                    p1score++;
                }
                else if(p1c<p2c)
                {
                    ifresult = "Player 2 won!";
                    p2score++;
                }
                else
                {
                    ifresult = "Players tied!";
                }
                msg.setText("<html>Player 1 rolled " + p1c + "<br> Player 2 rolled " + p2c+"<br>"+ifresult+"</html>");
                round++;
                break;
            }
            case(4):
            {
                p1c=(int)(Math.random() * 4+2);
                p2c=(int)(Math.random() * 4+2);
                p1.setIcon(cards[(p1c-2)]);
                p2.setIcon(cards[(p2c-2)]);
                if(p1c>p2c)
                {
                    ifresult = "Player 1 won!";
                    p1score++;
                }
                else if(p1c<p2c)
                {
                    ifresult = "Player 2 won!";
                    p2score++;
                }
                else
                {
                    ifresult = "Players tied!";
                }
                msg.setText("<html>Player 1 rolled " + p1c + "<br> Player 2 rolled " + p2c+"<br>"+ifresult+"</html>");
                round++;
                break;
            }
            case(5):
            {
                p1c=(int)(Math.random() * 4+2);
                p2c=(int)(Math.random() * 4+2);
                p1.setIcon(cards[(p1c-2)]);
                p2.setIcon(cards[(p2c-2)]);
                if(p1c>p2c)
                {
                    ifresult = "Player 1 won!";
                    p1score++;
                }
                else if(p1c<p2c)
                {
                    ifresult = "Player 2 won!";
                    p2score++;
                }
                else
                {
                    ifresult = "Players tied!";
                }
                msg.setText("<html>Player 1 rolled " + p1c + "<br> Player 2 rolled " + p2c+"<br>"+ifresult+"</html>");
                round++;
                break;
            }
            default:
            {
                if(p1score > p2score)
                {
                    msg.setText("Player 1 wins this game with " + p1score +" points!");
                    break;
                }
                else if(p2score > p1score)
                {
                    msg.setText("Player 2 wins this game with " + p2score +" points!");
                    break;
                }
                else
                {
                    msg.setText("Players tied the game!");
                    break;
                }
                
            }
        }
        
    }
}
