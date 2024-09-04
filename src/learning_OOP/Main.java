package learning_OOP;


import learning_OOP.MobilePhone.*;
import learning_OOP.Playlist.*;

import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaDeTarefas = new ArrayList<>();
        String sair = "";

        while(true){
            try {
                int input = 0;
                String tarefa = "";
                System.out.println(menu());
                System.out.println("Digite a opção para avançar: \n");
                input = sc.nextInt();
                sc.nextLine();

                switch(input){
                    case 1:
                        System.out.println("<<<Adicionar Tarefa>>>\n Qual é a tarefa:\n");
                        tarefa = sc.nextLine();
                        listaDeTarefas.add(tarefa);
                        break;
                    case 2:
                        System.out.println("<<<Remover Tarefa>>>\n");
                        String removerNome = sc.nextLine();
                        listaDeTarefas.remove(removerNome);
                        break;
                    case 3:
                        System.out.println("<<<Exibir Tarefas>>>\n Lista de tarefas:");
                        System.out.println(listaDeTarefas);

                        break;
                    case 4:
                        System.out.println("<<<Buscar Tarefa>>>\n");
                        String buscarTarefa = sc.nextLine();
                        for(String lista: listaDeTarefas){
                            if(lista.equals(buscarTarefa)){
                                System.out.println(lista);
                                break;
                            }else{
                                System.out.println("Valor não encontrado!");
                                break;
                            }

                        }
                        break;
                    case 5:
                        System.out.println("opção 5");
                        sair = "sair";
                        break;
                }
                if(sair == "sair"){
                    break;
                }


            }catch (Exception e){
                System.out.println("valor invalalido");
                sc.nextLine();
            }

        }


    }
    public static String menu(){
        return "1. Adicionar Tarefa\n" +
                "2. Remover Tarefa\n" +
                "3. Exibir Tarefas\n" +
                "4. Buscar Tarefa\n" +
                "5. Sair";
    }

}
