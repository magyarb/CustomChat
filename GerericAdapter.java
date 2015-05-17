package hu.bme.aut.hf.customchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

/**
 * Created by Balázs on 2015.05.17..
 */
public class GerericAdapter extends BaseAdapter {
    private final List<Object> items;

    public GerericAdapter(List<Object> items) {
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Object item = items.get(position);
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       // View view = inflater.inflate(R.layout.listitem, null);

        return null;
    }
}
