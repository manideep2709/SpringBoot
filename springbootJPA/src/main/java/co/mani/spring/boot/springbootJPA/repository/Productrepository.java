package co.mani.spring.boot.springbootJPA.repository;

import org.springframework.data.repository.CrudRepository;

import co.mani.spring.boot.springbootJPA.entity.Product;

public interface Productrepository extends CrudRepository<Product, Long> {

}
