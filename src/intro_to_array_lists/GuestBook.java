package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		new GuestBook().m();
	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton("Add Name");
	JButton bb = new JButton("View Names");
	ArrayList<String> list = new ArrayList<String>();

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	void m() {
		f.add(p);
		p.add(b);
		p.add(bb);
		f.setVisible(true);
		b.addActionListener(this);
		bb.addActionListener(this);
		list.add("Bob Banders");
		list.add("Sandy Summers");
		list.add("Greg Ganders");
		list.add("Donny Doners");
		f.pack();
	}

	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton) e.getSource();
		if (clickedButton == b) {
			String inputedName = JOptionPane.showInputDialog("Enter a name");
			list.add(inputedName);
		}
		if (clickedButton == bb) {
			for (String s : list) {
				System.out.println(s);
			}
		}
	}
}
