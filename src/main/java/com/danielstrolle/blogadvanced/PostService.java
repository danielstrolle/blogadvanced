package com.danielstrolle.blogadvanced;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
class PostService {
    private ArrayList<Post> posts;

    public PostService() {
        posts = new ArrayList<>();

    }

}
