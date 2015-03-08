/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PosterPro.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    public String postedDate(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        
        df.getTimeZone();
        String formattedDate = df.format(date);
        
        return formattedDate;
    }
}
