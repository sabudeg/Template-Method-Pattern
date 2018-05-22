package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        System.out.println("Constructing concrete classes.");
        SuperSoftwareCompany leader = new TeamLeader();
        SuperSoftwareCompany senior = new SeniorTester();
        SuperSoftwareCompany junior = new JuniorTester();
        SuperSoftwareCompany intern = new Intern();

        System.out.println("Calling template methods.");
        leader.templateMethod();
        senior.templateMethod();
        junior.templateMethod();
        intern.templateMethod();
        System.out.println();
    }
}
