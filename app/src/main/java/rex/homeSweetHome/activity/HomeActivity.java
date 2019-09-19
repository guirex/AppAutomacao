package rex.homeSweetHome.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import rex.homeSweetHome.R;
import rex.homeSweetHome.model.Banheiro;
import rex.homeSweetHome.model.Corredor;
import rex.homeSweetHome.model.Cozinha;
import rex.homeSweetHome.model.Quarto1;
import rex.homeSweetHome.model.Quarto2;
import rex.homeSweetHome.model.Quarto3;
import rex.homeSweetHome.model.Sala;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final String TAG = "Home";


        final Switch swSala, swCozinha, swCorredor, swBanheiro, swlQuarto1, swlQuarto2, swlQuarto3, swaQuarto1, swaQuarto2, swaQuarto3;
        swSala = findViewById(R.id.lamp_sala);
        swCozinha = findViewById(R.id.lamp_cozinha);
        swCorredor = findViewById(R.id.lamp_corredor);
        swBanheiro = findViewById(R.id.lamp_banheiro);
        swlQuarto1 = findViewById(R.id.lamp_quarto1);
        swlQuarto2 = findViewById(R.id.lamp_quarto2);
        swlQuarto3 = findViewById(R.id.lamp_quarto3);
        swaQuarto1 = findViewById(R.id.ar_quarto1);
        swaQuarto2 = findViewById(R.id.ar_quarto2);
        swaQuarto3 = findViewById(R.id.ar_quarto3);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRefS = database.getReference("Casa 3/Sala/");
        // ----------------------    Sala
        myRefS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Sala sala = dataSnapshot.getValue(Sala.class);

                if(sala.getLampada1()){
                    Log.d(TAG,"Sala" + sala);
                    swSala.setChecked(true);
                }else{
                    swSala.setChecked(false);
                    Log.d(TAG,"Sala" + sala);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swSala.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefS.child("Lampada1").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada da Sala Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefS.child("Lampada1").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada da Sala Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // ----------------------    Cozinha
        final DatabaseReference myRefC = database.getReference("Casa 3/Cozinha/");
        myRefC.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Cozinha cozinha = dataSnapshot.getValue(Cozinha.class);

                if(cozinha.getLampada2()){
                    swCozinha.setChecked(true);
                    Log.d(TAG,"Cozinha" + cozinha);
                }else{
                    swCozinha.setChecked(false);
                    Log.d(TAG,"Cozinha" + cozinha);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swCozinha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefC.child("Lampada2").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada da Cozinha Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefC.child("Lampada2").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada da Cozinha Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // ----------------------    Corredor
        final DatabaseReference myRefCo = database.getReference("Casa 3/Corredor/");
        myRefCo.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Corredor corredor = dataSnapshot.getValue(Corredor.class);

                if(corredor.getLampada3()){
                    swCorredor.setChecked(true);
                    Log.d(TAG,"Corredor" + corredor);
                }else{
                    swCorredor.setChecked(false);
                    Log.d(TAG,"Corredor" + corredor);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swCorredor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefCo.child("Lampada3").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Corredor Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefCo.child("Lampada3").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Corredor Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // ----------------------    Banheiro
        final DatabaseReference myRefB = database.getReference("Casa 3/Banheiro/");
        myRefB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Banheiro banheiro = dataSnapshot.getValue(Banheiro.class);

                if(banheiro.getLampada4()){
                    swBanheiro.setChecked(true);
                    Log.d(TAG,"Banheiro" + banheiro);
                }else{
                    swBanheiro.setChecked(false);
                    Log.d(TAG,"Banheiro" + banheiro);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swBanheiro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefB.child("Lampada4").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Banheiro Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefB.child("Lampada4").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Banheiro Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // ----------------------    Quarto 1
        final DatabaseReference myRefQ1 = database.getReference("Casa 3/Quarto1/");
        myRefQ1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto1 q1 = dataSnapshot.getValue(Quarto1.class);

                if(q1.getLampada5()){
                    swlQuarto1.setChecked(true);
                    Log.d(TAG,"Quarto1" + q1);
                }else{
                    swlQuarto1.setChecked(false);
                    Log.d(TAG,"Quarto1" + q1);
                }

                if(q1.getAr1()){
                    swaQuarto1.setChecked(true);
                }
                else{
                    swaQuarto1.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swlQuarto1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ1.child("Lampada5").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto 1 Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ1.child("Lampada5").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto 1 Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        swaQuarto1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ1.child("Ar1").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto1 Ligado"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ1.child("Ar1").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto1 Desligado"), Toast.LENGTH_SHORT).show();
                }
            }
        });



        // ----------------------    Quarto 2
        final DatabaseReference myRefQ2 = database.getReference("Casa 3/Quarto2/");
        myRefQ2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto2 q2 = dataSnapshot.getValue(Quarto2.class);

                if(q2.getLampada6()){
                    swlQuarto2.setChecked(true);
                    Log.d(TAG,"Quarto2" + q2);
                }else{
                    swlQuarto2.setChecked(false);
                    Log.d(TAG,"Quarto2" + q2);
                }

                if(q2.getAr2()){
                    swaQuarto2.setChecked(true);
                }
                else{
                    swaQuarto2.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swlQuarto2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ2.child("Lampada6").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto 1 Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ2.child("Lampada6").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto 1 Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        swaQuarto2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ2.child("Ar2").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto1 Ligado"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ2.child("Ar2").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto1 Desligado"), Toast.LENGTH_SHORT).show();
                }
            }
        });



        // ----------------------    Quarto 3
        final DatabaseReference myRefQ3 = database.getReference("Casa 3/Quarto3/");
        myRefQ3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Quarto3 q3 = dataSnapshot.getValue(Quarto3.class);

                if(q3.getLampada7()){
                    swlQuarto3.setChecked(true);
                    Log.d(TAG,"Quarto3" + q3);
                }else{
                    swlQuarto3.setChecked(false);
                    Log.d(TAG,"Quarto3" + q3);
                }

                if(q3.getAr3()){
                    swaQuarto3.setChecked(true);
                }
                else{
                    swaQuarto3.setChecked(false);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        swlQuarto3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ3.child("Lampada7").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto3 Acessa"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ3.child("Lampada7").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Lâmpada do Quarto3 Apagada"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        swaQuarto3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    myRefQ3.child("Ar3").setValue(true);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto3 Ligado"), Toast.LENGTH_SHORT).show();
                }
                else{
                    myRefQ3.child("Ar3").setValue(false);
                    Toast.makeText(HomeActivity.this, ("Ar-Condicionado do Quarto3 Desligado"), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
