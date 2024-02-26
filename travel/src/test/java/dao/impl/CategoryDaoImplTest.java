package dao.impl;

import domain.Category;
import org.junit.Test;

import java.util.List;

public class CategoryDaoImplTest {

    private CategoryDaoImpl dao = new CategoryDaoImpl();

    @Test
    public void findAll() {
        List<Category> all = dao.findAll();
        for (Category category : all) {
            System.out.println(category);
        }
    }
}