package me.funnypro.qkmptros;

import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;

public class AboutActivity extends AppCompatActivity{
	
    @Override
    protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
		Toolbar aboutToolbar=(Toolbar)findViewById(R.id.标题栏);
		setSupportActionBar(aboutToolbar);   
	}
}
