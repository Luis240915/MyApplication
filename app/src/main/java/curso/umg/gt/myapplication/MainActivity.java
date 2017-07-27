package curso.umg.gt.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
    }


    public void login(View view) {

        String user = et1.getText().toString();
        String pass = et2.getText().toString();

        if (user.endsWith("gt") && pass.equals("123")) {

            Intent i = new Intent(this, TeacherActivity.class);
            startActivity(i);
        } else
        if (user.endsWith("st") && pass.equals("456")) {

            Intent i = new Intent(this, StudentActivity.class);
            startActivity(i);
        } else {
            Toast notification = Toast.makeText(this, "Credenciales invalidas ", Toast.LENGTH_SHORT);
            notification.show();
        }
    }
}
