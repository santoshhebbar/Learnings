class Encapsulation{

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
     this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this. name=name;
    }
}


class Demo{
    public static void main(String[] args) {

        Encapsulation encap1=new Encapsulation();
        encap1.setId(8);
        encap1.setName("sai");

        Encapsulation encap2=new Encapsulation();
        encap2.setId(9);
        encap2.setName("sairam");

        System.out.println(encap1.getId()+" "+encap1.getName());
        System.out.println(encap2.getId()+" "+encap2.getName());
    }
}