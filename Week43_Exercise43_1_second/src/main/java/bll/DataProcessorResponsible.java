package bll;

import dk.easvae.week43_exercise43_1_second.HelloController;

public class DataProcessorResponsible {

    public String ageChecker(String ageText) {

        try{
            if(Integer.parseInt(ageText) < 0) {
                return "Invalid Age";
            } else {

                return "Your age is: " + ageText;
            }
        } catch (RuntimeException e) {
            return "Age cannot be string";
        }

    }

    public String nameChecker(String nameText) {


        return "Your beautiful name is: " + nameText;
        
    }

    public String resetLabels() {

        return "";
    }
}
