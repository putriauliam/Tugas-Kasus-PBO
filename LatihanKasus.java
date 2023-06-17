package TugasPBO13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatihanKasus extends JFrame implements ActionListener {
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	
	public LatihanKasus() {
		textField1 = new JTextField();
		textField2 = new JTextField();
		button = new JButton("Jumlah");
		
		button.addActionListener(this);
		setLayout(new GridLayout(3, 2));
		
		add(textField1);
		add(textField2);
		add(button);

		setTitle("Penjumlahan Angka");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int angka1 =
			Integer.parseInt(textField1.getText());
			int angka2 =
			Integer.parseInt(textField2.getText());
			
			int hasil = angka1 + angka2;
			String message = "Jumlah: " + hasil;
			JOptionPane.showMessageDialog(this, message, "Hasil", JOptionPane.INFORMATION_MESSAGE);
			} 
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LatihanKasus();
			}
		});
	}
}
