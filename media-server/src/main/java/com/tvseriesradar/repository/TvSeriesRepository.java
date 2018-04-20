package com.tvseriesradar.repository;

/**
 * Created by tkiziloren on 04/07/2017.
 */

import com.tvseriesradar.dto.main.TvSeries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "tvSeries", path = "tvSeries")
public interface TvSeriesRepository extends MongoRepository<TvSeries, Integer> {

    @Query(value="{}", fields="{'name': 1, '_id': 1, 'imdb_rating': 1, 'backdrop_path': 1, 'imdb_vote_count': 1}")
    Page<TvSeries> findAllWithSummaries(Pageable pageable);
    List<TvSeries> findAll();

    @Query(value="{}", fields="{'name': 1, '_id': 1, 'imdb_rating': 1, 'backdrop_path': 1, 'imdb_vote_count': 1}")
    TvSeries findTvSeriesById(String id);

}
