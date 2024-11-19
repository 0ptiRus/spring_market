package ru.topacademy.spring_expensetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

	@Autowired
    private CategoryRepository categoryRepository;


    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }


    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}