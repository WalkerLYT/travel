package service.impl;

import domain.Category;
import org.junit.Test;
import service.CategoryService;

import java.util.List;

public class CategoryServiceImplTest {

    private CategoryService categoryService = new CategoryServiceImpl();

    @Test
    public void findAll(){
        List<Category> all = categoryService.findAll();
        for (Category category : all) {
            System.out.println(category);
        }
    }
}