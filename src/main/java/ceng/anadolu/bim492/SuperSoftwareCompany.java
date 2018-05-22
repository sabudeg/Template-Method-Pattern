package ceng.anadolu.bim492;

public abstract class SuperSoftwareCompany {
    final void templateMethod() {
        System.out.println("--------------------------------");
        doWork();
        getWage();
        getTask();
    }
    public abstract void getWage();
    public abstract void getTask();
    private void doWork(){
        System.out.println("I am " + getClass().getSimpleName() + " and working for this company.");
    }
}