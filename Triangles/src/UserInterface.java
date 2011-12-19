import java.awt.Color;
import java.awt.Toolkit;

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
		frame = new JFrame("Recursive Triangles");
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		canvas = new MyCanvas();
		Color c = new Color(255, 255, 255);
		canvas.setBackground(c);
		frame.add(canvas);
		frame.setVisible(true);
	}
}