package com.example.masvistas;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DatosReceptor extends Activity {

	
	/** Called when the activity is first created. */

    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.datos_receptor);
        
        // Get data FROM Caller
    	Bundle extras= getIntent().getExtras();
        String text= extras.getString("param"); 
        Toast.makeText(this, "ENVIADO:[ "+text+" ]", Toast.LENGTH_LONG).show();
        
        // put result value
        Intent i= new Intent();
        i.putExtra("response", new Date().toString());
        setResult(RESULT_OK, i);

    }
    
    public void close(View view){
    	finish();
    	
    }
	
}
