package edu.nju.vo;

/**
 * Created by xinyu on 2017/6/12.
 */
public class StudentVO {
    private String id;
    private String name;
    private String major;
    private String gender;

    public StudentVO() {
    }

    public StudentVO(String id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
