package Generos;


public interface generos {
    letra letraCancion=new letra();
    String GenerarRitmo();
}

class Regueton implements generos {

    @Override
    public String GenerarRitmo() {
        String tmp= "regueton";
        return tmp;
    }
    
}

class Rock implements generos {

    @Override
    public String GenerarRitmo() {
        String tmp= "rock";
        return tmp;
    }
    
}

class Salsa implements generos {

    @Override
    public String GenerarRitmo() {
        String tmp= "salsa";
        return tmp;
    }
    
}

class Pop implements generos {

    @Override
    public String GenerarRitmo() {
        String tmp= "pop";
        return tmp;
    }
    
}
