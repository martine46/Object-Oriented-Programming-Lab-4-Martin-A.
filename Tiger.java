class Tiger{
    private String name;

    public Tiger(String name){
        this.name=name;
    }


public String getName(){
    return name;


}

public void attack(Employee e){
    System.out.println(this.name + " attacks " + e.getName());
}



}