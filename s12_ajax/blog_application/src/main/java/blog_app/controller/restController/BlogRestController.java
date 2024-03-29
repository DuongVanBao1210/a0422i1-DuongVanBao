package blog_app.controller.restController;

import blog_app.entity.Blog;
import blog_app.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/blogs")
public class BlogRestController {
    @Autowired
    BlogService blogService;

    @GetMapping
    public ResponseEntity<Page<Blog>> findAllBlogs(
            @PageableDefault(
//                    sort = {"id"},
//                    direction = Sort.Direction.ASC,
                    value = 4) Pageable pageable) {
        Page<Blog> blogList = blogService.findAll(pageable);
        if (blogList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Blog> viewBlog(@PathVariable("id") int id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(blog, HttpStatus.OK);
        }
    }

    @GetMapping("search")
    public ResponseEntity<Page<Blog>> searchByTitle(@RequestParam("title") String title, Pageable pageable) {
        Page<Blog> blogList = blogService.search(title, pageable);
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }


//    @GetMapping("search")
//    @ResponseStatus(HttpStatus.OK)
//    public Page<Blog> search(@RequestParam("title") String title,Pageable pageable) {
//        return blogService.search(title,pageable);
//    }


}
