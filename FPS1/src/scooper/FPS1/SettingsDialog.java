package scooper.FPS1;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ImageView;
//import java.io.*;

public class SettingsDialog extends Activity {
	//private TextView prTextEncodingFormat;
	//private TextView prTextContainerFormat;
	private Spinner prSpinnerWeapon;
	private Spinner prSpinnerEncodingFormat;
	private Spinner prSpinnerConainterFormat;
	private Spinner prSpinnerResolution;
	private Button prBtnOk;
	private Button prBtnCancel;
	
	//for folderSpinner: 1. original folder, 2. browse for a folder
	public static final int cpuH263 = 0;
	public static final int cpuMP4_SP = 1;
	public static final int cpuH264 = 2;
	
	public static final int cpu3GP = 0;
	public static final int cpuMP4 = 1;
	
	public static final int cpuRes176 = 0;
	public static final int cpuRes320 = 1;
	public static final int cpuRes720 = 2;
	
	public static int puWeaponChoice = 0;
	
	//public static final String cpuEncodingFormatOptionString = "cpuEncodingFormatOption";
	//public static final String cpuContainerFormatOptionString = "cpuContainerFormatOption";
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.dialog_settings);	

		prSpinnerWeapon = (Spinner) findViewById(R.id.dialog_settings_weapon_spinner);
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this, R.array.dialog_settings_weapon_array, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		prSpinnerWeapon.setAdapter(adapter1);	
		prSpinnerWeapon.setSelection(Utils.puWeaponChoice);
		prSpinnerWeapon.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				//ImageView prImageView;
				
			    int rowSelected = (int)arg3;
				Utils.puWeaponChoice = rowSelected;
				//prImageView1 = (ImageView) (findViewById(R.id.imageView1));
				//if (Utils.puWeaponChoice == 3) {
				//prImageView1.setImageResource(R.drawable.cod_gun1);
				//prImageView.getResources().getAssets().open("cod_gun1");
				//prImageView.setImageResource(R.drawable.cod_gun2);
				//prImageView.setImageResource(R.drawable.cod_gun1);
				//prImageView.setImageDrawable(getResources().getDrawable(R.drawable.cod_gun1));
				//prImageView.invalidate();
				//var drawable = Drawable.CreateFromStream(Assets.Open("Icon.png", Access.Streaming), null);
				//drawable draw = Drawable.createFromStream(assets.images, srcName)
				//imageView.SetImageDrawable(drawable);
				
				//ImageView image = (ImageView) findViewById(R.id.imageView1);
				//image.setImageResource(R.drawable.cod_gun2);
				//prImageView.getResources().getDrawable(R.drawable.cod_gun1); 
				
				//try {
					//InputStream is = getResources().getAssets().open("cod_gun2.png");
					//is=this.getResources().openRawResource(R.raw.myDrawable);
				//} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
			}
			public void onNothingSelected(AdapterView<?> arg0) {
				//do nothing
			}
		});

		prSpinnerEncodingFormat = (Spinner) findViewById(R.id.dialog_settings_encoding_format_spinner);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.dialog_settings_encoding_format_array, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		prSpinnerEncodingFormat.setAdapter(adapter2);	
		prSpinnerEncodingFormat.setSelection(Utils.puEncodingFormat);
		prSpinnerEncodingFormat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int rowSelected = (int)arg3;
				Utils.puEncodingFormat = rowSelected;
			}
			public void onNothingSelected(AdapterView<?> arg0) {
				//do nothing
			}
		});
		
		prSpinnerConainterFormat = (Spinner) findViewById(R.id.dialog_settings_container_format_spinner);
		ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.dialog_settings_container_format_array, android.R.layout.simple_spinner_item);
		adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		prSpinnerConainterFormat.setAdapter(adapter3);	
		prSpinnerConainterFormat.setSelection(Utils.puContainerFormat);
		prSpinnerConainterFormat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int rowSelected = (int)arg3;
				Utils.puContainerFormat = rowSelected;
			}
			public void onNothingSelected(AdapterView<?> arg0) {
				//do nothing
			}
		});
		
		prSpinnerResolution = (Spinner) findViewById(R.id.dialog_settings_resolution_spinner);
		ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
                this, R.array.dialog_settings_resolution_array, android.R.layout.simple_spinner_item);
		adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		prSpinnerResolution.setAdapter(adapter4);	
		prSpinnerResolution.setSelection(Utils.puResolutionChoice);
		prSpinnerResolution.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				int rowSelected = (int)arg3;
				Utils.puResolutionChoice = rowSelected;
			}
			public void onNothingSelected(AdapterView<?> arg0) {
				//do nothing
			}
		});
		
		prBtnOk = (Button) findViewById(R.id.dialog_settings_btn1);
		prBtnOk.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//export picture to specified location with specified name
				setResult(RESULT_OK);
				finish();
			}
		});
		prBtnCancel = (Button) findViewById(R.id.dialog_settings_btn2);
		prBtnCancel.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View v) {
				//cancel export, just finish the activity
				SettingsDialog.this.finish();
			}
		});
		getWindow().setSoftInputMode(LayoutParams.SOFT_INPUT_STATE_HIDDEN);
	}
}

