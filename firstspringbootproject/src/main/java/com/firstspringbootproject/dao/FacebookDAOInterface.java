package com.firstspringbootproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.firstspringbootproject.entity.FacebookUser;
import com.firstspringbootproject.entity.Product;

@Repository
public interface FacebookDAOInterface extends JpaRepository<Product, Long>{

	@Query("from com.firstspringbootproject.entity.FacebookUser f where f.email=:em and f.password=:pw")
	FacebookUser loginDAO(@Param("em") String email, @Param("pw") String password);

}
