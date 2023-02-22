public class Mechanics{
    private final String nameMechanics;
    private final String nameCompanyMechanics;

    public Mechanics(String nameMechanics, String nameCompanyMechanics) {
        this.nameMechanics = nameMechanics;
        this.nameCompanyMechanics = nameCompanyMechanics;
    }

    public String getNameMechanics() {
        return nameMechanics;
    }

    public String getNameCompanyMechanics() {
        return nameMechanics;
    }

    public void carryMaintenance() {
        System.out.println("Проведено обслуживание");
    }

    public void fixTheCaR() {
        System.out.println("Починить машину");
    }

    @Override
    public String toString() {
        return
                "Имя Механика " + nameMechanics + '\'' +
                ", Название компания механика " + nameCompanyMechanics + '\'' +
                '}';
    }
}
