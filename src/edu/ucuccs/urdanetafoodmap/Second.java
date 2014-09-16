package edu.ucuccs.urdanetafoodmap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.parse.ParseUser;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		ParseUser currentUser = ParseUser.getCurrentUser();

		String struser = currentUser.getUsername().toString();

		TextView txtuser = (TextView) findViewById(R.id.txtuser);

		txtuser.setText(" Welcome " + struser);

		
		
		
	}

}
