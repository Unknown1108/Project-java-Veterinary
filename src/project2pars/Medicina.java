/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2pars;

/**
 *
 * @author Omar
 */
public class Medicina  {
String Antiinflamatorios, Complejos, Antibioticos, Cicatrizantes;
int Anestesia, Sueros;
            public Medicina() {
                   this.Antiinflamatorios = "";
                   this.Complejos = "";
                   this.Antibioticos = "";
                   this.Cicatrizantes = "";
                   this.Anestesia = 0;
                   this.Sueros = 0;

              } 

    public String getAntiinflamatorios() {
        return Antiinflamatorios;
    }
     public void setAntiinflamatorios(String Antiinflamatorios) {
        this.Antiinflamatorios = Antiinflamatorios;
    }
     

    public String getComplejos() {
        return Complejos;
    }
    public void setComplejos(String Complejos) {
        this.Complejos = Complejos;
    }
    

    public String getAntibioticos() {
        return Antibioticos;
    }
     public void setAntibioticos(String Antibioticos) {
        this.Antibioticos = Antibioticos;
    }
     

    public String getCicatrizantes() {
        return Cicatrizantes;
    }
     public void setCicatrizantes(String Cicatrizantes) {
        this.Cicatrizantes = Cicatrizantes;
    }
     

    public int getAnestesia() {
        return Anestesia;
    }
     public void setAnestesia(int Anestesia) {
        this.Anestesia = Anestesia;
    }
     

    public int getSueros() {
        return Sueros;
    }
     public void setSueros(int Sueros) {
        this.Sueros = Sueros;
     }
}