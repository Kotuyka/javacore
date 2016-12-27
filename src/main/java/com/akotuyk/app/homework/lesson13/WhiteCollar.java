package com.akotuyk.app.homework.lesson13;

/**
 * Created by Huly-Buly on 27.12.2016.
 */
public class WhiteCollar extends Human {

    private String companyName;

    private void setCompanyName(String companyName) {
        if (companyName.matches("[a-zA-Z ,-]+")) {
            this.companyName = companyName;
            System.out.println("Company name setted");
        } else {
            System.out.println("Company name is invalid");
        }
    }

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        setCompanyName(companyName);
    }

    @Override
    public String toString() {
        return "WhiteCollar{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
