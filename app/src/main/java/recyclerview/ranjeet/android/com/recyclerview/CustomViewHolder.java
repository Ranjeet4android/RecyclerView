package recyclerview.ranjeet.android.com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by ranjeet on 4/10/16.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public ImageView image_lbl;

    public CustomViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.title);
        image_lbl = (ImageView) itemView.findViewById(R.id.thumbnail);
    }

    public void bind(final Listtem item, final AdapterView.OnItemClickListener listener) {
        name.setText(item.getTitle());
        Picasso.with(itemView.getContext()).load(item.getThumbnail()).into(image_lbl);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Log.d("onClick","onClick");
            }
        });

    }
}