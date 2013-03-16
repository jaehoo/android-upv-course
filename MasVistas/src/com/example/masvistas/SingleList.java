package com.example.masvistas;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.masvistas.ds.AlmacenPuntuaciones;
import com.example.masvistas.ds.AlmacenPuntuacionesArray;

public class SingleList extends ListActivity {
	
	// TODO GET DATA
	public static AlmacenPuntuaciones data= new AlmacenPuntuacionesArray();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.single_list);
		
		// TODO Fill list
		setListAdapter(new ArrayAdapter<String>(this
				, android.R.layout.simple_list_item_1,
				data.listaPuntuaciones(10)));
	}



}
