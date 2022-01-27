package com.learning.myspringboot.service;

import org.springframework.data.domain.Pageable;

import com.learning.myspringboot.pojo.Category;
import com.learning.myspringboot.util.Page4Navigator;

public interface CategoryService {

    public Page4Navigator<Category> list(Pageable pageable);

    public void save(Category category);

    public void delete(int id);

    public Category get(int id);
}