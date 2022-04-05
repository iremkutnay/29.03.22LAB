package tr.edu.maltepe.oop;

public class Student extends Person implements do_sport{

    public Student(String name, String surname, int id)
    {
        super(name, surname, id);
    }

    @Override
    public void swimmingPool(Person person, SportCenter sportCenter) {
        super.swimmingPool(person, sportCenter);
    }

    @Override
    public void footballArea(Person person, SportCenter sportCenter) {
        super.footballArea(person, sportCenter);
    }

    @Override
    public void swim(Person person, SportCenter sportCenter){
        swimmingPool(person, sportCenter);
    }
    
    @Override
    public void playfootball(Person person, SportCenter sportCenter) {
        footballArea(person, sportCenter);
    }



}
