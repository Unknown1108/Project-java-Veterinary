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
public class Mascota  {
String Code, Nommbre, Especie, Raza, Sexo, Fechaingr, DiagnosINIC, Tratamiento, Fechartro, Hora, DiagnosFnal;
Dueño dueño;

    public Mascota(String Code, String Nommbre, String Especie, String Raza, String Sexo, String Fechaingr, String DiagnosINIC, String Tratamiento, String Fechartro, String Hora, String DiagnosFnal) {
        this.Code = Code;
        this.Nommbre = Nommbre;
        this.Especie = Especie;
        this.Raza = Raza;
        this.Sexo = Sexo;
        this.Fechaingr = Fechaingr;
        this.DiagnosINIC = DiagnosINIC;
        this.Tratamiento = Tratamiento;
        this.Fechartro = Fechartro;
        this.Hora = Hora;
        this.DiagnosFnal = DiagnosFnal;
        this.dueño = dueño;
    }
    
    
    public String getCode() {
        return Code;
    }
        public void setCode(String Code) {
        this.Code = Code;
    }
        
        
    public String getNommbre() {
        return Nommbre;
     }
     public void setNommbre(String Nommbre) {
        this.Nommbre = Nommbre;
    }
      
     
    public String getEspecie() {
        return Especie;
    }
     public void setEspecie(String Especie) {
        this.Especie = Especie;
    }
     
     
    public String getRaza() {
        return Raza;
    }
      public void setRaza(String Raza) {
        this.Raza = Raza;
    }
      
      
    public String getSexo() {
        return Sexo;
    }
      public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
      
     
    public String getFechaingr() {
        return Fechaingr;
    }
     public void setFechaingr(String Fechaingr) {
        this.Fechaingr = Fechaingr;
    }
     
     
    public String getDiagnosINIC() {
        return DiagnosINIC;
    }
    public void setDiagnosINIC(String DiagnosINIC) {
        this.DiagnosINIC = DiagnosINIC;
    }
    
   
    public String getTratamiento() {
        return Tratamiento;
    }
     public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }
     
     
    
    public String getFechartro() {
        return Fechartro;
    }
    public void setFechartro(String Fechartro) {
        this.Fechartro = Fechartro;
    }
    

    public String getHora() {
        return Hora;
    }
    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    

    public String getDiagnosFnal() {
        return DiagnosFnal;
    }
     public void setDiagnosFnal(String DiagnosFnal) {
        this.DiagnosFnal = DiagnosFnal;
    }
     

    public Dueño getDueño() {
        return dueño;
    }
     public void setDueño(Dueño dueño) {
        this.dueño = dueño;
     }   
}