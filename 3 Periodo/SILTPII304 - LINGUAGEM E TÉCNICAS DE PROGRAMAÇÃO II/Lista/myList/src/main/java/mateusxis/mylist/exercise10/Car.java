package mateusxis.mylist.exercise10;

/**
 *
 * @author mateusxis
 */
public class Car {
    private int id;
    private String name, plane;
    private float mileage;  
    
    public Car (int _id, String _name, String _plane) {
        id = _id;
        name = _name;
        plane = _plane;
        mileage = 0;
    }
            
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
            
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
            
    public String getPlane() {
        return this.plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public float getMileage() {
        return this.mileage;
    }

    public void toRun(float velocity, float duration) {
        float _mileage = this.calculateMileage(velocity, duration);
        this.setMileage(_mileage);
    }
   
    public void setMileage(float mileage) {
        this.mileage += mileage;
    }
    
    private float calculateMileage(float velocity, float duration)   {
       return velocity * duration;
    }
}
