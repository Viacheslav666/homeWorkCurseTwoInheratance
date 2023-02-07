public class Main {
    public static void main(String[] args) {
        Transport car = new Transport("Lada", "Proira", 2015, "Tolyatti", "", 200);
        System.out.println(car.getBodyColor());
        Bus b = new Bus("YAZ", "Lastochka", 1990, "Samara", "", 200);
        Bus c = new Bus("", "Lastochka", 1990, "Samara", "", 200);
        Bus a = new Bus("Luaz", "Lastochka", 1990, "Samara", "", 200);
        System.out.println(a.toString());
        System.out.println(c.toString());
        System.out.println(b.toString());
    }


}