/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11;
import java.util.Calendar;
/**
 *
 * @author yv066840
 */
public class Date implements iDate{


    @Override
    public int jour() {
        Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int mois() {
     Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.MONTH);

    }

    @Override
    public int annee() {
        Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.YEAR);
    }

    @Override
    public int heure() {
        Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.HOUR_OF_DAY);
    }

    @Override
    public int minute() {
        Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.MINUTE);
    }

    @Override
    public int seconde() {
        Calendar leCalendrier =Calendar.getInstance();
        return leCalendrier.get(Calendar.SECOND);
    }

    @Override
    public String dateCourte() {
        return "Date : "+ this.jour()+"/"+(this.mois()+1)+"/"+this.annee()+" "+ this.heure()+":"+this.minute()+":"+this.seconde();
    }

    @Override
    public String dateLongue() {
      return "Not supported yet";
    }
    
    
}
