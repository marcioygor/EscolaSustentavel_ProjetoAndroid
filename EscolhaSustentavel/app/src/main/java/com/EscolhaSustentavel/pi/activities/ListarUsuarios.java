package com.EscolhaSustentavel.pi.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;

import com.EscolhaSustentavel.pi.R;
import com.EscolhaSustentavel.pi.adapters.MenuPrincipal;
import com.EscolhaSustentavel.pi.model.Usuario;
import com.EscolhaSustentavel.pi.sql.DatabaseHelper;

import java.util.List;



public class ListarUsuarios extends AppCompatActivity {

    private AppCompatActivity activity = ListarUsuarios.this;
    private AppCompatTextView textViewName;
    private RecyclerView recyclerViewUsers;
    private List<Usuario> listUsuarios;
    private MenuPrincipal menuPrincipal;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_usuarios);
//        getSupportActionBar().setTitle("");

    }


}
