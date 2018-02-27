package databasetools;

import javax.swing.UIManager;

import databasetools.ui.frame.LoginWindow;

public class StartClient {

	public static void main(String[] args) {
		try {

			LoginWindow.getInstance();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
