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
public class Comida  {
    String Vitvar, Fechareg;
    int Concentrado,ComVolt;

    public Comida() {
        this.ComVolt = 0;
        this.Vitvar ="";
        this.Fechareg = "";
        this.Concentrado = 0;
    }

    
    public void setComVolt(int ComVolt) {
        this.ComVolt = ComVolt;
    }
    public int getComVolt() {
        return ComVolt;
    }
    
    

    public void setVitvar(String Vitvar) {
        this.Vitvar = Vitvar;
    }
     public String getVitvar() {
        return Vitvar;
    }
     
     

    public void setFechareg(String Fechareg) {
        this.Fechareg = Fechareg;
    }
    public String getFechareg() {
        return Fechareg;
    }

    
    
    public void setConcentrado(int Concentrado) {
        this.Concentrado = Concentrado;
    }
     public int getConcentrado() {
        return Concentrado;
     }  
}