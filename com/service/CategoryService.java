package com.service;

import com.pojo.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAll();
    public Category getOne(int id);
}
