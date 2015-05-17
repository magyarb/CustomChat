package hu.bme.aut.hf.customchat;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MsgLstActivity extends ListActivity{
    TodoAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<MsgLstItem> items = new ArrayList<MsgLstItem>();
        items.add(new MsgLstItem(1, "Humbák Feri"));
        adapter = new TodoAdapter(this.getApplicationContext(), items);
        setListAdapter(adapter);
        registerForContextMenu(getListView());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        if (v.equals(getListView())) {
            AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
            menu.setHeaderTitle(((MsgLstItem) getListAdapter().getItem(info.position))
                    .getName());
            String[] menuItems = getResources()
                    .getStringArray(R.array.todomenu);
            for (int i = 0; i < menuItems.length; i++) {
                menu.add(Menu.NONE, i, i, menuItems[i]);
            }
        }
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        MsgLstItem selectedItem = (MsgLstItem) getListAdapter().getItem(position);
        Intent i = new Intent(this.getApplicationContext(),Detail.class);
        Bundle b = new Bundle();
        b.putString("d", selectedItem.getName());
        i.putExtras(b);
        startActivity(i);
    }
}
