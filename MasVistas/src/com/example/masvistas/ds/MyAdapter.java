package com.example.masvistas.ds;

import java.util.Vector;

import com.example.masvistas.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private final Activity actividad;
	private final Vector<String> lista;

	public MyAdapter(Activity actividad, Vector<String> lista) {
		super();
		this.actividad = actividad;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int pos) {

		return lista.elementAt(pos);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		LayoutInflater inflater = actividad.getLayoutInflater();

		View view = inflater.inflate(R.layout.custom_item_list, null, true);

		TextView textView = (TextView) view.findViewById(R.id.titulo);
		textView.setText(lista.elementAt(position));

		ImageView imageView = (ImageView) view.findViewById(R.id.icono);

		switch (Math.round((float) Math.random() * 3)) {

		case 0:

			imageView.setImageResource(R.drawable.asteroide1);

			break;

		case 1:

			imageView.setImageResource(R.drawable.asteroide2);

			break;

		default:

			imageView.setImageResource(R.drawable.asteroide3);

			break;

		 }

		return view;
	}

}
