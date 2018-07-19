import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen extends JFrame{
	
	private JButton NgButton = new JButton("NEW GAME");
	private GameArea GA = new GameArea();
	
	public Screen(){
		super("PAC-MAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100,1000);
		setVisible(true);
		JPanel f1 = new JPanel();
		f1.setPreferredSize(new Dimension(200,1000));
		JPanel f2 = new JPanel();
		f2.setPreferredSize(new Dimension(900,1000));
		add(f1, BorderLayout.WEST);
		add(f2);
		GA.setPreferredSize(new Dimension(900,1000));
		f1.add(NgButton);
		f2.add(GA, BorderLayout.CENTER);
	}
}
