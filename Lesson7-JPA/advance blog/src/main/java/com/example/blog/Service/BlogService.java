package com.example.blog.Service;

import com.example.blog.Entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> getAllBlogs();
    Blog save(Blog blog);
    void delete(Long id);
    Blog getById(Long id);
    Page<Blog> getAllBlogs(Pageable pageable);
}
