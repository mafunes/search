package search.mafunes.com.search.interfaces;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import search.mafunes.com.search.dto.Result;

public interface MLService {
    @GET("/sites/{site}/search?attributes=results")
    Call<Result> search(@Path("site") String site, @Query("q") String query);
}

