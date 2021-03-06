package se.mah.kd330a.project.settings.view;

import se.mah.kd330a.project.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends Activity {
	private static final String PREFS_NAME
	    = "myCourses";
	SharedPreferences sharedPref;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		sharedPref = this.getPreferences(Context.MODE_PRIVATE);
		
		String course = sharedPref.getString(PREFS_NAME, "No Classes");
		TextView courseText = (TextView) findViewById(R.id.course_text);
		courseText.setText(course);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help, menu);
		return true;
	}
	
	public void toSearchable(View view) {
		Intent intent = new Intent(this, SearchableDictionary.class);
		startActivity(intent);
		
	}

}
