public class main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name("Sham");
        e1.age(20);
        e1.phnum("9940890784");
        e1.address("Chennai");
        e1.printsalary(25000);
        e1.specialization("Marketing");

        Manager m1=new Manager();
        m1.name("Balaji");
        m1.age(25);
        m1.phnum("9876543210");
        m1.address("Cuddalore");
        m1.printsalary(50000);
        m1.department("Artificial Intelligence");

    }
}