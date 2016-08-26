package wagner.wasp.dailyhuddle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Form extends Activity {
	boolean canSend = true;
	boolean alertShown = false;
	String body;
	final Context context = this;
	long tsStart;
	long tsEnd;
	long tsTotal;
	String ts;
	boolean hitEnd = false;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		//RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
		//rg.setBackgroundResource(R.drawable.ic_launcher);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form, menu);
		return true;
	}

	public void submitClick(View v) {
		if (hitEnd == false) {
			tsEnd = System.currentTimeMillis()/1000;
			hitEnd = true;
		}
		body = "";
		
		EditText et1 = (EditText) findViewById(R.id.editText1);
		EditText et2 = (EditText) findViewById(R.id.editText2);
		
		RadioButton rb3 = (RadioButton) findViewById(R.id.radio3);
		RadioButton rb4 = (RadioButton) findViewById(R.id.radio4);
		
		RadioButton rb9 = (RadioButton) findViewById(R.id.radio9);
		RadioButton rb10 = (RadioButton) findViewById(R.id.radio10);
		
		RadioButton rb14 = (RadioButton) findViewById(R.id.radio14);
		RadioButton rb15 = (RadioButton) findViewById(R.id.radio15);
		
		RadioButton rb17 = (RadioButton) findViewById(R.id.radio17);
		RadioButton rb18 = (RadioButton) findViewById(R.id.radio18);
		RadioButton rb19 = (RadioButton) findViewById(R.id.radio19);
		RadioButton rb20 = (RadioButton) findViewById(R.id.radio20);
		RadioButton rb21 = (RadioButton) findViewById(R.id.radio21);
		RadioButton rb22 = (RadioButton) findViewById(R.id.radio22);
		RadioButton rb23 = (RadioButton) findViewById(R.id.radio23);
		RadioButton rb24 = (RadioButton) findViewById(R.id.radio24);
		RadioButton rb25 = (RadioButton) findViewById(R.id.radio25);
		RadioButton rb26 = (RadioButton) findViewById(R.id.radio26);
		RadioButton rb27 = (RadioButton) findViewById(R.id.radio27);
		RadioButton rb28 = (RadioButton) findViewById(R.id.radio28);
		RadioButton rb29 = (RadioButton) findViewById(R.id.radio29);
		RadioButton rb30 = (RadioButton) findViewById(R.id.radio30);
		RadioButton rb31 = (RadioButton) findViewById(R.id.radio31);
		RadioButton rb32 = (RadioButton) findViewById(R.id.radio32);
		
		
		
		RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
		RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
		RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
		RadioGroup rg4 = (RadioGroup) findViewById(R.id.radioGroup4);
		RadioGroup rg5 = (RadioGroup) findViewById(R.id.radioGroup5);
		RadioGroup rg6 = (RadioGroup) findViewById(R.id.radioGroup6);
		RadioGroup rg7 = (RadioGroup) findViewById(R.id.radioGroup7);
		RadioGroup rg8 = (RadioGroup) findViewById(R.id.radioGroup8);
		RadioGroup rg9 = (RadioGroup) findViewById(R.id.radioGroup9);
		RadioGroup rg10 = (RadioGroup) findViewById(R.id.radioGroup10);
		RadioGroup rg11 = (RadioGroup) findViewById(R.id.radioGroup11);

		if (rg1.getCheckedRadioButtonId() == -1) {
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					context);

			// set title
			alertDialogBuilder.setTitle("Invalid Form");

			// set dialog message
			alertDialogBuilder
			.setMessage("One or more required fields were left blank.")
			.setCancelable(true);
			alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			});

			// create alert dialog
			AlertDialog alertDialog = alertDialogBuilder.create();

			// show it
			alertDialog.show();
			canSend = false;
			alertShown = true;
		}

		else {
			if (rg1.getCheckedRadioButtonId() == 2131230725) {
				body = body + "Safety performance was reviewed and a team member updated the chart: Yes" + "\n" + "\n";
			}

			if (rg1.getCheckedRadioButtonId() == 2131230726) {
				body = body + "Safety performance was reviewed and a team member updated the chart: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}

		if (rb3.isChecked()) {
			body = body + "If Safety performance fell short of goal, an action was written and posted on board: Yes" + "\n" + "\n";
		}
		
		if (rb4.isChecked()) {
			body = body + "If Safety performance fell short of goal, an action was written and posted on board: No" + "\n" + "\n";
		}
		
		
		if (rg3.getCheckedRadioButtonId() == -1) {
			if (alertShown == false) {
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				// set title
				alertDialogBuilder.setTitle("Invalid Form");

				// set dialog message
				alertDialogBuilder
				.setMessage("One or more required fields were left blank.")
				.setCancelable(true);
				alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						dialog.cancel();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
			alertShown = true;
			canSend = false;
		}

		else {
			if (rg3.getCheckedRadioButtonId() == 2131230734) {
				body = body + "Quality performance was reviewed and a team member updated the chart: Yes" + "\n" + "\n";
			}

			if (rg3.getCheckedRadioButtonId() == 2131230735) {
				body = body + "Quality performance was reviewed and a team member updated the chart: No" + "\n" + "\n";
			}
			//yes is 2131230734
			//no is  2131230735
			//System.out.println(rg3.getCheckedRadioButtonId());
		}
		
		if (rb9.isChecked()) {
			body = body + "If Quality performance fell short of goal, an action was written and posted on board: Yes" + "\n" + "\n";
		}
		
		if (rb10.isChecked()) {
			body = body + "If Quality performance fell short of goal, an action was written and posted on board: No" + "\n" + "\n";
		}

		if (rg5.getCheckedRadioButtonId() == -1) {
			if (alertShown == false) {
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				// set title
				alertDialogBuilder.setTitle("Invalid Form");

				// set dialog message
				alertDialogBuilder
				.setMessage("One or more required fields were left blank.")
				.setCancelable(true);
				alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						dialog.cancel();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
			alertShown = true;
			canSend = false;
		}

		else {
			if (rg5.getCheckedRadioButtonId() == 2131230743) {
				body = body + "Output performance was reviewed and the chart was updated: Yes" + "\n" + "\n";
			}

			if (rg5.getCheckedRadioButtonId() == 2131230744) {
				body = body + "Output performance was reviewed and the chart was updated: Yes" + "\n" + "\n";
			}
			//System.out.println(rg5.getCheckedRadioButtonId());
			//yes is 2131230743
			//no is  2131230744
		}
		
		if (rb14.isChecked()) {
			body = body + "If Output performance fell short of goal, an action was written and posted on board: Yes" + "\n" + "\n";
		}
		
		if (rb15.isChecked()) {
			body = body + "If Output performance fell short of goal, an action was written and posted on board: No" + "\n" + "\n";
		}
		
		if (rb17.isChecked()) {
			body = body + "Leader reviewed status of actions and updated appropriate card positions on board: Yes" + "\n" + "\n";
		}
		
		if (rb18.isChecked()) {
			body = body + "Leader reviewed status of actions and updated appropriate card positions on board: No" + "\n" + "\n";
		}
		
		if (rb19.isChecked()) {
			body = body + "Leader reviewed status of actions and updated appropriate card positions on board: N/A" + "\n" + "\n";
		}
		
		if (rg8.getCheckedRadioButtonId() == -1) {
			if (alertShown == false) {
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

				// set title
				alertDialogBuilder.setTitle("Invalid Form");

				// set dialog message
				alertDialogBuilder
				.setMessage("One or more required fields were left blank.")
				.setCancelable(true);
				alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						dialog.cancel();
					}
				});

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
			}
			alertShown = true;
			canSend = false;
		}

		else {
			if (rb20.isChecked()) {
				body = body + "Leader encouraged ideas from Team Members: Yes" + "\n" + "\n";
			}
			
			if (rb21.isChecked()) {
				body = body + "Leader encouraged ideas from Team Members: No" + "\n" + "\n";
			}
		}
		
		
		if (rb22.isChecked()) {
			body = body + "Building: 631" + "\n" + "\n";
		}
		
		if (rb23.isChecked()) {
			body = body + "Building: 874" + "\n" + "\n";
		}
		
		if (rb30.isChecked()) {
			body = body + "Building: 862" + "\n" + "\n";
		}
		
		if (rb31.isChecked()) {
			body = body + "Building: NE" + "\n" + "\n";
		}
		
		if (rb24.isChecked()) {
			body = body + "Area: Assembly" + "\n" + "\n";
		}
		
		if (rb25.isChecked()) {
			body = body + "Area: Paint/Prep" + "\n" + "\n";
		}
		
		if (rb26.isChecked()) {
			body = body + "Area: Weld" + "\n" + "\n";
		}
		
		if (rb27.isChecked()) {
			body = body + "Area: Fab" + "\n" + "\n";
		}
		
		if (rb32.isChecked()) {
			body = body + "Area: Engineering" + "\n" + "\n";
		}
		
		if (rb28.isChecked()) {
			body = body + "Shift: 1st" + "\n" + "\n";
		}
		
		if (rb29.isChecked()) {
			body = body + "Shift: 2nd" + "\n" + "\n";
		}
		
		
		body = body + "Number of ideas/actions posted: " + et1.getText().toString() + "\n" + "\n";
		
		body = body + "Comments: " + et2.getText().toString() + "\n" + "\n";
		
		tsTotal = tsEnd-tsStart;
		if (tsTotal > 60){
			long minutes = tsTotal / 60;
			long seconds = tsTotal % 60;
			if (seconds < 10) {
				ts = minutes +":"+"0"+seconds;
			}
			else {
				ts = minutes +":"+ seconds;
			}
		}
		
		else {
			if (tsTotal < 10) {
				ts = "0:0"+tsTotal;
			}
			else {
				ts = "0:"+tsTotal;
			}
		}
		
		if (tsTotal > 1000) {
			ts = "Timer was not started.";
		}
		body = body + "Meeting duration: " + ts;
		//System.out.println(body);

		if (canSend == true) {
			Intent email = new Intent(Intent.ACTION_SEND);
			email.putExtra(Intent.EXTRA_EMAIL, new String[]{"swagner@waspinc.com"});
			email.putExtra(Intent.EXTRA_SUBJECT, "Daily Huddle Feedback");
			email.putExtra(Intent.EXTRA_TEXT, body);
			email.setType("message/rfc822");
			startActivity(Intent.createChooser(email, "Choose an Email client :"));
		}

		canSend = true;
		alertShown = false;

	}

	public void startTime(View v) {
		Button startButton = (Button) findViewById(R.id.button1);
		Button endButton = (Button) findViewById(R.id.button3);
		tsStart = System.currentTimeMillis()/1000;
		hitEnd = false;
		startButton.setBackgroundColor(Color.GREEN);
		endButton.setBackgroundColor(Color.GREEN);
	}

	public void endTime(View v) {
		Button startButton = (Button) findViewById(R.id.button1);
		Button endButton = (Button) findViewById(R.id.button3);
		tsEnd = System.currentTimeMillis()/1000;
		hitEnd = true;
		startButton.setBackgroundColor(Color.RED);
		endButton.setBackgroundColor(Color.RED);
//		tsTotal = tsEnd-tsStart;
//		if (tsTotal > 60){
//			long minutes = tsTotal / 60;
//			long seconds = tsTotal % 60;
//			if (seconds < 10) {
//				ts = minutes +":"+"0"+seconds;
//			}
//			else {
//				ts = minutes +":"+ seconds;
//			}
//		}
		
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		// Checks the orientation of the screen

	}

}
