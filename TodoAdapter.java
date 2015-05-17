package hu.bme.aut.hf.customchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balázs on 2015.05.16..
 */
public class TodoAdapter extends BaseAdapter{

    private final List<MsgLstItem> items;

    public TodoAdapter(final Context context, final ArrayList<MsgLstItem> aTodos) { //eltároljuk a megjelenítendő arraylistet
        items = aTodos;
    }

    public void addItem(MsgLstItem item)
    {
        items.add(item);
    }

    public int getCount() {
        return items.size();
    }

    public Object getItem(int position) {
        return items.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    /**
     * Sor megjelenítésének beállítása
     */
    public View getView(int position, View convertView, ViewGroup parent) { //visszaadja view-ként az adott pozícióban lévő elemet

        final MsgLstItem item = items.get(position); //lekéri a todo-t, amit fel kell fújni

        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService( //beszerzünk egy inflatert
                Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listitem, null); //amivel felfújunk egy új view-t(lehetne újrafelhasználni, gyorsabb)


        TextView textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle); //meg a szövegeket, és be is állítjuk
        textViewTitle.setText(item.getName());

        TextView textViewDueDate = (TextView) itemView.findViewById(R.id.textViewDueDate);
        textViewDueDate.setText(Integer.toString(item.getNewCnt()));

        return itemView; //majd visszaadjuk
    }

    /**
     * Egy elem törlése
     */
    public void deleteRow(MsgLstItem item) {
        if(items.contains(item)) {
            items.remove(item);
        }
    }
}