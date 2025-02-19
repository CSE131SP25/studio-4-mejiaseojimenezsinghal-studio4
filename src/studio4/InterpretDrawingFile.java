package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		if (shape.equals("rectangle")) {
				if (filled == true) {
					StdDraw.setPenColor(red, green, blue);
					StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
				}
				else {
					StdDraw.rectangle(x, y, halfWidth, halfHeight);
				}		
		}
		if (shape == "ellipse") {
			if (filled = true) {
				StdDraw.filledEllipse(x, y, x, x);
			}
			else {
				StdDraw.ellipse(x, y, x, x);
			}
		}
		//if (shape == "triangle") {
			//if (filled = true)
			//{		
//			}
	//	}
		
		
		
	}
}
