package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Beans.Product;
import com.masai.Utility.DBUtil;
import com.masai.exceptions.ProductException;

public class ProductDaoImpl implements ProductDao {

	@Override
	public String addProduct(Product product) throws ProductException {
		String msg="not added";
		
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1,product.getProductId());
			ps.setString(2,product.getName());
			ps.setInt(3,product.getPrice());
			ps.setInt(4,product.getQuantity());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				return msg="product added successFully";
			}else {
				throw new ProductException(msg);
			}
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
		
	}
//****************************************************************************************
	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> pList=new ArrayList<>();
		
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("select * from product");
		    ResultSet rs= ps.executeQuery();
		    
		    while(rs.next()) {
		    	int pId=rs.getInt("productId");
		    	String name=rs.getString("productName");
		    	int price=rs.getInt("price");
		    	int quantity=rs.getInt("quantity");
		    	
		    	Product pro=new Product(pId, name, price, quantity);
		    	
		    	pList.add(pro);
		    	
		    }
			
		    if(pList.isEmpty()) {
		    	throw new ProductException("No product available...");
		    }else {
		    	return pList;
		    }
			
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
		
	}
//****************************************************************************************
	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
	List<Product> pList=new ArrayList<>();
		
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("select * from product where quantity < ?");
			ps.setInt(1, quantity);
			
		    ResultSet rs= ps.executeQuery();
		    
		    while(rs.next()) {
		    	int pId=rs.getInt("productId");
		    	String name=rs.getString("productName");
		    	int price=rs.getInt("price");
		    	int quantitys=rs.getInt("quantity");
		    	
		    	Product pro=new Product(pId, name, price, quantitys);
		    	
		    	pList.add(pro);
		    	
		    }
			
		    if(pList.isEmpty()) {
		    	throw new ProductException("No product available...");
		    }else {
		    	return pList;
		    }
			
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
	}
//****************************************************************************************
	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("update product set quantity=quantity + ? where productId=?");
			ps.setInt(1, Quantity);
	        ps.setInt(2, productId);		
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				return "product added successFully";
			}else {
				throw new ProductException("invalid product id");
			}
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
		
	}
//****************************************************************************************
	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("delete from product where productName=?");
			ps.setString(1, pname);
				
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				return "product deleted successFully";
			}else {
				throw new ProductException("invalid productName");
			}
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
		
	}
//****************************************************************************************
	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		Product pro=null;
		try(Connection conn=DBUtil.getConnections()){
			PreparedStatement ps= conn.prepareStatement("select * from product where productName=?");
			ps.setString(1, pname);
			
			ResultSet rs= ps.executeQuery();
				
			if(rs.next()) {
				int pId=rs.getInt("productId");
		    	String name=rs.getString("productName");
		    	int price=rs.getInt("price");
		    	int quantitys=rs.getInt("quantity");
		    	
		        pro=new Product(pId, name, price, quantitys);
		    	return pro;
			}else {
				throw new ProductException("invalid product name...");
			}
			
		}catch(SQLException e) {
			throw new ProductException("sql Error..."+e.getMessage());
		}
	}
	
	

}
