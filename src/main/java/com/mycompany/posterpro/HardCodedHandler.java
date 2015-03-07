/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.posterpro;

import PosterPro.model.Post;
import PosterPro.model.PostHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ronald
 */
public class HardCodedHandler implements PostHandler {
    
    @Override
    public List<Post> getPosts(){
    List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("This is a post"));
        posts.add(new Post("This is another post"));
        posts.add(new Post("This is a third post"));
        posts.add(new Post("And a fourth post"));
        posts.add(new Post("And yet another"));
        posts.add(new Post("The interface works!"));
            
        return posts;
    }
}
