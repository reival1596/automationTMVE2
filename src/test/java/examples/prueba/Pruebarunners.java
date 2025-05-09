package examples.prueba;

import com.intuit.karate.junit5.Karate;

public class Pruebarunners {
    @Karate.Test
    Karate getUser(){
        return Karate.run("prueba").relativeTo(getClass());
    }

}
