package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerdao = DaoFactory.CreatSellerDao();
		
		System.out.println("=== TEST 1: Seller findBayId ====");
		Seller  seller = sellerdao.findById(3);
		System.out.println(seller);

	}

}
