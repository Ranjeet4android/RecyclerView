package recyclerview.ranjeet.android.com.recyclerview;

/**
 * Created by ranjeet on 4/10/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<CustomViewHolder> {


    public List<Listtem> feedItemList;

    private Context mContext;



    public MyRecyclerAdapter(Context context, List<Listtem> feedItemList) {
        this.feedItemList = feedItemList;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item, null);
        CustomViewHolder mh = new CustomViewHolder(v);

        return mh;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder feedListRowHolder, int i) {
        Listtem feedItem = feedItemList.get(i);

        Picasso.with(mContext).load(feedItem.getThumbnail())
                .error(R.drawable.addpin)
                .placeholder(R.drawable.addpin)
                .into(feedListRowHolder.image_lbl);

        feedListRowHolder.name.setText(Html.fromHtml(feedItem.getTitle()));
    }

    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }


}
