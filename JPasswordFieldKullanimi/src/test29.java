import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("jpasswordfield örneği");
		JLabel label1 = new JLabel("sifre ");
		label1.setBounds(20, 20, 100, 30);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(20, 50, 100, 30);
		
		
		JButton buton = new JButton("gönder");
		buton.setBounds(20, 80, 100, 30);
		buton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String password = new String(pass.getPassword());
				label1.setText(label1.getText() + password);
			}
		});
		
		
		frame.add(label1);
		frame.add(pass);
		frame.add(buton);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

}
