/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class ej2 {
    public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
        objetos = new City("ladirllos.txt");
	objetos.showThingCounts(true);
            
        //Direction.NORTH, EAST, SOUTH, WEST
        //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
        estudiante = new Robot(objetos,7, 1, Direction.NORTH,0);
        
        int x=100,y=100;
        int mat[][]= new int[1000][];
        
        }
        
}
