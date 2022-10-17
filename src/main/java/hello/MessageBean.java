package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;  

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "José Viterbo";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    
    public String getMsg() {
        LocalDateTime tempo = LocalDateTime.now();
        if (tempo.getHour() >= 6 && tempo.getHour() < 12) {
            return getMorningText();
        } else if (tempo.getHour() >= 12 && tempo.getHour() < 18) {
            return getAfternoonText();
        }
        return getEveningText();
    }

    public String getMorningText() {
        switch (this.lang){
            case "pt":
                return "Bom dia";
            case "en":
                return "Good morning";
            case "de":
                return "Guten morgen";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }

    public String getAfternoonText() {
        switch (this.lang){
            case "pt":
                return "Boa tarde";
            case "en":
                return "Good afternoon";
            case "de":
                return "Guten nachmittag";
            case "fr":
                return "Bon après-midi";
        }
        return "";
    }

    public String getEveningText() {
        switch (this.lang){
            case "pt":
                return "Boa noite";
            case "en":
                return "Good evening";
            case "de":
                return "Guten abend";
            case "fr":
                return "Bonsoir";
        }
        return "";
    }
}