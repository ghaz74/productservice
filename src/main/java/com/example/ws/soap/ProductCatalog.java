package com.example.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

//import org.apache.cxf.ext.logging.*;

import com.example.business.ProductCatalogImpl;


@WebService

public class ProductCatalog {
	private ProductCatalogImpl productCatalog = new ProductCatalogImpl();
	
	@WebMethod
	@WebResult(name="categoryList")
	public List<String> getProductCategories() {
		return productCatalog.getProductCategories();
	}
	
	@WebMethod()
	@WebResult(name="productName")
	public List<String> getProducts(@WebParam(name="category") String category) {
		return productCatalog.getProducts(category);
	}
	
	@WebMethod()
	@WebResult(name="status")
	public boolean addMovie(@WebParam(name="movieName") String movieName) {
		return productCatalog.addMovie(movieName);
	}
}
