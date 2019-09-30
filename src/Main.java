import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0437\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043E\u0432\u0430\u0442\u044C\u0441\u044F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(287, 566, 137, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044F \u043D\u0430 \u0441\u044A\u0435\u0437\u0434 \u043F\u043E\u0435\u0434\u0430\u0442\u0435\u043B\u0435\u0439 \u0433\u043E\u0440\u044F\u0447\u0438\u0445 \u0431\u043E\u0442\u0438\u043D\u043E\u043A");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 414, 31);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u041A\u0430\u043A \u0432\u0430\u0441 \u0437\u043E\u0432\u0443\u0442");
		label.setBounds(33, 87, 118, 17);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(136, 85, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0441\u043A\u043E\u043B\u044C\u043A\u043E \u0431\u043E\u0442\u0438\u043D\u043E \u0432\u043C\u0435\u0449\u0430\u0435\u0442\u0441\u044F \u0432 \u0440\u043E\u0442");
		label_1.setBounds(21, 115, 169, 31);
		contentPane.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(213, 120, 29, 20);
		contentPane.add(spinner);
		
		JLabel label_2 = new JLabel("\u0412\u044B \u0443\u043F\u043E\u0442\u0440\u0435\u0431\u043B\u044F\u0435\u0442\u0435 \u0441\u0430\u043F\u043E\u0433\u0438?");
		label_2.setBounds(31, 157, 141, 14);
		contentPane.add(label_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u0434\u0430");
		chckbxNewCheckBox.setBounds(213, 153, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(289, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(178, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel label_3 = new JLabel("\u041E\u0446\u0435\u043D\u0438\u0442\u0435 \u043B\u044E\u0431\u043E\u0432\u044C \u043A \u0436\u0430\u0440\u0435\u043D\u044B\u043C \u043F\u043E\u0434\u043E\u0448\u0432\u0430\u043C");
		label_3.setBounds(60, 247, 250, 14);
		contentPane.add(label_3);
		
		JSlider slider = new JSlider();
		slider.setBounds(70, 272, 200, 26);
		contentPane.add(slider);
	}
}
