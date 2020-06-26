package com.manage.order.item.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manage.order.item.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	 // @Query("SELECT * FROM ORDER_ITEMS e WHERE e.productCode IN (:ids)")
	  List<OrderItem> findAllByProductCodeIn(List<String> ids);	 

	/*@PersistenceContext
	private EntityManager entitymanager;
	

	@Override
	public List<OrderItem> findByProductCodes(@Param("ids")List<String> ids) {
		
		return entitymanager.createQuery("from Personel where first_name = :first_name", Personel.class)
				.setParameter("first_name", firstname).getResultList();*/
	
}
