package com.ffranca.agenda;

import android.app.Application;

import com.ffranca.agenda.dao.AlunoDAO;
import com.ffranca.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaUsuarioTeste();
    }

    private void criaUsuarioTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Sara", "(79) 9 8800-6532", "sara@gmail.com"));
        dao.salva(new Aluno("Jorge", "(79) 9 8800-5578", "jorge@gmail.com"));
    }
}
