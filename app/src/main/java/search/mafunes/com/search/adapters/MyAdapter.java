package search.mafunes.com.search.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import search.mafunes.com.search.R;
import search.mafunes.com.search.dto.Item;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final List<Item> mList;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Item> list) {
        this.mList = list;
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageView mImage;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.title);
            mImage = (ImageView)v.findViewById(R.id.image);
        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        String title = mList != null ? String.valueOf(mList.get(position).title) : "";
        String thumbnail = mList != null ? String.valueOf(mList.get(position).thumbnail) : "";
        holder.mTextView.setText(title);
        Picasso.with(holder.mTextView.getContext()).load(thumbnail).into(holder.mImage);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }
}
