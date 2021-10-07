public class DeliveryAgent {
    public String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        System.out.println("Name of the Delivery Agent is: " + name);
        return name;
    }

}
