package mateusxis.mylist.exercise3;

/**
 *
 * @author mateusxis
 */
public class MaximumNumber {
    private float maximumNumber = -3.4028234663852886E38f;
    
    public float getMaximumNumber() {
        return this.maximumNumber;
    }
    
    public void setMaximumNumber(String _maximumNumberInput) {
        float _maximumNumber = Float.parseFloat(_maximumNumberInput);  
        if (this.maximumNumber < _maximumNumber) {
            this.maximumNumber = _maximumNumber;
        }
    }
}
