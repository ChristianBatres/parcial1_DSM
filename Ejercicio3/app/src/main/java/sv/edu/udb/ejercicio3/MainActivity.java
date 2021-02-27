package sv.edu.udb.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText nombre1;
    private EditText cargo1;
    private EditText horas1;
    private EditText nombre2;
    private EditText cargo2;
    private EditText horas2;
    private EditText nombre3;
    private EditText cargo3;
    private EditText horas3;
    int h1=0;
    int h2=0;
    int h3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre1=(EditText)findViewById(R.id.txtNombre1);
        cargo1=(EditText)findViewById(R.id.txtCargo1);
        horas1=(EditText)findViewById(R.id.txtHoras1);

        nombre2=(EditText)findViewById(R.id.txtNombre2);
        cargo2=(EditText)findViewById(R.id.txtCargo2);
        horas2=(EditText)findViewById(R.id.txtHoras2);

        nombre3=(EditText)findViewById(R.id.txtNombre3);
        cargo3=(EditText)findViewById(R.id.txtCargo3);
        horas3=(EditText)findViewById(R.id.txtHoras3);
    }

    public void segundaActividad (View v) {
        String hora1=horas1.getText().toString();
        h1=Integer.valueOf(hora1);
        String hora2=horas2.getText().toString();
        h2=Integer.valueOf(hora2);
        String hora3=horas3.getText().toString();
        h3=Integer.valueOf(hora3);

        if(h1>0 && h2>0 && h3>0){
            Intent i = new Intent(this, segundaActivida.class);
            i.putExtra("txtnombre1", nombre1.getText().toString());
            i.putExtra("txtcargo1", cargo1.getText().toString());
            i.putExtra("txthoras1", horas1.getText().toString());

            i.putExtra("txtnombre2", nombre2.getText().toString());
            i.putExtra("txtcargo2", cargo2.getText().toString());
            i.putExtra("txthoras2", horas2.getText().toString());

            i.putExtra("txtnombre3", nombre3.getText().toString());
            i.putExtra("txtcargo3", cargo3.getText().toString());
            i.putExtra("txthoras3", horas3.getText().toString());
            startActivity(i);

        }
        else{
            Toast notificacion=Toast.makeText(this,"Debe ingresar valores positivos",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}