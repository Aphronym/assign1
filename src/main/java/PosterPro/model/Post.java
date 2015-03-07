/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PosterPro.model;

/**
 *
 * @author ronald
 */
public class Post {
    
    private String post;

    public Post(){
        post = "";
    }
    public Post(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    @Override
    public String toString(){
        return post;
    }
    
    public String toFileString(){
        return post;
    }
    
    public void loadFromFileString(String str){
        post = str;
    }
}
