package com.day.dao;

import com.day.dto.Customer;
import com.day.exception.AddException;
import com.day.exception.FindException;
import com.day.exception.ModifyException;

public class CustomerDAOOracle implements CustomerDAO{

	@Override
	public void insert(Customer c) throws AddException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer selectById(String id) throws FindException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Customer c) throws ModifyException {
		String updateSQL = "UPDATE customer SET "; //pwd = 'p1', name = 'n1', buildingno='1'
		String updateSQL1 = " WHERE id = ?";
		
		boolean flag = false; //변경할 값이 있는 경우 true
		
		String pwd = c.getPwd();		
		if( pwd != null && !pwd.equals("")) {
			updateSQL += "pwd = '" + pwd + "'";
			flag = true;
		}		
		
		String name = c.getName();		
		if( name != null && !name.equals("")) {
			if(flag) {
				updateSQL += ",";
			}		
			updateSQL += "name = '" + name + "'";
			flag = true;
		}		
			
		String buildingno = c.getBuildingno();		
		if( buildingno != null && !buildingno.equals("")) {
			if(flag) {
				updateSQL += ",";
			}	
			updateSQL += "buildingno = '" + buildingno + "'";
			flag = true;
		}
		
		
		int enabled = c.getEnabled();		
		if( enabled > -1 ) { //0-탈퇴, 1-활동 
			if(flag) {
				updateSQL += ",";
			}
			updateSQL += "enabled = '" + enabled + "'";
			flag = true;
		}
		
		System.out.println(updateSQL + updateSQL1);
		if(!flag) {
			throw new ModifyException("수정할 내용이 없습니다");
		}
		
		/*Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		//updateSQL + updateSQL1;
	}
	public static void main(String[] args) {
		CustomerDAOOracle dao = new CustomerDAOOracle();
		Customer c = new Customer();
		c.setId("id1");
		//c.setPwd("pp1");
		c.setName("nn1");
		//c.setBuildingno("b1");
		c.setEnabled(-1); 
		try {
			dao.update(c);
		} catch (ModifyException e) {
			e.printStackTrace();
		}
	}
	
}