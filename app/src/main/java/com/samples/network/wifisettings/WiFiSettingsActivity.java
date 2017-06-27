package com.samples.network.wifisettings;

import android.app.ListActivity;
import android.content.Intent;
import android.provider.Settings;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WiFiSettingsActivity extends ListActivity {

    private String[] actions = {
            Settings.ACTION_WIFI_IP_SETTINGS,
            Settings.ACTION_WIFI_SETTINGS,
            Settings.ACTION_WIRELESS_SETTINGS
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try{
          setListAdapter(new ArrayAdapter<String>(this,
                  android.R.layout.simple_list_item_1, actions));
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        };
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        try{
            Intent intent = new Intent(actions[position]);
            startActivity(intent);
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
