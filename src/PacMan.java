import javax.swing.SwingUtilities;

public class PacMan {
	
	public static void main(String[] args){
		PacMan Pm = new PacMan();
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {Screen screen = new Screen();}
		});
	}
}
