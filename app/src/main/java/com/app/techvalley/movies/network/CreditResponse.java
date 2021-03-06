package com.app.techvalley.movies.network;

import com.app.techvalley.movies.models.Cast;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by KeshavAggarwal on 10/02/17.
 */

public class CreditResponse {

    @SerializedName("cast")
    private ArrayList<Cast> cast;

    public ArrayList<Cast> getCast() {
        return cast;
    }

    public void setMovieCast(ArrayList<Cast> cast) {
        this.cast = cast;
    }

}
