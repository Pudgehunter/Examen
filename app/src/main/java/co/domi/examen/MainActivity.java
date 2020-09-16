package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button registrarButton;
    TextView nombreView, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarButton = findViewById(R.id.registrarButton);
        nombreView = findViewById(R.id.nombreView);


        registrarButton.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this,RegistrarClass.class);
                    startActivity(i);
                }
        );
    }
}