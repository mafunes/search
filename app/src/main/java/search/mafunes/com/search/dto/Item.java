package search.mafunes.com.search.dto;

import java.io.Serializable;

public class Item implements Serializable {
    public final String id;
    public final String title;
    public final String thumbnail;

    public Item(String id, String title, String thumbnail) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "id: "+ id + " title: " + title;
    }
}
