package com.example.masvistas;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.masvistas.ds.AlmacenPuntuaciones;
import com.example.masvistas.ds.AlmacenPuntuacionesArray;

public class CustomList extends ListActivity {

	public static AlmacenPuntuaciones data = new AlmacenPuntuacionesArray();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_list);

		// TODO Fill list
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.custom_item_list, R.id.titulo,
				data.listaPuntuaciones(10)));

	}

	
	

}
