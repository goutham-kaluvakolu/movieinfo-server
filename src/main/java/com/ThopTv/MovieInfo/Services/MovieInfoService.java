package com.ThopTv.MovieInfo.Services;

import com.ThopTv.MovieInfo.Dtos.UserDto;
import com.ThopTv.MovieInfo.Entites.EntityMovie;
import com.ThopTv.MovieInfo.Entites.EntityUser;
import com.ThopTv.MovieInfo.Entites.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class MovieInfoService {
    @Autowired
    UserDao userDao;
    @Autowired
    UserDto userDto;


    private List<EntityMovie> movies = new ArrayList<>();

    public List<EntityUser> sayHello(String student) {
        List<EntityUser> x = userDao.findAll();
        return x;
    }

    public List<EntityMovie> addMovie() {
        movies.add(new EntityMovie("3", "Love-Drama"));
        movies.add(new EntityMovie("1", "Action-Love-Drama"));
        return movies;
    }

    public String getFavMovies(String user) {

        return user + getAllMovies();
    }

    public String getAllMovies() {
        String yourmovies = addMovie().stream().map(i -> i.getMovieName()).collect(Collectors.joining(","));
        return yourmovies;
    }

    public EntityUser authUser(UserDto x) {
        Optional<EntityUser> z = Optional.ofNullable(userDao.findByEmail(x.getEmail()));

        EntityUser y = z.orElse(new EntityUser());
        if (y.getEmail() == null) {
            y.setEmail("wroung Email");
            return y;
        } else if (y.getEmail() != null && y.getPassword().equals(x.getPassword())) {
            return y;
        } else {
            y.setPassword("wrongPassword");
            return y;
        }


    }

}
