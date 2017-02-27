package com.sp1r1n.app.homework.lesson12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Denis on 2/27/2017.
 */
public class WhiteCollar extends Human {

    private String companyName;

    public WhiteCollar(int age, String name, String companyName){
        super(age, name);
        this.companyName = companyName;
    }

    public String getCompanyName(){ return companyName; }

    public String setCompanyName(String companyName){
        if (checkName(companyName)){
            this.companyName = companyName;
            return "Company Name is set";
        }
        else return "Company Name is not valid. Accepted characters: A-Z;a-z; point, comma, space, dash";
    }
}
