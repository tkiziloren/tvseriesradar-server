package com.tvseriesradar.repository;

/**
 * Created by tkiziloren on 04/07/2017.
 */

import com.tvseriesradar.dto.main.TvSeriesSummary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "tvSeriesSummary", path = "tvSeriesSummary")
public interface TvSeriesSummaryRepository extends MongoRepository<TvSeriesSummary, Integer> {

    List<TvSeriesSummary> findTop30ByLastUpdateDateIsNull();
    TvSeriesSummary findTvSeriesSummaryById(String id);

}
