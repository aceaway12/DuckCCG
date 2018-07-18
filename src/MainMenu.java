import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainMenu extends JPanel {
	JButton singlePlayer;
	JButton multiPlayer;
	JPanel topHalf, bottomHalf, buttonPanel;
	BufferedImage logo;
	public MainMenu() {
		try {
			logo = ImageIO.read(new File("logo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		topHalf = new JPanel();
		bottomHalf = new JPanel();
		buttonPanel = new JPanel();
		singlePlayer = new JButton("Singleplayer");
		multiPlayer = new JButton("Multiplayer");
		this.setLayout(new GridLayout(2,1));
		buttonPanel.setLayout(new GridLayout(2,1));
		this.add(topHalf);
		this.add(buttonPanel);
		topHalf.add(new JLabel(new ImageIcon(logo)));
		//bottomHalf.add(buttonPanel);
		buttonPanel.add(singlePlayer);
		buttonPanel.add(multiPlayer);
		singlePlayer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameOperator.beginSoloDraft();
			}
		});
	}
}
