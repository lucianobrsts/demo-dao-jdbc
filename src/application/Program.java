package application;

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
		List<Seller> sellersFindByDepartment = sellerDao.findByDepartment(dep);
		for (Seller obj : sellersFindByDepartment) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== Test 3: Seller findAll =====");
		List<Seller> sellersFindAll = sellerDao.findAll();
		for(Seller obj : sellersFindAll) {
			System.out.println(obj);
		}

	}

}
