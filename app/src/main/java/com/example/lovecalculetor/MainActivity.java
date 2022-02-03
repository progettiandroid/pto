package com.example.lovecalculetor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mRisultato;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




      init();
}
      private void init() {

        mRisultato = (TextView)findViewById(R.id.itrisultato);
    }

    public void calcola(View view) {

        Log.d("calcola","click");

        Random rand = new Random();
        int lovemeter = rand.nextInt( 100);

        mRisultato.setText(Integer.toString(lovemeter));

        if(lovemeter >= 80){
            Toast.makeText(getApplicationContext(), "accoppiata vincente",Toast.LENGTH_LONG).show();
        }else if(lovemeter > 50){
            Toast.makeText(getApplicationContext(),  "forse c'è speranza",Toast.LENGTH_LONG).show();

        }if (lovemeter<80){
        Toast.makeText(getApplicationContext(),  "forse c'è speranza",Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(getApplicationContext(),"non c'è speranza",Toast.LENGTH_LONG).show();

        }
}
}

