import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class studentobj implements ActionListener {

	public static void main(String[] args) throws IOException {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 300, 400);
		frame.setTitle("Student ID generator");
		Container c = frame.getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		JButton btn = new JButton("New");
		btn.setSize(100, 30);
		btn.setLocation(100, 100);
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				student s = new student();

				JFrame frame1 = new JFrame();
				frame1.setVisible(true);
				frame1.setBounds(100, 100, 400, 500);

				Container c1 = frame1.getContentPane();
				c1.setLayout(null);

				c1.setBackground(Color.YELLOW);
				JButton btn2 = new JButton("Save");
				btn2.setSize(100, 30);
				btn2.setLocation(100, 400);

				c1.add(btn2);

				JLabel id = new JLabel("id number : ");
				id.setBounds(100, 25, 100, 30);
				c1.add(id);

				JLabel idn = new JLabel(Integer.toString(s.Id_no));
				c1.add(idn);
				idn.setBounds(200, 25, 100, 30);

				JLabel l1 = new JLabel("First Name");
				c1.add(l1);
				l1.setBounds(100, 50, 100, 30);

				JLabel l2 = new JLabel("Last Name");
				l2.setBounds(100, 100, 100, 30);
				c1.add(l2);

				JLabel l3 = new JLabel("Date of birth");
				l3.setBounds(100, 150, 100, 30);
				c1.add(l3);

				JLabel l4 = new JLabel("Phone No");
				l4.setBounds(100, 200, 100, 30);
				c1.add(l4);

				JLabel l5 = new JLabel("Blood group");
				l5.setBounds(100, 250, 100, 30);
				c1.add(l5);

				JLabel l6 = new JLabel("Address");
				l6.setBounds(100, 300, 100, 30);
				c1.add(l6);

				JTextField f1 = new JTextField();
				f1.setBounds(200, 55, 100, 25);
				c1.add(f1);

				JTextField f2 = new JTextField();
				f2.setBounds(200, 105, 100, 25);
				c1.add(f2);

				JTextField f3 = new JTextField();
				f3.setBounds(200, 155, 100, 25);
				c1.add(f3);

				JTextField f4 = new JTextField();
				f4.setBounds(200, 205, 100, 25);
				c1.add(f4);

				JTextField f5 = new JTextField();
				f5.setBounds(200, 255, 100, 25);
				c1.add(f5);

				JTextArea f = new JTextArea();
				f.setBounds(200, 305, 100, 50);
				c1.add(f);

				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						s.First_name = f1.getText();
						s.Last_name = f2.getText();
						s.Date_of_birth = f3.getText();
						s.Phone_no = f4.getText();
						s.Blood_group = f5.getText();
						s.Address = f.getText();
						String str = Integer.toString(s.Id_no) + "#" + s.First_name + "#" + s.Last_name + "#"
								+ s.Date_of_birth + "#" + s.Phone_no + "#" + s.Blood_group + "#" + s.Address;
						try {
							File file = new File("student.txt");
							FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
							BufferedWriter bw = new BufferedWriter(fw);
							bw.write(str);
							bw.newLine();
							bw.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
						frame1.dispose();
						s.Id_no++;
					}
				});

			}

		});
		JButton btn1 = new JButton("show");
		btn1.setSize(100, 30);
		btn1.setLocation(100, 200);
		c.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame1 = new JFrame();
				frame1.setVisible(true);
				frame1.setBounds(100, 100, 400, 500);
				Container c1 = frame1.getContentPane();
				c1.setLayout(null);

				c1.setBackground(Color.YELLOW);

				JLabel id = new JLabel("Id no :");
				c1.add(id);
				id.setBounds(75, 25, 100, 30);

				JTextField idf = new JTextField();
				c1.add(idf);
				idf.setBounds(175, 25, 100, 30);

				JButton btn3 = new JButton("search");
				c1.add(btn3);
				btn3.setSize(100, 30);
				btn3.setLocation(275, 25);

				JLabel l1 = new JLabel("First Name :");
				c1.add(l1);
				l1.setBounds(75, 75, 100, 30);

				JLabel l2 = new JLabel("Last Name :");
				l2.setBounds(75, 125, 100, 30);
				c1.add(l2);

				JLabel l3 = new JLabel("Date of birth :");
				l3.setBounds(75, 175, 100, 30);
				c1.add(l3);

				JLabel l4 = new JLabel("Phone No :");
				l4.setBounds(75, 225, 100, 30);
				c1.add(l4);

				JLabel l5 = new JLabel("Blood group :");
				l5.setBounds(75, 275, 100, 30);
				c1.add(l5);

				JLabel l6 = new JLabel("Address :");
				l6.setBounds(75, 325, 100, 30);
				c1.add(l6);

				JButton btn4 = new JButton("OK");
				btn4.setSize(100, 30);
				btn4.setLocation(100, 400);
				c1.add(btn4);
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String search = new String();
						search = idf.getText();

						boolean b = false;
						try {
							File file = new File("student.txt");
							FileReader fw = new FileReader(file.getAbsoluteFile());
							BufferedReader br = new BufferedReader(fw);
							String contentLine = br.readLine();
							while (contentLine != null) {

								String str[] = contentLine.split("#");
								if (str[0].equals(search)) {

									JLabel l7 = new JLabel(str[1]);
									c1.add(l7);
									l7.setBounds(175, 75, 100, 30);

									JLabel l8 = new JLabel(str[2]);
									l8.setBounds(175, 125, 100, 30);
									c1.add(l8);

									JLabel l9 = new JLabel(str[3]);
									l9.setBounds(175, 175, 100, 30);
									c1.add(l9);

									JLabel l10 = new JLabel(str[4]);
									l10.setBounds(175, 225, 100, 30);
									c1.add(l10);

									JLabel l11 = new JLabel(str[5]);
									l11.setBounds(175, 275, 100, 30);
									c1.add(l11);

									JLabel l12 = new JLabel(str[6]);
									l12.setBounds(175, 325, 100, 30);
									c1.add(l12);
									br.close();
									b = true;
									break;

								}
								contentLine = br.readLine();
							}
							if (!b) {
								JLabel error = new JLabel("Invalid Id no");
								error.setForeground(Color.RED);
								error.setBounds(175, 50, 100, 30);
								c1.add(error);
							}

						} catch (IOException e1) {
							if (!b) {
								JLabel error = new JLabel("Invalid Id no");
								error.setForeground(Color.RED);
								error.setBounds(175, 50, 100, 30);
								c1.add(error);
							}
							e1.printStackTrace();
						}
					}
				});
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame1.dispose();
					}
				});

			}
		});

	}

	public void actionPerformed(ActionEvent e) {
	}
}