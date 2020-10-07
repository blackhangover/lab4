package Lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame
{
    private int team1 = 0;
    private int team2 = 0;
    JButton firstTeam = new JButton("AC Milan");
    JButton secondTeam = new JButton("Real Madrid");
    JLabel score = new JLabel(" ");
    JLabel last = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    public Main()
    {
        super("Score counter");
        setLayout(null);
        Font fontForScore = new Font("Times new Roman", Font.PLAIN, 30);

        firstTeam.setBounds(30, 170, 150, 25);
        secondTeam.setBounds(420, 170, 150, 25);
        score.setBounds(250,60,100,40);
        score.setText(team1 + " X " + team2);
        score.setFont(fontForScore);
        winner.setBounds(180,10,300,25);
        winner.setFont(fontForScore);
        last.setBounds(240,100,150,20);
        setSize(600, 600);

        add(firstTeam);
        add(secondTeam);
        add(score);
        add(last);
        add(winner);

        firstTeam.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            {

            }
            public void mouseClicked(MouseEvent a)
            {
                team1++;
                score.setText(team1 + " X " + team2);
                last.setText("Last Scorer: AC Milan");
                winnerUpdate();
            }
            public void mouseEntered(MouseEvent a)
            {

            }
            public void mouseReleased(MouseEvent a)
            {

            }
            public void mousePressed(MouseEvent a)
            {

            }
        });

        secondTeam.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            {

            }

            public void mouseClicked(MouseEvent a)
            {
                team2++;
                score.setText(team1 + " X " + team2);
                last.setText("Last Scorer: Real Madrid");
                winnerUpdate();
            }
            public void mouseEntered(MouseEvent a)
            {

            }
            public void mouseReleased(MouseEvent a)
            {

            }
            public void mousePressed(MouseEvent a)
            {

            }
        });

    }

    private void winnerUpdate()
    {
        if (team1 >team2)
        {
            winner.setText("Winner: AC Milan");
        }
        else if (team1 < team2)
        {
            winner.setText("Winner: Real Madrid");
        }
        else
            {
                winner.setText("Winner: DRAW");
            }
    }

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
