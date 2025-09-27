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
public class Mercaderia extends Accesorios {
    private double JgtMstc, Ctnp, Rp, Cdaprm, Cpll, Pst, Antplgs, Shmp, Cs, Mbl, Pcr, Dcrtvs;

    public Mercaderia() {
        this.JgtMstc = 0.65 * getJugueteMastc();
        this.Ctnp = 0.65 * getCatnip();
        this.Rp = 0.65 * getRopa();
        this.Cdaprm = 0.65 * getComidaprem();
        this.Cpll = 0.65 * getCepillo();
        this.Pst = 0.65 * getPasta();
        this.Antplgs = 0.65 * getAntipulgas();
        this.Shmp = 0.65 * getShampoo();
        this.Cs = 0.65 * getCasa();
        this.Mbl = 0.65 * getMueble();
        this.Pcr = 0.65 * getPecera();
        this.Dcrtvs = 0.65 * getDecorativos();
    }
}


