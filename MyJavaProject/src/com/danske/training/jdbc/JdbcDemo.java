package com.danske.training.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {
	
	public void createProduct() {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		System.out.println("Enter price: ");
		float price = Float.parseFloat(kb.nextLine());
		System.out.println("Enter QoH:");
		int qoh = Integer.parseInt(kb.nextLine());
		
		if(price * qoh < 10000) {
			throw new IllegalArgumentException("Monetory value too low.");
		}
		
		try(Connection c = ConnectionUtil.getConnection()) {
			Statement s = c.createStatement();
			String sql = 
					"insert into product(product_name,product_price,product_qoh) values('"+name+"',"+price+","+qoh+")";
			System.out.println(sql);
			s.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JdbcDemo demo = new JdbcDemo();
		demo.createProduct();

	}

}
