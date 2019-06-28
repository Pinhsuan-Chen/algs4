
class StaticVar {
    public final static int LUCKY_NUMBER = 7;

    public String name;
    public static String description;

    public static int count = 0;

    public int id;
// constructor
    public StaticVar() {

        id = count;

        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
        // Won't work: System.out.println(name);
    }

    public static void main(String[] args) {

        StaticVar.description = "I am a thing";

        StaticVar.showInfo();

        System.out.println("Before creating objects, count is: " + StaticVar.count);

        StaticVar thing1 = new StaticVar();
        StaticVar thing2 = new StaticVar();

        System.out.println("After creating objects, count is: " + StaticVar.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(StaticVar.LUCKY_NUMBER);
    }




}



