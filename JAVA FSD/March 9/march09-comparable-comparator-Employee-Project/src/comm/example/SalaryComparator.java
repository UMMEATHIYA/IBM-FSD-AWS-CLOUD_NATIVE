package comm.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Employee1 employee1=(Employee1) o;
        Employee1 employee2=(Employee1) t1;
        if(employee1.getSalary()==employee2.getSalary())
        {
            return 0;
        }
        else if (employee1.getSalary()<employee2.getSalary())
            return 1;
        else
            return -1;

    }
}
