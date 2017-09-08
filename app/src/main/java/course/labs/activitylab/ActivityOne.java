package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		//TODO:  increment the variables' values when their corresponding lifecycle methods get called.
		int onCreateCount = 0;
		int onStartCount = 0;
		int onPauseCount = 0;
		int onResumeCount = 0;
		int onRestartCount = 0;
		int onStopCount = 0;
		int onDestroyCount = 0;

		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);

			//Log cat print out
			Log.i(TAG, "onCreate called");
			
			//TODO: update the appropriate count variable & update the view
            onCreateCount++;
            displayCounts();

		}

		@Override
		protected void onPause() {
			super.onPause();

			//Log cat print out
			Log.i(TAG, "onPause called");

			//TODO: update the appropriate count variable & update the view
            onPauseCount++;
            displayCounts();
		}
		@Override
		protected void onResume() {
			super.onResume();

			//Log cat print out
			Log.i(TAG, "onResume called");

			//TODO: update the appropriate count variable & update the view
            onResumeCount++;
            displayCounts();
		}
		@Override
		protected void onRestart() {
			super.onRestart();

			//Log cat print out
			Log.i(TAG, "onRestart called");

			//TODO: update the appropriate count variable & update the view
            onRestartCount++;
            displayCounts();
		}
		@Override
		protected void onDestroy() {
			super.onDestroy();

			//Log cat print out
			Log.i(TAG, "onDestroy called");

			//TODO: update the appropriate count variable & update the view
            onDestroyCount++;
            displayCounts();
		}
		@Override
		protected void onStop() {
			super.onStop();

			//Log cat print out
			Log.i(TAG, "onStop called");

			//TODO: update the appropriate count variable & update the view
            onStopCount++;
            displayCounts();
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");
			
			//TODO:  update the appropriate count variable & update the view
            onStartCount++;
            displayCounts();

		}

	    // TODO: implement 5 missing lifecycle callback methods DONE

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables

		}


		public void launchActivityTwo(View view) {
            startActivity(new Intent(this, ActivityTwo.class));
		}


        private void displayCounts () {
            ((TextView) findViewById(R.id.create)).setText(getString(R.string.onCreate) + " " +
                    onCreateCount);
            ((TextView) findViewById(R.id.start)).setText(getString(R.string.onStart) + " " +
                    onStartCount);
            ((TextView) findViewById(R.id.resume)).setText(getString(R.string.onResume) + " " +
                    onResumeCount);
            ((TextView) findViewById(R.id.pause)).setText(getString(R.string.onPause) + " " +
                    onPauseCount);
            ((TextView) findViewById(R.id.stop)).setText(getString(R.string.onStop) + " " +
                    onStopCount);
            ((TextView) findViewById(R.id.restart)).setText(getString(R.string.onRestart) + " " +
                    onRestartCount);
            ((TextView) findViewById(R.id.destroy)).setText(getString(R.string.onDestroy) + " " +
                    onDestroyCount);
        }
}
