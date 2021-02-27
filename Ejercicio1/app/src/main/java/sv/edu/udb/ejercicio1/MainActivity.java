package sv.edu.udb.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText a;
    private EditText b;
    private EditText c;
    double a1=0;
    double b1=0;
    double c1=0;
    double x1=0;
    double x2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.txtA);
        b=(EditText)findViewById(R.id.txtB);
        c=(EditText)findViewById(R.id.txtC);
    }

    public void calculo (View v){
        String aa=a.getText().toString();
        String bb=b.getText().toString();
        String cc=c.getText().toString();
        a1=Double.valueOf(aa);
        b1=Double.valueOf(bb);
        c1=Double.valueOf(cc);
        x1=((-1)*b1+Math.sqrt(Math.pow(b1,2)-4*(a1)*(c1)))/(2*a1);
        x2=((-1)*b1-Math.sqrt(Math.pow(b1,2)-4*(a1)*(c1)))/(2*a1);
        Toast notificacion=Toast.makeText(this,"Solucion  X1: "+x1+", Solucion X2: "+x2,Toast.LENGTH_LONG);
        notificacion.show();

    }
}