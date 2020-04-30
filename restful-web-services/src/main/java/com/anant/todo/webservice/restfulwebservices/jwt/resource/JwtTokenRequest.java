package com.anant.todo.webservice.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;
    
    /*{
    	token: "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBbmFudCIsImV4cCI6MTU4NjE4MzA5MiwiaWF0IjoxNTg1NTc4MjkyfQ.P8mr8Ovl-s-rOciZBugI7ASyZWvxi9hGPoGtX1J4D3CyDfp64ighmtdQ-jllP0l-8eZI8tqC6_Qjx-z35sbEgQ"
    	}*/

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
