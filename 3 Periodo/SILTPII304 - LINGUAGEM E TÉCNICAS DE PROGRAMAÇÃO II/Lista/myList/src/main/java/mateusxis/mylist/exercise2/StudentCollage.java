package mateusxis.mylist.exercise2;

import mateusxis.mylist.exercise1.*;
/**
 *
 * @author mateusxis
 */
public class StudentCollage extends Student {
    private float noteFinal = -1f;
    private float averagePartial = -1f;
    private boolean needTestFinal = false;

    public void setNoteFinal(String _noteFinalInput) {
        float _noteFinal = Float.parseFloat(_noteFinalInput);  
         if (_noteFinal >= 0f && _noteFinal <= 10f) {
            this.noteFinal = _noteFinal;
        }
    }
    
    public float getNoteFinal() {
        return this.noteFinal;
    }
    
     public void setNeedTestFinal(boolean _needTestFinal) {
        this.needTestFinal = _needTestFinal;
    }
    
    public boolean getNeedTestFinal() {
        return this.needTestFinal;
    }
    
    public float calculateAveragePartial () {
        float _noteOne = getNoteOne();
        float _noteTwo = getNoteTwo();
        float average = (_noteOne + _noteTwo)/2;
        if (average >= 7f) {
            this.setIsAproved(true);
        } else {
            this.setNeedTestFinal(true);
        }
        
        return average;
    }
}
