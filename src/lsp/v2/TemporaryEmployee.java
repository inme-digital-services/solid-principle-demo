package lsp.v2;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    int minimumSalary() {
        return 100;
    }

    @Override
    int calculateBonus(int salary) {
        return salary/5;
    }
}
