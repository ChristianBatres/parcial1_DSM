package sv.edu.udb.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class segundaActivida extends AppCompatActivity {
    private TextView tvNombre1;
    private TextView tvSalarioL1;
    private TextView tvAfp1;
    private TextView tvIsss1;
    private TextView tvRenta1;
    private TextView tvBono1;

    private TextView tvNombre2;
    private TextView tvSalarioL2;
    private TextView tvAfp2;
    private TextView tvIsss2;
    private TextView tvRenta2;
    private TextView tvBono2;

    private TextView tvNombre3;
    private TextView tvSalarioL3;
    private TextView tvAfp3;
    private TextView tvIsss3;
    private TextView tvRenta3;
    private TextView tvBono3;

    private TextView tvMa;
    private TextView tvMe;
    private TextView tvG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_activida);

        Bundle bundle = getIntent().getExtras();
        String nombre1=bundle.getString("txtnombre1");
        tvNombre1=(TextView)findViewById(R.id.txtnombre1);
        tvNombre1.setText(nombre1);

        String nombre2=bundle.getString("txtnombre2");
        tvNombre2=(TextView)findViewById(R.id.txtnombre2);
        tvNombre2.setText(nombre2);

        String nombre3=bundle.getString("txtnombre3");
        tvNombre3=(TextView)findViewById(R.id.txtnombre3);
        tvNombre3.setText(nombre3);

        double h1=Double.parseDouble( bundle.getString("txthoras1"));
        double h2=Double.parseDouble( bundle.getString("txthoras2"));
        double h3=Double.parseDouble( bundle.getString("txthoras3"));
        double salario1=0;
        double isss1=0;
        double afp1=0;
        double renta1=0;
        double salarioL1=0;
        double bono1=0;

        double salario2=0;
        double isss2=0;
        double afp2=0;
        double renta2=0;
        double salarioL2=0;
        double bono2=0;

        double salario3=0;
        double isss3=0;
        double afp3=0;
        double renta3=0;
        double salarioL3=0;
        double bono3=0;

        int g=0;

        //empleado1
        if (h1<=160){
            salario1=Math.round(h1*9.75);
            isss1=Math.round(salario1*0.0525);
            afp1=Math.round(salario1*0.0688);
            renta1=Math.round(salario1*0.1);
            salarioL1=Math.round(salario1-isss1-afp1-renta1);

            tvSalarioL1=(TextView)findViewById(R.id.txtSueldol1);
            tvAfp1=(TextView)findViewById(R.id.txtAfp1);
            tvIsss1=(TextView)findViewById(R.id.txtIsss1);
            tvRenta1=(TextView)findViewById(R.id.txtRenta1);



            tvSalarioL1.setText(String.valueOf(salarioL1));
            tvIsss1.setText(String.valueOf(isss1));
            tvAfp1.setText(String.valueOf(afp1));
            tvRenta1.setText(String.valueOf(renta1));

        }
        else{
            salario1=Math.round((160*9.775)+((h1-160)*11.5));
            isss1=Math.round(salario1*0.0525);
            afp1=Math.round(salario1*0.0688);
            renta1=Math.round(salario1*0.1);
            salarioL1=Math.round(salario1-isss1-afp1-renta1);

            tvSalarioL1=(TextView)findViewById(R.id.txtSueldol1);
            tvAfp1=(TextView)findViewById(R.id.txtAfp1);
            tvIsss1=(TextView)findViewById(R.id.txtIsss1);
            tvRenta1=(TextView)findViewById(R.id.txtRenta1);



            tvSalarioL1.setText(String.valueOf(salarioL1));
            tvIsss1.setText(String.valueOf(isss1));
            tvAfp1.setText(String.valueOf(afp1));
            tvRenta1.setText(String.valueOf(renta1));
        }
        //empleado2
        if (h2<=160){
            salario2=Math.round(h2*9.75);
            isss2=Math.round(salario2*0.0525);
            afp2=Math.round(salario2*0.0688);
            renta2=Math.round(salario2*0.1);
            salarioL2=Math.round(salario2-isss2-afp2-renta2);

            tvSalarioL2=(TextView)findViewById(R.id.txtSueldoL2);
            tvAfp2=(TextView)findViewById(R.id.txtAfp2);
            tvIsss2=(TextView)findViewById(R.id.txtIsss2);
            tvRenta2=(TextView)findViewById(R.id.txtRenta2);



            tvSalarioL2.setText(String.valueOf(salarioL2));
            tvIsss2.setText(String.valueOf(isss2));
            tvAfp2.setText(String.valueOf(afp2));
            tvRenta2.setText(String.valueOf(renta2));

        }
        else{
            salario2=Math.round((160*9.775)+((h2-160)*11.5));
            isss2=Math.round(salario2*0.0525);
            afp2=Math.round(salario2*0.0688);
            renta2=Math.round(salario2*0.1);
            salarioL2=Math.round(salario2-isss2-afp2-renta2);

            tvSalarioL2=(TextView)findViewById(R.id.txtSueldoL2);
            tvAfp2=(TextView)findViewById(R.id.txtAfp2);
            tvIsss2=(TextView)findViewById(R.id.txtIsss2);
            tvRenta2=(TextView)findViewById(R.id.txtRenta2);



            tvSalarioL2.setText(String.valueOf(salarioL2));
            tvIsss2.setText(String.valueOf(isss2));
            tvAfp2.setText(String.valueOf(afp2));
            tvRenta2.setText(String.valueOf(renta2));
        }

        //empleado2
        if (h3<=160){
            salario3=Math.round(h3*9.75);
            isss3=Math.round(salario3*0.0525);
            afp3=Math.round(salario3*0.0688);
            renta3=Math.round(salario3*0.1);
            salarioL3=Math.round(salario3-isss3-afp3-renta3);

            tvSalarioL3=(TextView)findViewById(R.id.txtSueldoL3);
            tvAfp3=(TextView)findViewById(R.id.txtAfp3);
            tvIsss3=(TextView)findViewById(R.id.txtIsss3);
            tvRenta3=(TextView)findViewById(R.id.txtRenta3);



            tvSalarioL3.setText(String.valueOf(salarioL3));
            tvIsss3.setText(String.valueOf(isss3));
            tvAfp3.setText(String.valueOf(afp3));
            tvRenta3.setText(String.valueOf(renta3));

        }
        else{
            salario3=Math.round((160*9.775)+((h3-160)*11.5));
            isss3=Math.round(salario3*0.0525);
            afp3=Math.round(salario3*0.0688);
            renta3=Math.round(salario3*0.1);
            salarioL3=Math.round(salario3-isss3-afp3-renta3);

            tvSalarioL3=(TextView)findViewById(R.id.txtSueldoL3);
            tvAfp3=(TextView)findViewById(R.id.txtAfp3);
            tvIsss3=(TextView)findViewById(R.id.txtIsss3);
            tvRenta3=(TextView)findViewById(R.id.txtRenta3);



            tvSalarioL3.setText(String.valueOf(salarioL3));
            tvIsss3.setText(String.valueOf(isss3));
            tvAfp3.setText(String.valueOf(afp3));
            tvRenta3.setText(String.valueOf(renta3));
        }



        String cargo1= bundle.getString("txtcargo1");
        if (cargo1.equals("Gerente")  || cargo1.equals("gerente")){
            bono1=Math.round(salarioL1*0.1);
            tvBono1=(TextView)findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else if (cargo1.equals("Asistente")  || cargo1.equals("asistente")){
            bono1=Math.round(salarioL1*0.05);
            tvBono1=(TextView)findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else if (cargo1.equals("Secretaria")  || cargo1.equals("secretaria")){
            bono1=Math.round(salarioL1*0.03);
            tvBono1=(TextView)findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }
        else{
            bono1=Math.round(salarioL1*0.02);
            tvBono1=(TextView)findViewById(R.id.txtBono1);
            tvBono1.setText(String.valueOf(bono1));
        }


        String cargo2= bundle.getString("txtcargo2");
        if (cargo2.equals("Gerente")  || cargo2.equals("gerente")){
            bono2=Math.round(salarioL2*0.1);
            tvBono2=(TextView)findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else if (cargo2.equals("Asistente")  || cargo2.equals("asistente")){
            bono2=Math.round(salarioL2*0.05);
            tvBono2=(TextView)findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else if (cargo2.equals("Secretaria")  || cargo2.equals("secretaria")){
            bono2=Math.round(salarioL2*0.03);
            tvBono2=(TextView)findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }
        else{
            bono2=Math.round(salarioL2*0.02);
            tvBono2=(TextView)findViewById(R.id.txtBono2);
            tvBono2.setText(String.valueOf(bono2));
        }

        String cargo3= bundle.getString("txtcargo3");
        if (cargo3.equals("Gerente")  || cargo3.equals("gerente")){
            bono3=Math.round(salarioL3*0.1);
            tvBono3=(TextView)findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else if (cargo3.equals("Asistente")  || cargo3.equals("asistente")){
            bono3=Math.round(salarioL3*0.05);
            tvBono3=(TextView)findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else if (cargo3.equals("Secretaria")  || cargo3.equals("secretaria")){
            bono3=Math.round(salarioL3*0.03);
            tvBono3=(TextView)findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }
        else{
            bono3=Math.round(salarioL3*0.02);
            tvBono3=(TextView)findViewById(R.id.txtBono3);
            tvBono3.setText(String.valueOf(bono3));
        }

        if(cargo1.equals("Gerente") && cargo2.equals("Asistente") && cargo3.equals("Secretaria")){
            tvBono1=(TextView)findViewById(R.id.txtBono1);

            tvBono1.setText("No hay bono");
            tvBono2=(TextView)findViewById(R.id.txtBono2);

            tvBono2.setText("No hay bono");
            tvBono3=(TextView)findViewById(R.id.txtBono3);

            tvBono3.setText("No hay bono");
        }
//mayor
        if(salarioL1>salarioL2){
            if (salarioL1>salarioL3){
                tvMa=(TextView)findViewById(R.id.txtMa);
                 tvMa.setText(nombre1);
            }
        }
        if(salarioL2>salarioL1){
            if (salarioL2>salarioL3){
                tvMa=(TextView)findViewById(R.id.txtMa);
                tvMa.setText(nombre2);
            }
        }
        if(salarioL3>salarioL2){
            if (salarioL3>salarioL1){
                tvMa=(TextView)findViewById(R.id.txtMa);
                tvMa.setText(nombre3);
            }
        }
//menor
        if(salarioL1<salarioL2){
            if (salarioL1<salarioL3){
                tvMe=(TextView)findViewById(R.id.txtMenor);
                tvMe.setText(nombre1);
            }
        }
        if(salarioL2<salarioL1){
            if (salarioL2<salarioL3){
                tvMe=(TextView)findViewById(R.id.txtMenor);
                tvMe.setText(nombre2);
            }
        }
        if(salarioL3<salarioL2){
            if (salarioL3<salarioL1){
                tvMe=(TextView)findViewById(R.id.txtMenor);
                tvMe.setText(nombre3);
            }
        }
        //salarios mayores a $300
        if (salarioL1>300){
            g++;
        }
        if (salarioL2>300){
            g++;
        }
        if (salarioL3>300){
            g++;
        }
        tvG=(TextView)findViewById(R.id.txtG);
        tvG.setText(String.valueOf(g));

    }

    public void finalizar(View v) {

        finish();
    }
}