package com.ThopTv.MovieInfo.Controllers;

import com.ThopTv.MovieInfo.Dtos.UserDto;
import com.ThopTv.MovieInfo.Entites.EntityMovie;
import com.ThopTv.MovieInfo.Entites.EntityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ThopTv.MovieInfo.Services.MovieInfoService;
import org.stringtemplate.v4.ST;

import java.util.List;

@RestController
public class MovieInfoController {
    @Autowired
    private MovieInfoService movieInfoService;


    @GetMapping("/welcome/{student}")
    public List<EntityUser> printer(@PathVariable String student){
        return movieInfoService.sayHello(student);
    }
    @GetMapping("/welcome/{user}/fav")
    public String printFavMovies(@PathVariable String user){
        return movieInfoService.getFavMovies(user);
    }
    @GetMapping("/welcome")
    public String printAllMovies(){
        return movieInfoService.getAllMovies();
    }
    @PostMapping("/check")
    public EntityUser getUserFromUi(@RequestBody UserDto x ){
        return movieInfoService.authUser(x);
    }




}
