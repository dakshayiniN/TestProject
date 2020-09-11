package layeredapp.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.danske.training.jdbc.ConnectionUtil;

import layeredapp.domain.Product;

public class ProductDAO {
	
	public void save(Product toBeSaved) {
		
		try(Connection c = ConnectionUtil.getConnection()) {
			Statement s = c.createStatement();
			String sql = 
					"insert into product(product_name,product_price,product_qoh) values('"+toBeSaved.getName()+"',"+toBeSaved.getPrice()+","+toBeSaved.getQoh()+")";
			System.out.println(sql);
			s.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Product>  findAll() {
		List<Product> all = new ArrayList<>();
		try(Connection c = ConnectionUtil.getConnection()) {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from product");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float price = rs.getFloat(3);
				int qoh = rs.getInt(4);
				
				Product aProduct = new Product(name, price, qoh);
				aProduct.setId(id);
				
				all.add(aProduct);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
}
