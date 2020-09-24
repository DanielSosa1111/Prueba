package com.example.prueba.ui.login;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.prueba.MenuNavegable;

public class LoginActivityViewModel extends AndroidViewModel {

    private MutableLiveData<String>btIngresar; //objeto observador lectura y escritura
    private Context context;

    public LoginActivityViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<String>getBtIngresar(){

        if(btIngresar==null){
            btIngresar=new MutableLiveData<>();
        }
        return btIngresar;
    }

    public void ingresar(String correo, String pass){


        if(correo.equals("dani") && pass.equals("1234")){
           btIngresar.setValue("Entrando");
           Intent i = new Intent(context, MenuNavegable.class);
           context.startActivity(i);
        }else{
            btIngresar.setValue("completar campos");
        }

    }


}
