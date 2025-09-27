package project2pars;
import java.util.Scanner;
/*
@author Omar
 */

public class Project2pars {
    //se crean los datos
static int datoint = 0;
static boolean end, verif;
static String datostring;
static Scanner entrada = new Scanner (System.in);   

    public static void main(String[] args) {
        //inicio y llenado de datos
        System.out.println("_______Bienvenido a la Veterinaria CAMPO DE GIRASOLES_______ "+"\nIngrese primero los datos de apertura:"+"\n"+"\n"+"\n");
        
        //se detiene el programa hasta el final, cuando cambie el valor de END
        while (end) {
                while(verif){
                        //se crea bodega y comida
                     Comida objComida = new Comida();
                     Bodega objBodega = new Bodega();
                     Medicina objMedi = new Medicina();
                     //se guarda el valor y se le asigna a l set Concentrado perteneciente de Comida
                     System.out.println("Cuanto concentrado general se tiene? -en libras-\n");
                  datoint = entrada.nextInt();
                    objComida.setConcentrado(datoint); 

                    System.out.println("Cuanta comida pedecedera general se tiene? -en libras-\n");
                    datoint = entrada.nextInt();
                    objComida.setComVolt(datoint);

                    System.out.println("Escriba el nombre de las vitaminas generales  que se tienen");
                    datostring = entrada.nextLine();
                    objComida.setVitvar(datostring);

                    System.out.println("Escriba la fecha de hoy:  0/0/0 ");
                    datostring = entrada.nextLine();
                    objComida.setFechareg(datostring);

                    System.out.println("Ha ingresado correctamente los datos?  "+objComida.getConcentrado()+" ,"+objComida.getComVolt()+" ,"+objComida.getVitvar()+" ,"+objComida.getFechareg());
                    System.out.println("Y/N");
                    datostring = entrada.nextLine();
                    if (datostring == "Y"){
                    System.out.println("Gracias por confirmar ");
                    verif = false;
                    }
                    else{
                            System.out.println("Por favor repetir el ingreso y ingresar ocrrectamente los datos");
                            }
                    System.out.println("Ahora debera ingresar los medicamentos generales:  "+"/n que antibióticos tenemos en existencia? ");
                    datostring = entrada.nextLine();
                    objMedi.set
                    
                    
                    

                }
        }
    }
}

