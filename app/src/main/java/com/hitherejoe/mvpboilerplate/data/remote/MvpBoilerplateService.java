package com.hitherejoe.mvpboilerplate.data.remote;


import com.hitherejoe.mvpboilerplate.data.model.NamedResource;
import com.hitherejoe.mvpboilerplate.data.model.Pokemon;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Single;

public interface MvpBoilerplateService {

    @GET("pokemon")
    Single<PokemonListResponse> getPokemonList(@Query("limit") int limit);

    @GET("pokemon/{name}")
    Single<Pokemon> getPokemon(@Path("name") String name);

    class PokemonListResponse {
        public List<NamedResource> results;
    }

}
