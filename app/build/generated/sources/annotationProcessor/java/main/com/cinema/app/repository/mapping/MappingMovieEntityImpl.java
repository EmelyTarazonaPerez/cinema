package com.cinema.app.repository.mapping;

import com.cinema.app.repository.entity.Actor;
import com.cinema.app.repository.entity.MovieEntity;
import com.cinema.app.servicio.model.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-18T00:36:46-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.13.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class MappingMovieEntityImpl implements MappingMovieEntity {

    @Override
    public MovieEntity modelToEntity(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieEntity movieEntity = new MovieEntity();

        movieEntity.setId( movie.id );
        movieEntity.setTitle( movie.title );
        movieEntity.setDescription( movie.description );
        movieEntity.setCreatedAt( movie.createdAt );
        movieEntity.setUpdatedAt( movie.updatedAt );
        movieEntity.setManager( movie.manager );
        movieEntity.setGender( movie.gender );
        List<Actor> list = movie.actors;
        if ( list != null ) {
            movieEntity.setActors( new ArrayList<Actor>( list ) );
        }

        return movieEntity;
    }

    @Override
    public Movie entityToModel(MovieEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.id = entity.getId();
        movie.title = entity.getTitle();
        movie.description = entity.getDescription();
        movie.createdAt = entity.getCreatedAt();
        movie.updatedAt = entity.getUpdatedAt();
        movie.manager = entity.getManager();
        movie.gender = entity.getGender();
        List<Actor> list = entity.getActors();
        if ( list != null ) {
            movie.actors = new ArrayList<Actor>( list );
        }

        return movie;
    }

    @Override
    public List<Movie> entityListToModelList(List<MovieEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Movie> list = new ArrayList<Movie>( entity.size() );
        for ( MovieEntity movieEntity : entity ) {
            list.add( entityToModel( movieEntity ) );
        }

        return list;
    }
}
