package entities;

import javax.print.DocFlavor.STRING;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private static String IncrementarNivel;
    
        public Agente(int id, String nombre, String habilidadEspecial) {
            super(id, nombre);
            this.habilidadEspecial = habilidadEspecial;
        }
    
        public void IncrementarNivel(String IncrementarNivel) {
            Agente.IncrementarNivel = IncrementarNivel;
    
    
        }
        public static void IncrementarNivel(){
            IncrementarNivel += 1;
    }

        

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int GetnivelAgente(){
        return nivelAgente();

    }

    public int nivelAgente(){
        return nivelAgente();
     }

    


    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");

    }

    public String tString(){
        return super.toString() + ", Incrementar y Aumentar Nivel:" + IncrementarNivel + 
        (IncrementarNivel != null ? ",nivel: " + IncrementarNivel : "");

    }

 
}
