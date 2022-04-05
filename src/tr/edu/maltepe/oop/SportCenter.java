package tr.edu.maltepe.oop;

import java.util.Vector;

public class SportCenter {
    private Vector<Person> vectorPool = new Vector<Person>();
    private Vector<Person> vectorFootball = new Vector<Person>();

    public Vector<Person> getVectorPool(){
        return vectorPool;
    }
    public Vector<Person> getVectorFootball(){
        return vectorFootball;
    }


}
