package com.example.user.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AkalBulusActivity extends AppCompatActivity {

	private EditText jawaban;
	private Button kisikisi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_akal_bulus);
		Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
		setSupportActionBar(toolbar); // Memasang Toolbar pada Aplikasi
		getSupportActionBar().setTitle("Fadil_Setiawan_D1042151056"); // Memasang Judul pada Toolbar
		kisikisi =(Button) findViewById(R.id.kisikisi);
		jawaban = (EditText)findViewById(R.id.editText1);
		jawaban.setFilters(new InputFilter[]{new InputFilter.AllCaps()});


		kisikisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Kode disini akan di eksekusi saat tombol about di klik
				Toast.makeText(getApplicationContext(), "AKAL BULUS", Toast.LENGTH_LONG).show();
			}
		});
	}

	public void cekjawaban(View v){
		String jawabanBenar = "AKAL BULUS";
		String jawabanUser = jawaban.getText().toString();
		if(jawabanUser.equals(jawabanBenar)){
			Toast.makeText(getApplicationContext(), "JAWABAN ANDA BENAR", Toast.LENGTH_LONG).show();
			Intent trans = new Intent(getApplicationContext(),JawabanBenarActivity.class);
			startActivity(trans);
			jawaban.setText("");
			finish();
			
			
		}else{
			Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH !", Toast.LENGTH_LONG).show();
			jawaban.setText("");
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Memanggil/Memasang menu item pada toolbar dari layout menu_bar.xml
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.akal_bulus, menu);
		return super.onCreateOptionsMenu(menu);
	}

	//Membuat event/kejadian saat salah satu item pada toolbar di klik
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.about :
				//Kode disini akan di eksekusi saat tombol about di klik
				Toast.makeText(this, " By: Fadil", Toast.LENGTH_SHORT).show();
				break;
			case R.id.keluar:
				System.exit(0);
				break;
			default:
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
