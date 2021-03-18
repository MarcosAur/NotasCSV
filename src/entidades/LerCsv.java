package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author default
 */
public class LerCsv {
    
    /*
    Pega o primeiro arquivo contendo as respostas certas da prova
    O caminho para o arquivo está denominado na variável path1
    */
    public static String[] receberP1(File path){

        String[] texto2 = new String[20];
         
        try(Scanner sc = new Scanner(path)){
            String t = sc.next();
            texto2 = t.split(",");

        }catch (IOException ex){
            System.out.println("Erro!!!");
        }
        return texto2;
    }
    /*
    Pega as respostas de todos os alunos e divide em uma matriz com vetores,
    sendo que a matriz (na vertical) contém os alunos os vetores (horizontal) 
    contém as respostas destes.
    */
    public static String[][] receberP2(File path){
        String texto[][] = new String[180][23];
        try(Scanner sc = new Scanner(path)){
            int i = 0;
            while(sc.hasNext()){
                texto[i] = sc.nextLine().split("\n");
                i ++;


            }

        }catch (FileNotFoundException f){
            System.out.println(f);
        }
        return texto;
    }
    
}
