package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {
	
	public static SellerDao CreatSellerDao() {
		
		return new  SellerDaoImplJDBC(DB.getConnection());
		
	}
	

}
