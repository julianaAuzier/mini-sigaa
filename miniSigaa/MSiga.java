/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msiga;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author rabelo
 */
public class MSiga {

    public static void main(String[] args) {
        
        Aluno a1;
        ArrayList<Aluno> alunos = new ArrayList<>();
        Turma turma = new Turma();

        String c;
        System.out.println(" Bem-vindo ao sistema Teste de Arquivos");
        System.out.println(" Vamos inserir alunos em uma turma.");
        do {
            a1 = new Aluno();
            System.out.println(" Informe o nome do aluno: ");
            Scanner leitor = new Scanner(System.in);
            a1.setNome(leitor.nextLine());
            System.out.println(" Informe a matrícula do aluno: ");
            a1.setMatricula(leitor.next());
            alunos.add(a1);
            
            System.out.println("Inserir mais um aluno na turma? y  = sim");
            
            c = leitor.next();
        }
        while (c.equalsIgnoreCase("y"));
  
        // adicionar o aluno na turma!        
        turma.setAlunos(alunos);
        //MSiga.listarTurma(alunos);
        MSiga.listarTurma(turma.getAlunos());
        //listar alunos da turma
        cArquivos.salvar(turma, "E:\\My Dropbox\\temp\\minisiga\\turma.sav");
        System.out.println("+++ ARQUIVO SALVO +++");
        
        turma = (Turma) cArquivos.restaurar("E:\\My Dropbox\\temp\\minisiga\\turma.sav");
        System.out.println("+++ ARQUIVO restaurado +++");
        MSiga.listarTurma(turma.getAlunos());
               
    }
    
    public static void listarTurma(ArrayList<Aluno> alunos){
         for(Aluno a: alunos){
            System.out.print("Nome: " + a.getNome());
            System.out.println(" -  Matricula: " + a.getMatricula());
         }
    }

}
