package co.domi.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistrarClass extends AppCompatActivity {

    Button continuar;
    EditText editPersonName;
    EditText editId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_class);

        continuar = findViewById(R.id.continuar);
        editPersonName = findViewById(R.id.editPersonName);
        editId = findViewById(R.id.editId);


        continuar.setOnClickListener(
                (v) -> {
                    Intent a = new Intent(this,NexoEpidemiologico.class);
                    String pn = editPersonName.getText().toString();
                    String pi = editId.getText().toString();
                    a.putExtra("pn",pn);
                    a.putExtra("pi",pi);
                    startActivity(a);
                }
        );




    }
}