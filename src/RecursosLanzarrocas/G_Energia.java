/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursosLanzarrocas;

import Lanzarrocas.Raza;

/**
 *
 * @author Daniela Chavez
 */
public class G_Energia implements Raza {
    public int Energia;
    public int vida=20;
    public boolean estado=false;       

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }
    

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
    }

    @Override
    public int recolectar() {
        int num;
        num=getEnergia();
        setEnergia(0);
        return num;
    }

    @Override
    public void generar() {
        setEnergia(Energia+300);
        
    }

    @Override
    public boolean entrenar() {
        return estado;
    }

    @Override
    public boolean estado() {
        if(estado==false){
            setEstado(true);
        }
        else{
            setEstado(false);
        }
        return estado;
    }

    @Override
    public int vida() {
        return vida;
    }

    @Override
    public boolean question() {
        return estado;
    }

    @Override
    public int nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int fase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar_vida(int num) {
        setVida(vida-num);
        return vida;
    }

    @Override
    public int lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ubicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar_lista(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar_ubicacion(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generar_doble() {
         setEnergia(Energia+600);}

    @Override
    public void vida_inicial() {
        setVida(getVida()*2);
    }
    
}

