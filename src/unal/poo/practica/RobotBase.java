package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            //primera secuencia
            /*giro(2);
            mover(1);
            for (int i=0; i<3;i++){
                giro(3);
                mover(3);
            }
            giro (3);
            mover(2);
            giro(2);*/
            
            //segunda secuencia
            for (int i=0;i<3;i++){
            while(!estudiante.frontIsClear()){
                estudiante.turnLeft();
            }
            mover(1);
            }
            if(estudiante.canPickThing())
                estudiante.pickThing();
            giro(2);
            mover(1);
            for(int j =0;j<2;j++){
                giro(3);
                mover(1);
            }
            giro(3);
            estudiante.putThing();
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            
            /*estudiante.move ();
            
            
            //Girar a la izquierda
            
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();
            
            //Invocando una funcion
            //creacionFuncion(4);
            
            //Toman un Thing
            estudiante.pickThing();*/
                    
            
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

