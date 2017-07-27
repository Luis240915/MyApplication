package curso.umg.gt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {
    private EditText et1;
    private RadioButton rb1, rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        et1=(EditText) findViewById(R.id.et1);
        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);

    }

    public void aceptar(View view){
        String value=et1.getText().toString();
        Toast.makeText(this, "Agregado con Exito", Toast.LENGTH_SHORT).show();
    }


}
