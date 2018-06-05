package mine_sweeper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.*;

import java.net.URI;

/**
 * TODO description
 */
public class About extends JFrame {

	private static final long serialVersionUID = 1L;
	private final int FRAME_WIDTH = 310;
    private final int FRAME_HEIGHT = 380;
    
    private final JButton okButton;
    
    public About() {
    	
    	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("About this Minesweeper");
        
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				About.this.setVisible(false);
			}
		});
        add(okButton, BorderLayout.SOUTH);
        
        JTextPane info = new JTextPane();
        info.setContentType("text/html");
        info.setText(""
        		+ "<p>"
        		+ "Minesweeper for an SPL based on FeatureHouse."
        		+ "</p>"
        		+ "<p>"
        		+ "<b> Author of the base code: </b>"
        		+ "<br/>"
        		+ "Jan Bodnar, on a tutorial for <a href='http://zetcode.com/tutorials/javagamestutorial/minesweeper/'> ZetCode.com</a>."
        		+ "</p>"
        		+ "<p>"
        		+ "<b> Author of the variability features: </b>"
        		+ "<br/>"
        		+ "Álex López, on an assignment for EHU."
        		+ "</p>"
        		+ "<p>"
        		+ "<b> Icons acquired from: </b>"
        		+ "<br/>"
        		+ "<a href='https://github.com/publicarray/mines'> This</a> publicarray GitHub repository."
        		+ "</p>"
        		+ "<p>"
        		+ "<img src='http://2.bp.blogspot.com/-aOF2faHwSqs/VfVsdJnnEHI/AAAAAAAAHNg/i8Yt9KLWc9s/s1600/buscaminas.png' />"
        		+ "</p>"
        );
        info.setEditable(false);
        info.addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
					System.out.println(e.getURL());
					try {
						Desktop.getDesktop().browse(new URI(e.getURL().toString()));
					}
					catch (Exception ex){
						About.this.setVisible(false);
					}
				}
			}
		});
        info.setBackground(Color.lightGray);
        add(info);
        		
        setResizable(false);
    }
	
}