/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;

/**
 *
 * @author willi_000
 */
public class ladrillos {
    public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("ladirllos.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,7, 1, Direction.NORTH,0);
           
            int c=recorrer(6,6,0);
            System.out.println(c);
            //devolver(6,6,--c);
            
                  
        }
        
        public static int recorrer(int c, int f, int count){
            count += adelante();
            if (estudiante.canPickThing())
                estudiante.pickThing();
            else if(!estudiante.frontIsClear()){
                if((count/c) % 2 == 0){
                    giro(1);
                    mover(1);
                    giro(1);
                }else{
                    giro(3);
                    mover(1);
                    giro(3);
                }
                count++;
                recorrer(c,f,count);
            }
            return count;
        }
        
        public static int adelante(){
            int count=0;
            while(estudiante.frontIsClear()&&(!estudiante.canPickThing())){
                estudiante.move();
                count++;
            }
            return count;
        }
        
        public static void devolver(int c,int f, int count){
            int p, div=count/c;
            if(div==0){
                giro(1);
                p=count + 1;
            }
            else if(div % 2 == 0){
                giro(1);
                p=(count%f) +1;
            }
            else{
                giro(3);
                p=f-(count%f);
            }
            System.out.println(count);
            System.out.println(c);
            System.out.println(div);
            mover(div);
            giro(1);
            mover(p);
             
           
        }
        public static void mover(int pasos){
            for (int i = 0; i < pasos; i++) 
                estudiante.move();
        }
        public static void giro(int giros){
            for (int i = 0; i < giros; i++) 
                estudiante.turnLeft();
        }
}