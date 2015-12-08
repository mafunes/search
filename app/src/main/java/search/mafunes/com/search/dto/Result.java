package search.mafunes.com.search.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class Result implements Serializable {
    public final ArrayList<Item> results;

    public Result(ArrayList<Item> results) {
        this.results = results;
    }
}
