import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Lektion1{
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Wattup " +
			//Toolkit.getDefaultToolkit() .beep())	;{
				//System.getProperty("user.name");
		//JOptionPane.showMessageDialog(null, "Datum och tid \n" + Calendar.getInstance () .getTime() .toString());
		JOptionPane.showMessageDialog(null, "qestion", "Question", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "info",  "Infomation", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "warning", "Warning", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "error", "Error", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "plain", "Plain", JOptionPane.PLAIN_MESSAGE);

	}
}