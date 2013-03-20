package com.example.masvistas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuPreferencias extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_preferencias);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_preferencias, menu);
		return true;
	}


	/**
	 * Open Preferences Activity from Activity Menu
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.config:

			openPreferneces(null);

			break;
		}

		return true;
		
	}
	
	/**
	 * Open Preferences Activity
	 * @param view
	 */
	public void openPreferneces(View view) {
		Intent i = new Intent(this, Preferencias.class);
		startActivity(i);
	}
}
