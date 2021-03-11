package comm.test;

public class UserMainCode {
    public static boolean checkPassword(String password){
        boolean valid = true;
        if (password.length() < 8)
        {
            System.out.println("length of the password should be more than 8 characters.");
            valid = false;
        }else if(password.length() > 8){
            if(password.matches("(.*[A-Z].*)")){
                valid=true;
                if(password.matches("(.*[a-z].*)")){
                    valid=true;
                    if(password.matches("(.*[0-9].*)")){
                        valid=true;
                        if(password.matches("(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)")){
                            System.out.println("Valid Password");
                            valid = true;
                        }else
                            System.out.println("Password should contain 1 special character");
                            valid=false;
                    }else
                        System.out.println("Password should contain atleast 1 number");
                        valid=false;
                }else{
                    System.out.println("Password should contain atleast 1 lower case letter");
                    valid = false;
                }
            }else{
                System.out.println("Password should contain atleast 1 upper case letter");
                valid=false;
            }
        }

        return valid;
    }
}
