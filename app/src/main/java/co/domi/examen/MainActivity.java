package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button registrarButton;
    TextView nombreView;
    ArrayList<String> numeros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarButton = findViewById(R.id.registrarButton);
        nombreView = findViewById(R.id.nombreView);
        nombreView.setText(" ");
        numeros = new ArrayList<String>();



        registrarButton.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this,RegistrarClass.class);
                    startActivity(i);
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences("savePerson",MODE_PRIVATE);
        String username = preferences.getString("registros","Nombres");
        String[] partes = username.split(":");
        int Riesgo = preferences.getInt("riesgoTotal",0);
        numeros.add(String.valueOf(Riesgo));

        Log.e("numeros",numeros.toString());
       // String total = preferences.getString("riesgoStringTotal","0");
       // String RiesgoPartes = total + ":" + Riesgo;
        //String[] RiesgoPartesTotales = RiesgoPartes.split(":");

        nombreView.append("" + partes[partes.length-1] + ":" + " " + Riesgo + "\n");

    }

    @Override
    protected void onStop() {
        super.onStop();
       // getSharedPreferences("savePerson", MODE_PRIVATE).edit().clear().apply();
    }
}