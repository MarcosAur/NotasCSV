/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author default
 */
public class Calculo {
    
    public static void calcular(String[] certas, String[][] alunos,String arquivo){
        int i = 0;
        String nome;
        String data;
        String turma;
        String a_final = "Aluno,Turma,Nota,Data de Envio";
        for (String[] r: alunos){
            for (String d: r){
                if((d != null) && (i > 0)){
                    String[] rc = d.split(",");
                    nome = rc[1];
                    data = rc[0];
                    turma = rc[2];
                    int g = 0;
                    double pontos = 0;
                    while(g < certas.length){
                        if (certas[g].equals(rc[g+3])){
                            pontos++;
                            g++;
                        }else{
                            g++;
                        }
                    }
                a_final += "\n"+nome+","+turma+","+pontos+","+ data;    
                }else{
                    i++;
                }

            }
        }
     CriarArquivo.cria(arquivo, a_final);
    }
}
