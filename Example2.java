class Example2{

    public static void main(String args[]){

        Person p1 = new Person("noah",27);
        Employee e1 = new Employee(3514879, "myk" , 37  );
        Employee e2= new Employee(2003, "Roy" , 45  );
        Employee e3 = new Employee(2019, "Bailey" , 8  );


        System.out.println(p1.getName() + " " + p1.getAge());

        System.out.println(e1.getName() + " " + e1.getAge() + e1.getSalary());
        System.out.println(e2.getName() + " " + e2.getAge() + e2.getSalary());
        System.out.println(e3.getName() + " " + e3.getAge() + e3.getSalary());

        Animal a1=new Animal("Macchiatto");
        Tiger a2=new Tiger("Tiger");
        Lion a3=new Lion("Lion");

        a1.attack(e1);
        a2.attack(e2);
        a3.attack(e3);

    }
}


