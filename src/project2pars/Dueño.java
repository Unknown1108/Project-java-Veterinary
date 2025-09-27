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
public class Dueño {
    String Nombre, DPI, Code, Direccion, NTelefono, Correo, Ref1,Telref1,Ref2,Telref2, metpag;

    public Dueño(String Nombre, String DPI, String Code, String Direccion, String NTelefono, String Correo, String Ref1, String Telref1, String Ref2, String Telref2, String metpag) {
        this.Nombre = Nombre;
        this.DPI = DPI;
        this.Code = Code;
        this.Direccion = Direccion;
        this.NTelefono = NTelefono;
        this.Correo = Correo;
        this.Ref1 = Ref1;
        this.Telref1 = Telref1;
        this.Ref2 = Ref2;
        this.Telref2 = Telref2;
        this.metpag = metpag;
    }    
        
        
   public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   public String getNombre(){
       return Nombre;
   }
    

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
    public String getDPI() {
        return DPI;
    }
    
    

    public void setCode(String Code) {
        this.Code = Code;
    }
     public String getCode() {
        return Code;
    }
     
     

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
      public String getDireccion() {
        return Direccion;
    }
      
      

    public void setNTelefono(String NTelefono) {
        this.NTelefono = NTelefono;
    }
     public String getNTelefono() {
        return NTelefono;
    }
     
     

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
      public String getCorreo() {
        return Correo;
    }
      
      

    public void setRef1(String Ref1) {
        this.Ref1 = Ref1;
    }
     public String getRef1() {
        return Ref1;
    }
     
     
     

    public void setTelref1(String Telref1) {
        this.Telref1 = Telref1;
    }
      public String getTelref1() {
        return Telref1;
    }
      
      
      

    public void setRef2(String Ref2) {
        this.Ref2 = Ref2;
    }
     public String getRef2() {
        return Ref2;
    }
     
     
     

    public void setTelref2(String Telref2) {
        this.Telref2 = Telref2;
    }
     public String getTelref2() {
        return Telref2;
    }
     
     

    public void setMetpag(String metpag) {
        this.metpag = metpag;
    }
    
     public String getMetpag() {
        return metpag;
    }
     
}
       