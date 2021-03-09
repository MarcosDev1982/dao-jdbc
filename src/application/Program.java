package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerdao = DaoFactory.CreatSellerDao();
		
		System.out.println("=== TEST 1: Seller findBayId ====");
		Seller  seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST2 : Seller findBayDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartmnet(department);

		for (Seller seller2 : list) {
			System.out.println(seller2);
			
		}
		

		System.out.println("\n=== TEST 3 : Seller findBayDepartment ====");
		
		 list = sellerdao.findAll();

		for (Seller seller2 : list) {
			System.out.println(seller2);
		
	}

}
	
}
