/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mateusxis.mylist.exercise11;

import java.text.SimpleDateFormat;  
import java.text.ParseException;   
import java.util.Date;
/**
 *
 * @author sueta
 */
public class Person {
    private String name;
    private Date birthday;
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");


    public Person(String _name, String _birthday) {
        name = _name;
        try {
            birthday = dateFormatter.parse(_birthday);
        }
        catch (ParseException excep) {
            excep.printStackTrace();   
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String _birthday) {
        try {
            birthday = dateFormatter.parse(_birthday);
        }
        catch (ParseException excep) {
            excep.printStackTrace();   
        }
    }

    public long calculateAge() {
        Date today = new Date();
        Date _birthday = this.getBirthday();
        long time_diff = today.getTime() - _birthday.getTime();
        long age = time_diff / (1000l*60*60*24*365);
        return age;
    }
}
