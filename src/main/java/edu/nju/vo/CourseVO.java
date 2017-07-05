package edu.nju.vo;

/**
 * Created by xinyu on 2017/6/12.
 */
public class CourseVO {
    private String cid;
    private String name;
    private String point;
    private String teacher;
    private String location;

    public CourseVO() {
        this.cid = cid;
        this.name = name;
        this.point = point;
        this.teacher = teacher;
        this.location = location;
    }

    public CourseVO(String cid, String name, String point, String teacher, String location) {
        this.cid = cid;
        this.name = name;
        this.point = point;
        this.teacher = teacher;
        this.location = location;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CourseVO{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", point='" + point + '\'' +
                ", teacher='" + teacher + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
