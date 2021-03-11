package comm.example;

    public class Engineer extends Employee{

        private String type;

        public Engineer(String type) {
            this.type = type;
        }

        @Override
        public void setEmployeeDetails(String employeeId, String firstName, String lastName, String email) {
            super.setEmployeeDetails(employeeId, firstName, lastName, email);
        }

        @Override
        public void getEmployeeDetails() {
            super.getEmployeeDetails();
            System.out.println(type);
        }
    }
