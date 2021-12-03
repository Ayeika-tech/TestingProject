public class Neighbors {
    private String name;
    private String last;
    private String number;
    private String address;

    public Neighbors(String name, String last, String number, String address) {
        this.name = name;
        this.last = last;
        this.number = number;
        this.address = address;
    }
   public Neighbors(String name, String last, String address) {
        this.name = name;
        this.last = last;
        this.address = address;
    }

    public Neighbors(String name, String last) {
        this.name = name;
        this.last = last;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }
   
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Neighbors [address=" + address + ", last=" + last + ", name=" + name + ", number=" + number + "]";
    }




    
}
