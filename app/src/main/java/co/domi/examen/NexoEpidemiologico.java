package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NexoEpidemiologico extends AppCompatActivity {

    Button continuar2;
    TextView ejemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo_epidemiologico);

        continuar2 = findViewById(R.id.continuar2);
        ejemplo = findViewById(R.id.ejemplo);

        String pn = getIntent().getExtras().getString("pn");
        ejemplo.setText(pn);

        continuar2.setOnClickListener(
                (v) -> {
                    Intent o = new Intent(this,SintomasClass.class);
                    startActivity(o);
                }
        );
    }
}