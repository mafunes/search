package search.mafunes.com.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

import search.mafunes.com.search.dto.Item;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        List<Item> items = (List<Item>)getIntent().getSerializableExtra("items");
        TextView textView = ((TextView) findViewById(R.id.items));
        textView.setText(items.toString());
    }
}
