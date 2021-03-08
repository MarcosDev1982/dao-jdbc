package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "book");
		Seller seller = new Seller(1, "marcos", "alan@gmal", new Date(), 3000.0, obj);
		System.out.println(seller);
		
		System.out.println(obj);

	}

}
