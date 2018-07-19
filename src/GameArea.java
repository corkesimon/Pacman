import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import javax.swing.JPanel;

public class GameArea extends JPanel{
	
	protected void paintComponent(Graphics g){
		this.setBackground(Color.BLACK);
		super.paintComponent(g);
		readLevel();
	} 
	
	private void readLevel(){
		InputStream is = getClass().getResourceAsStream("/levels/test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_16));
		String currentLine;
		 
		try {
			while ((currentLine = br.readLine())  != null){
				System.out.println(currentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
