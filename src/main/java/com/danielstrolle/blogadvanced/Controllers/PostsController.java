package com.danielstrolle.blogadvanced.Controllers;

import com.danielstrolle.blogadvanced.Post;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.ArrayList;

@Controller
class PostsController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts(Model model) {
        Post post1 = new Post();
        Post post2 = new Post();
        ArrayList<Post> postsList = new ArrayList<>();
        postsList.add(post1);
        postsList.add(post2);
        model.addAttribute("posts", postsList);
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(Model model) {
        Post post = new Post();
        model.addAttribute(post);
        return "view individual posts";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createNewPost () {
        return "Create new Post";
    }

    @PostMapping("/posts/create")
    public String submitNewPost() {
        return "Created new Post";
    }
}
