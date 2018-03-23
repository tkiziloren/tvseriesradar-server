package com.tvseriesradar.util;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.interfaces.AppendToResponseMethod;
import com.omertron.themoviedbapi.model.tv.TVBasic;
import com.omertron.themoviedbapi.model.tv.TVEpisodeInfo;
import com.omertron.themoviedbapi.model.tv.TVInfo;
import com.omertron.themoviedbapi.model.tv.TVSeasonInfo;
import com.tvseriesradar.explorer.SeriesExplorer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tkiziloren on 23/04/2017.
 */
public class Utility {
    static final Logger logger = LoggerFactory.getLogger(Utility.class);

    protected static <T extends AppendToResponseMethod> String appendToResponseBuilder(Class<T> methodClass) {
        boolean first = true;
        StringBuilder atr = new StringBuilder();
        for (AppendToResponseMethod method : methodClass.getEnumConstants()) {
            if (first) {
                first = false;
            } else {
                atr.append(",");
            }
            atr.append(method.getPropertyString());
        }
        return atr.toString();
    }

    public static Map<String, String> readValidSeries(String fileName) throws IOException, URISyntaxException {

        Path path = Paths.get(Constants.class.getClassLoader().getResource(fileName).toURI());
        Map<String, String> result = new HashMap<>();

        List<String> series = Files.readAllLines(path, Charset.defaultCharset());
        series.stream().forEach((String s) -> {

            String[] splitted = s.split(",Name:");
            result.put(splitted[0].substring(splitted[0].indexOf(":") + 1), splitted[1]);
        });

        return result;
    }

    public static List<String> extractTvSeriesFromFile(String fileName) throws IOException, URISyntaxException {

        Path path = Paths.get(Constants.class.getClassLoader().getResource(fileName).toURI());
        List<String> result = new ArrayList<>();

        List<String> series = Files.readAllLines(path, Charset.defaultCharset());
        series.stream().forEach((String s) -> {
            result.add(extractImdbLine(s));
        });

        return result;
    }




    public static String extractImdbLine(String imdbLine){
        final String separator = "\t";
        int first = imdbLine.indexOf(separator);
        int second = imdbLine.indexOf(separator, first + 1);
        return imdbLine.substring(first,second).trim();
    }

    public static TVInfo collectSeriesInfo(int seriesId, SeriesExplorer explorer) throws MovieDbException {
        TVInfo result = explorer.findById(seriesId);
        logger.debug(result.getGenres().toString());
        List<TVSeasonInfo> seasons = new ArrayList<>();
        for(int i = 1; i <= result.getNumberOfSeasons(); i++){
            TVSeasonInfo season = explorer.getSeasons(result.getId(), i);
            seasons.add(season);
            List<TVEpisodeInfo> episodes = new ArrayList<>();
            for(int j = 1; j <= season.getEpisodes().size(); j++){
                TVEpisodeInfo episode = explorer.getEpisodes(result.getId(), season.getSeasonNumber(), j);
                episodes.add(episode);
            }
            season.setEpisodes(episodes);
        }
        return result;
    }


    public static void writeToConsole(TVBasic item){
        logger.debug("ID:" + item.getId() + ",Name:" + item.getName());
    }


}
