import java.util.*;
import javax.swing.*; 
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

class discord_spoiler {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Enter Stirng:");
		
		String[] strArr = str.split("");
		str = "";
		
		for(int j = 0; j < strArr.length; j++) {
			strArr[j] = "||" + strArr[j] + "||";
			str = str + strArr[j];
		}
		
		StringSelection stringSelection = new StringSelection(str);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		System.out.println("Copied to clipboard paste into discord :)");
	}
}