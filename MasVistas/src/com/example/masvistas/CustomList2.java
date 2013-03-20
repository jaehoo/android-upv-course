package com.example.masvistas;

import com.example.masvistas.ds.AlmacenPuntuaciones;
import com.example.masvistas.ds.AlmacenPuntuacionesArray;
import com.example.masvistas.ds.MyAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class CustomList2 extends ListActivity {

	public static AlmacenPuntuaciones data = new AlmacenPuntuacionesArray();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_list);

		// TODO Fill list
		setListAdapter(new MyAdapter(this, data.listaPuntuaciones(10)));

	}

	/**
	 * NOTA:En algunos casos el adaptador ha de trabajar con listas muy grandes
	 * o estas listas han de ser creadas desde un servidor. En estos casos es
	 * mejor ir solicitando la información a medida que se va representando. Un
	 * ejemplo se muestra en la aplicación ApiDemos descrita en el capítulo 1,
	 * en la actividad:
	 * 
	 * com.example.android.apis.view.List13
	 */
}
