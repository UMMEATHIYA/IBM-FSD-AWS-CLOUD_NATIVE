package comm.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeFactory1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        BufferedReader br =null;
        Employee e = null;
        br = new BufferedReader(new FileReader("employee.txt"));
        String line="";
        try {
            while ((line = br.readLine()) != null) {
                e = new Employee();
                String data[] = line.split(",");
                for(int i=0;i< data.length;i++) {
                    e.setEmpID(data[0]);
                    e.setfName(data[1]);
                    e.setlName(data[2]);
                    e.setEmail(data[3]);
                }
                emp.add(e);

            }
            System.out.println(emp.toString());

            br.close();

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
