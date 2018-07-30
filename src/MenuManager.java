import java.awt.*;
import javax.swing.*;

public class MenuManager {
	public static final int MAIN_MENU = 0;
	public static final int DRAFT_MENU = 1;
	public static final int GAME_BAORD = 2;
	public static JFrame mainFrame;
	public static Container contentPane;
	public static MainMenu main;
	public static void initialize() {
		mainFrame = new JFrame();
		contentPane = mainFrame.getContentPane();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main = new MainMenu();
		//TODO: INITIALIZE OTHER MENU TYPES
		///////////////////////////////////
		contentPane.add(main);
		mainFrame.setVisible(true);
	}
	public static void switchToScreen(int screen) {
		if (screen == DRAFT_MENU) {
			System.out.println("Get beaned kid");
		}
	}
}
