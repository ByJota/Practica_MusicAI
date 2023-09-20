package Generos;

public class Generador_Cancion {
    
        public String[] SacarRitmos(){
            String[] tmp = new String[3];
    
            for(int i=0;i<=2;i++){
                boolean flag= false;
                System.out.println("Selecione algun genero musical");
                int valor=0;
                switch (valor) {
                    case 1:
                        generos Regueton=new Regueton();
                        tmp[i]=Regueton.GenerarRitmo();
                        
                        break;
    
                    case 2:
                        generos Rock=new Rock();
                        tmp[i]=Rock.GenerarRitmo();
                        
                        break;
    
                    case 3:
                        generos Salsa=new Salsa();
                        tmp[i]=Salsa.GenerarRitmo();
                        
                        break;
    
                    case 4:
                        generos Pop=new Pop();
                        tmp[i]=Pop.GenerarRitmo();
                        
                        break;
                
                    default:
                        break;
                }
    
                System.out.println("desea selecionar algun otro genero musical");
                if(!flag){
                    break;
                }
    
            }
            return tmp;
        }
    
        public String generarCancion(String[] pGeneros,String pLetra){
            String NuevaCancion=pLetra+pGeneros[0];
            return NuevaCancion;
        }
}
