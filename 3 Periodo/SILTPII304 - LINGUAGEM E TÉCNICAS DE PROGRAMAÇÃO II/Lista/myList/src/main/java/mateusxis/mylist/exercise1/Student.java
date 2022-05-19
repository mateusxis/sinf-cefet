package mateusxis.mylist.exercise1;

/**
 *
 * @author mateusxis
 */
public class Student {
    private String name;
    private String registration;
    private float noteOne = -1f;
    private float noteTwo = -1f;
    private boolean isApproved = false;
    
    public void setName (String _name) {
        this.name = _name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setRegistration (String _registration){
        this.registration = _registration;
    }
    
    public String getRegistration() {
        return this.registration;
    }
    
    public void setNoteOne(String _noteOneInput) {
        float _noteOne = Float.parseFloat(_noteOneInput);  
        if (_noteOne >= 0f && _noteOne <= 10f) {
            this.noteOne = _noteOne;
        } else {
            System.out.println("Enter number for 0 to 10");
        }
    }
    
    public float getNoteOne() {
        return this.noteOne;
    }
    
    public void setNoteTwo(String _noteTwoInput) {
        float _noteTwo = Float.parseFloat(_noteTwoInput);  
        if (_noteTwo >= 0f && _noteTwo <= 10f) {
            this.noteTwo = _noteTwo;
        } else {
            System.out.println("Enter number for 0 to 10");
        }
    }
    
    public float getNoteTwo() {
        return this.noteTwo;
    }
    
    public void setIsApproved(boolean _isApproved) {
        this.isApproved = _isApproved;
    }
    
    public boolean getIsApproved() {
        return this.isApproved;
    }
    
    public float calculateAverage () {
        float _noteOne = getNoteOne();
        float _noteTwo = getNoteTwo();
        float average = (_noteOne + _noteTwo)/2;
        if (average >= 7f) {
            this.setIsApproved(true);
        } else {
            this.setIsApproved(false);
        }
        
        return average;
    }
}
