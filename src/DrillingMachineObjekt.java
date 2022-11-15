public class DrillingMachineObjekt {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;


    public DrillingMachineObjekt() {
        name = "Super DM 666";

        //Typecast (Typkonvertierung) ist notwendig,
        //damit Java weiß, was es mit der Nachkommastelle tun soll.
        watt = (int) (Math.random() * 1201 + 800);

        //Damit auch die 10 möglich ist, muss hier mit 11 multipliziert werden
        //somit haben alle 11 Möglichkeiten (0,1, ..., 9, 10) eine Wahrscheinlichkeit
        //von 1/11 ~ 0,090909...
        age = (int) (Math.random() * 11);

        price = Math.random() * 450 + 50;
    }

    public void showInfos() {
        System.out.println(name + " - "
                + " Watt " + watt
                + " - Preis " + price
                + " - Kaputt?: " + broken);
    }

    public void becomeBroken() {
        broken = true;
    }
    //task 3a)
    public void setBroken(boolean isBroken) { this.broken = isBroken; }

    //task 3b)
    public void increasePrice(double amount) { this.price += amount ; }

    //task 3c)
    public void changePower(int watt) {
        if (watt > 0) {
            this.watt += watt;
            if (watt > 100) {
                this.price *= 1.05;
            } else {
                this.watt += watt;
                this.price *= 0.9;
            }

        }
    }
}












