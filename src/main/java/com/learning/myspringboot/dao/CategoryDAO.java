package com.learning.myspringboot.dao;

import com.learning.myspringboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
