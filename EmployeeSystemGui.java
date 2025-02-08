package Emp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class EmployeeSystemGui extends JFrame{
	 private JList<String> friendsList;
	 private static EmployeeSystemGui instance;
	    private EmployeeSystemGui(Employee l){
		setSize(500,500);
		setName("Employee Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JButton registration = new JButton("registeration");
		registration.setBounds(140,30,200,40);
		JButton ShowDetails = new JButton("Show details of Employee");
		ShowDetails.setBounds(140,80,200,40);
		JButton ShowSalary = new JButton("Show Total Salary");
		ShowSalary.setBounds(140,140,200,40);
		JPanel details=new JPanel();
		details.setBounds(90, 200, 300, 200);
		
		add(registration);
		add(ShowDetails);
		add(ShowSalary);
		
		registration.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new EmployeeRegistration();
			}
			
		});
		ShowDetails.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dept=JOptionPane.showInputDialog(new JFrame(),"Enter Department: ");
			    System.out.println(dept);
							if(dept!=null) {
								String name=JOptionPane.showInputDialog(new JFrame(),"Enter name: ");
							    System.out.println(name);
							    details.setBorder(BorderFactory.createTitledBorder("Employee Details"));
								JLabel det= new JLabel("    id  Name  Department  Designation  Salary\n");
								details.add(det);
									Employee empDetails=l.showDetails(dept,name);
									if(empDetails!=null) {
										JLabel newdetail=new JLabel(empDetails.id+"              "+empDetails.name+"     "+empDetails.dept+"                  "+empDetails.designation+"      "+empDetails.getSalary()+"\n");
										details.add(newdetail);
									}
								}
							}
					});
		
				
		ShowSalary.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dept=JOptionPane.showInputDialog(new JFrame(),"Enter Department: ");
				int Salary = l.getTotalSalary(dept);
				JOptionPane.showMessageDialog(new JFrame(), "Salary is: "+Salary);
			}
			
		});
		
		add(details);
		setVisible(true);
		
	}
	    public static EmployeeSystemGui getInstance(Employee l) {
	    	if (instance == null)
	    		
	            instance = new EmployeeSystemGui(l);
	        return instance;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee l=new leader("n","n","n",1,1);
		 EmployeeSystemGui.getInstance(l);
	}
	

}
