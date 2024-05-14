package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== Test 1: Seller findById =====");
		Seller sellerFindById = sellerDao.findById(3);
		System.out.println(sellerFindById);
		
		System.out.println("\n===== Test 2: Seller findByDepartment =====");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== Test 3: Seller findAll =====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
//		System.out.println("\n===== Test 4: Seller insert =====");
//		Seller seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		sellerDao.insert(seller);
//		System.out.println("Inserted! New Id: " + seller.getId());
		
		System.out.println("\n===== Test 5: Seller update =====");
		Seller seller = sellerDao.findById(8);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
//		Seller seller = new Seller(8, "Luciano.Brito", "luciano.brito@gmail.com", new Date(), 5500.0, dep);
		System.out.println("Update completed!");
		
	}

}
