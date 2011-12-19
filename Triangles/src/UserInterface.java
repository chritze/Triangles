import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;


public class UserInterface {

	private JFrame frame;
	private MyCanvas canvas;


	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new MyCanvas();
		Color c = new Color(255,255,255);
		canvas.setBackground(c);
		frame.add(canvas);
		frame.setVisible(true);
	}
	
	public UserInterface getUI() {
		return this;
	}
	
	public MyCanvas getCanvas() {
		return canvas;
	}

}
