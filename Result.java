package Estimacion_Perdida;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private static final int NEQUIPOS= 3;
    
    public static void main(String[] args) {


        int equipo[][]= new int[Result.NEQUIPOS][3];
        
        for (int i = 0; i < Result.NEQUIPOS; i++) {
                equipo[i][0]= 3;
                equipo[i][1]= 16;
                equipo[i][2]= 8;
        }   

        List<List<Integer>> listEquipos= new ArrayList<>();

        for (int i = 0; i < Result.NEQUIPOS; i++) {
            listEquipos.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < Result.NEQUIPOS; i++) {
            for (int j = 0; j < 3; j++) {
                listEquipos.get(i).add(equipo[i][j]);
            }
        }
 
        System.out.println("Número Maximo de horas = " + Result.maximoNumeroHoras(listEquipos).get(0)); 
        System.out.println("Promedio de horas = " + Result.maximoNumeroHoras(listEquipos).get(1));
        System.out.println("Tarea(1), horas = " + Result.maximoNumeroHoras(listEquipos).get(2));  
        System.out.println("Tarea(2), horas = " + Result.maximoNumeroHoras(listEquipos).get(3));
        System.out.println("Tarea(3), horas = " + Result.maximoNumeroHoras(listEquipos).get(4));  

    }

    public static List<Integer> maximoNumeroHoras(List<List<Integer>> equipo){
    // Write your code here

        int nMhoras= 0;
        List<Integer> mNhoras= new ArrayList<>();

        for (int i = 0; i < Result.NEQUIPOS; i++) {
        
            nMhoras += equipo.get(i).get(1);
            
        }
        mNhoras.add(nMhoras); //Total horas 
        mNhoras.add(equipo.get(0).get(1));//Promedio horas
        mNhoras.add(equipo.get(0).get(2));//Tarea (1) mas pequeña, horas
        mNhoras.add(equipo.get(0).get(1) - equipo.get(0).get(2));//Tarea (2), horas
        mNhoras.add(nMhoras - (equipo.get(0).get(2)+(equipo.get(0).get(1)-equipo.get(0).get(2))));//Tarea (3) mas grande, horas


    return mNhoras;
    }
    
}
