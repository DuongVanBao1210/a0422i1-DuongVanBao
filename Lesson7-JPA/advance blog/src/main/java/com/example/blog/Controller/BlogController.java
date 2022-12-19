package com.example.blog.Controller;

import com.example.blog.Entity.Blog;
import com.example.blog.Service.BlogService;
import com.example.blog.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    private CategoryService categoryService;

    @GetMapping("/blog")
    public String getAllBlogs(Model model, @RequestParam("page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        int pageSize = 3;
        Page<Blog> blogs = blogService.getAllBlogs(PageRequest.of(currentPage -1,pageSize));
        model.addAttribute("blogs", blogs);

        int numbers = blogs.getNumber();
        int totalBlogs =blogs.getNumberOfElements();
        int totalPages = blogs.getTotalPages();

        model.addAttribute("numbers", numbers);
        model.addAttribute("totalBlogs", totalBlogs);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", currentPage);
        return "home";
    }

    @GetMapping("/blog/create")
    public String createStudent(Model model){
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        model.addAttribute("category",categoryService.getAllCategory());
        return "create";
    }
}
