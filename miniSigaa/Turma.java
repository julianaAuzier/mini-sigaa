/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msiga;

import java.io.Serializable;
import java.util.ArrayList;

public class Turma implements Serializable{
    
    private ArrayList<Aluno> alunos;

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

   

   
    
    
}
