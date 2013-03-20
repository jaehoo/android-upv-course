package com.example.masvistas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}


	public void openPassData(View view){
		  Intent i = new Intent(this, DatosEmisor.class);
		  startActivity(i);
	}
	
	public void openCounter(View view){
		Intent i= new Intent(this, Counter.class );
		startActivity(i);
		
	}
	
	public void openSingleList(View view){
		Intent i= new Intent(this, SingleList.class );
		startActivity(i);
	}
	
	public void openMenuPreferneces(View view) {
		Intent i = new Intent(this, MenuPreferencias.class);
		startActivity(i);
	}
	
	public void openCustomList(View view){
		Intent i = new Intent(this, CustomList.class);
		startActivity(i);
	}
	
	public void openCustomList2(View view){
		Intent i = new Intent(this, CustomList2.class);
		startActivity(i);
	}
	
	public void openInetntions(View view){
		Intent i = new Intent(this, MenuIntenciones.class);
		startActivity(i);
	}
	
	public void quitApp(View view){
		finish();
	}
	
}
