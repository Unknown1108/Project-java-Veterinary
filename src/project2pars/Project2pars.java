package project2pars;
import java.util.Scanner;
/*
@author Omar
 */

public class Project2pars {
    //se crean los datos
static int datoint = 0;
static boolean end, verif = false;
static String datostring;
static Scanner entrada = new Scanner (System.in);   


    public static void main(String[] args) {
        //inicio y llenado de datos
        System.out.println("_______Bienvenido a la Veterinaria CAMPO DE GIRASOLES_______ "+"\nIngrese primero los datos de apertura:"+"\n"+"\n"+"\n");
        
        try {
            Thread.sleep(1500); // pausa 3000 milisegundos = 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //se detiene el programa hasta el final, cuando cambie el valor de END
                    Comida objComida = new Comida();
                    Bodega objBodega = new Bodega();
                    Medicina objMedi = new Medicina();
                    Accesorios objAccs= new Accesorios();
                    
        while (end == false) {
               while(verif == false){
                        //se crea bodega y comida
                     
                     //se guarda el valor y se le asigna a l set Concentrado perteneciente de Comida
                     System.out.println("Cuanto concentrado general se tiene? -en libras-\n");
                  datoint = entrada.nextInt();
                    objComida.setConcentrado(datoint); 

                    System.out.println("Cuanta comida pedecedera general se tiene? -en libras-\n");
                    datoint = entrada.nextInt();
                    objComida.setComVolt(datoint);
                    
                    
entrada.nextLine();

                    System.out.println("Escriba el nombre de las vitaminas generales  que se tienen");
                    datostring = entrada.nextLine();
                    objComida.setVitvar(datostring);
                    System.out.println("Escriba la fecha de hoy:  0/0/0 ");
                    datostring = entrada.nextLine();
                    objComida.setFechareg(datostring);

                    System.out.println("Ha ingresado correctamente los datos?  "+objComida.getConcentrado()+" ,"+objComida.getComVolt()+" ,"+objComida.getVitvar()+" ,"+objComida.getFechareg());
                    System.out.println("Y/N");
                    datostring = entrada.nextLine();
                    if (datostring.equalsIgnoreCase("Y")){
                    System.out.println("Gracias por confirmar ");
                    verif = true;
                    }
                    else{
                            System.out.println("Por favor repetir el ingreso y ingresar ocrrectamente los datos");
                            }
                }
                
                verif = false;
                
                
entrada.nextLine();
                
                while(verif == false){
                     System.out.println("Ahora debera ingresar los medicamentos generales:  "+"\n Que antinflamatorios tenemos en existencia? ");
                    datostring = entrada.nextLine();
                    objMedi.setAntiinflamatorios(datostring);
                    
                    System.out.println("Que medicamentos complejos generales se encuentran en existencia? ");
                    datostring = entrada.nextLine();
                    objMedi.setComplejos(datostring);
                    
                    System.out.println("Que antibioticos tenemos en existencia? ");
                    datostring = entrada.nextLine();
                    objMedi.setAntibioticos(datostring);
                    
                    System.out.println("Que cicatrizantes de encuentran en existencia? ");
                    datostring = entrada.nextLine();
                    objMedi.setCicatrizantes(datostring);
                    
                    
entrada.nextLine();
                    
                    System.out.println("Cuanta anestecia tenemos en existencia? -en litros- ");
                    datoint = entrada.nextInt();
                    objMedi.setAnestesia(datoint);
                    
                    System.out.println("Cuanto suero tenemos en existencia? -en litros- ");
                    datoint = entrada.nextInt();
                    objMedi.setSueros(datoint);
                    
                    
entrada.nextLine();
                    
                    System.out.println("Ha ingresado correctamente los datos?  "+objMedi.getAntiinflamatorios()+" ,"+objMedi.getComplejos()+" ,"+objMedi.getAntibioticos()+" ,"+objMedi.getCicatrizantes()+" ,"+objMedi.getAnestesia()+" ,"+objMedi.getSueros());
                    System.out.println("Y/N");
                    datostring = entrada.nextLine();
                    if (datostring.equalsIgnoreCase("Y")){
                    System.out.println("Gracias por confirmar ");
                    verif = true;
                    }
                    else{
                            System.out.println("Por favor repetir el ingreso y ingresar ocrrectamente los datos");
                            }
                }
                
                verif = false;
                
                
entrada.nextLine();
                
                while(verif == false){
                     System.out.println("Ahora debera ingresar la cantidad de accesorios en bodega:  "+"\n Cuantos Juguetes Masticables tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setJugueteMastc(datoint);
                    
                    System.out.println("Cuantos paquetes de Catnip hay en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setCatnip(datoint);
                    
                    System.out.println("Cuantas prendas de ropa tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setRopa(datoint);
                    
                    System.out.println("Cuantas bolsas de comida PREMIUM hay en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setComidaprem(datoint);
                    
                    System.out.println("Cuantos cepillos para el pelaje tenemos en exiatencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setCepillo(datoint);
                    
                    System.out.println("Cuantos tubos de pasta dedientes animal tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setPasta(datoint);
                    
                    System.out.println("Cuantos collares antipulgas tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setAntipulgas(datoint);
                    
                    System.out.println("Cuantos botes de Shampoo tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setShampoo(datoint);
                    
                    System.out.println("Cuantas Casitas para mascota tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setCasa(datoint);
                    
                    System.out.println("Cuantos muebles de juegos tenemos en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setMueble(datoint);
                    
                    System.out.println("Cuantas peceras tenemo en existencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setPecera(datoint);
                    
                    System.out.println("Cuantos elementos decorativos tenemos en exiatencia? ");
                    datoint = entrada.nextInt();
                    objAccs.setDecorativos(datoint);
                    
                    
entrada.nextLine();
                    
                    System.out.println("Ha ingresado correctamente los datos?  "+objAccs.getJugueteMastc()+" ,"+objAccs.getCatnip()+" ,"+objAccs.getRopa()+" ,"+objAccs.getComidaprem()+" ,"+objAccs.getCepillo()+" ,"+objAccs.getPasta()+" ,"+objAccs.getAntipulgas()+" ,"+objAccs.getShampoo()+" ,"+objAccs.getCasa()+" ,"+objAccs.getMueble()+" ,"+objAccs.getPecera()+" ,"+objAccs.getDecorativos());
                    System.out.println("Y/N");
                    datostring = entrada.nextLine();
                    if (datostring.equalsIgnoreCase("Y")){
                    System.out.println("Gracias por confirmar ");
                    verif = true;
                    }
                    else{
                            System.out.println("Por favor repetir el ingreso y ingresar ocrrectamente los datos");
                            }
                }
                    
                    
                }
        }
    }
