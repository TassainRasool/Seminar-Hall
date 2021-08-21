
import javax.swing.*;  
public class first {
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JLabel Jl1=new JLabel();
		Jl1.setText("Faculty ");
		JTextField tf1=new JTextField();
		f.add(tf1);
		f.add(Jl1);
		JLabel Jl2=new JLabel();
		Jl2.setText("HallBook ");
		f.add(Jl2);
		JTextField tf2=new JTextField();
		f.add(tf2);
		JLabel Jl3=new JLabel();
		Jl3.setText("Date ");
		f.add(Jl3);
		JTextField tf3=new JTextField();
		f.add(tf3);
		JLabel Jl4=new JLabel();
		Jl4.setText("Slot");
		f.add(Jl4);
		JTextField tf4=new JTextField();
		f.add(tf4);
		JButton b=new JButton("Submit");
		f.add(b);
		b.addActionListener(null);
		f.setVisible(true);


	}



}
