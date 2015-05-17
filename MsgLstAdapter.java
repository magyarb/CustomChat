package hu.bme.aut.hf.customchat;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Balázs on 2015.05.17..
 */
public class MsgLstAdapter extends BaseAdapter{

    private final List<MsgLstItem> items;

    public MsgLstAdapter(final List<MsgLstItem> items) {
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
        final MsgLstItem item = items.get(position);
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listitem, null);
        //TextView newcount = (TextView) view.findViewById(R.id.newmsgcnt);
        //newcount.setText(item.getNewCnt());
        //TextView roomname = (TextView) view.findViewById(R.id.roomname);
        //roomname.setText(item.getName());
        return null;
    }
}
