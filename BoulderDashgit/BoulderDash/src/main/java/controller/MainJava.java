package controller;


import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;

import View.Board;

public class MainJava 
{
	public static void main(String[] args) 
	{
		  ConnectBdd cbdd = new ConnectBdd();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Quel niveau voulez-vous ? 1-5 ");
	        int choice = sc.nextInt();
	        cbdd.createConnexion();
	        try {
				cbdd.chooseMap(choice);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        sc.close();
		new MainJava();
	}
	
	public MainJava() 
	{
		JFrame f = new JFrame();
		f.setTitle("Boulder Dash");
		f.add(new Board());
		f.setSize(490, 512);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.toFront();
	}
	
	}

