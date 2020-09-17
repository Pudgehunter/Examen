package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button registrarButton;
    TextView nombreView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarButton = findViewById(R.id.registrarButton);
        nombreView = findViewById(R.id.nombreView);
        nombreView.setText(" ");



        registrarButton.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this,RegistrarClass.class);
                    startActivity(i);
                    finish();
                }
        );
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences("savePerson",MODE_PRIVATE);
        String username = preferences.getString("registros","Yoshiki Tsutsui Michida");
        String[] partes = username.split(":");
        int Riesgo = preferences.getInt("riesgoTotal",0);
       // String total = preferences.getString("riesgoStringTotal","0");
       // String RiesgoPartes = total + ":" + Riesgo;
        //String[] RiesgoPartesTotales = RiesgoPartes.split(":");
        for(int i = 0; i < partes.length; i++) {
            nombreView.append("" + partes[i] + ":" + " " + Riesgo + "\n");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        getSharedPreferences("savePerson", MODE_PRIVATE).edit().clear().apply();
    }
}