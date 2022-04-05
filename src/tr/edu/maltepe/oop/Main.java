package tr.edu.maltepe.oop;

class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("ensar", "gul",123456);
        Professor professor2 = new Professor("raif", "onvural", 654321);
        Student student1 = new Student("irem", "kutnay", 210704308);
        Student student2 = new Student("eren", "kutnay", 123);
        SportCenter sportCenter = new SportCenter();

        student1.swim(student1,sportCenter);
        student2.playfootball(student2,sportCenter);
        professor1.playfootball(professor1, sportCenter);
        professor2.swim(professor2, sportCenter);

        System.out.println("************* who is swimming now *****************");

        for (int i = 0; i < sportCenter.getVectorPool().size();i++){
            System.out.println(i+1 + "-" +sportCenter.getVectorPool().get(i).getName()+" "+sportCenter.getVectorPool().get(i).getSurname() + " is swimming");
        }

        System.out.println("************* who is playing football now*****************");

        for (int i = 0; i < sportCenter.getVectorFootball().size();i++){
            System.out.println(i+1 +"-" + sportCenter.getVectorFootball().get(i).getName()+" "+sportCenter.getVectorFootball().get(i).getSurname()+" is playing football");
        }

    }
}
