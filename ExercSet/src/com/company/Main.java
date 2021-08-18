package com.company;

import entidades.Entradalog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("entre com o caminho do arquivo");
        String path=sc.nextLine();

        try(BufferedReader br=new BufferedReader(new FileReader(path))){

            Set<Entradalog>set=new HashSet<>();

            String line= br.readLine();
            line= br.readLine();
           while (line!=null){
               String[]vect=line.split(" ");
               String nome=vect[0];
               Date date=Date.from(Instant.parse(vect[1]));

               set.add(new Entradalog(nome,date));
               line= br.readLine();
           }
           System.out.println("Total de usuarios:"+set.size());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
