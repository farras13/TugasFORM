package id.sch.smktelkom_mlg.tugas01.xirpl6027.tugasform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etNis;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextnama);
        etNis = (EditText) findViewById(R.id.editTextNis);
        bKirim = (Button) findViewById(R.id.buttonKirim);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
