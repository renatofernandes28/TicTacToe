package com.app.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.fernsproductions.tictactoe.R;
 
public class MainMenuScreen extends Activity {
 
	@Override
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_menu);
 
		((Button) findViewById(R.id.one_player)).setOnClickListener(new OnClickListener() {
			public void onClick(View V) {
				Log.d("DEBUG", "One Player Button Pressed!");
				Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
				intent.putExtra("gameType", true);
				startActivityForResult(intent, 0);
			}
		});
 
		((Button) findViewById(R.id.two_player)).setOnClickListener(new OnClickListener() {
			public void onClick(View V) {
				Log.d("DEBUG", "Two Player Button Pressed!");
				Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
				intent.putExtra("gameType", false);
				startActivityForResult(intent, 0);
			}
		});
 
		((Button) findViewById(R.id.exit_game)).setOnClickListener(new OnClickListener() {
			public void onClick(View V) {
				Log.d("DEBUG", "Exit Game Button Pressed!");
				MainMenuScreen.this.finish();
			}
		});
	}
}