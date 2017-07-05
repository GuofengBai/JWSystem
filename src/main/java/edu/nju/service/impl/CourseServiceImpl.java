package edu.nju.service.impl;

import edu.nju.service.CourseService;
import edu.nju.util.UtilTool;
import edu.nju.vo.CourseVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
@Service
public class CourseServiceImpl implements CourseService{
    public List<CourseVO> transCourse(String a, String b, String c) {
        List<CourseVO> courseList=new ArrayList<CourseVO>();
        List<CourseVO> courseListA=transCourseA(a);
        List<CourseVO> courseListB=transCourseB(b);
        List<CourseVO> courseListC=transCourseC(c);
        for(int i=0;i<courseListA.size();i++){
            courseList.add(courseListA.get(i));
        }
        for(int i=0;i<courseListB.size();i++){
            courseList.add(courseListB.get(i));
        }
        for(int i=0;i<courseListC.size();i++){
            courseList.add(courseListC.get(i));
        }


        return courseList;
    }


    public List<CourseVO> getAllCourse() {
        String a,b,c;
        a= UtilTool.getAllCourseByA();
        b=UtilTool.getAllCourseByB();
        c=UtilTool.getAllCourseByC();

        return transCourse(a,b,c);
    }


    public List<CourseVO> getSelectedCourse(String id) {
        String a,b,c;
        a= UtilTool.getSelectedByA(id);
        b=UtilTool.getSelectedByB(id);
        c=UtilTool.getSelectedByC(id);

        return transCourse(a,b,c);
    }


    public List<CourseVO> getUnSelectedCourse(String id) {
        String a,b,c;
        a= UtilTool.getUnselectedByA(id);
        b=UtilTool.getUnselectedByB(id);
        c=UtilTool.getUnselectedByC(id);

        return transCourse(a,b,c);
    }


    public List<CourseVO> transCourseA(String input){
        List<CourseVO> courseList=new ArrayList<CourseVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                CourseVO vo=new CourseVO();
                vo.setCid((String)obj.get("cid"));
                vo.setName((String)obj.get("cname"));
                vo.setPoint((String)obj.get("point"));
                vo.setTeacher((String)obj.get("teacher"));
                vo.setLocation((String)obj.get("place"));

                courseList.add(vo);
            }

        }

        return courseList;
    }

    public List<CourseVO> transCourseB(String input){
        List<CourseVO> courseList=new ArrayList<CourseVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                CourseVO vo=new CourseVO();
                vo.setCid((String)obj.get("cid"));
                vo.setName((String)obj.get("name"));
                vo.setPoint((String)obj.get("point"));
                vo.setTeacher((String)obj.get("teacher"));
                vo.setLocation((String)obj.get("location"));
                courseList.add(vo);
            }

        }

        return courseList;
    }

    public List<CourseVO> transCourseC(String input){
        List<CourseVO> courseList=new ArrayList<CourseVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                CourseVO vo=new CourseVO();
                vo.setCid((String)obj.get("0"));
                vo.setName((String)obj.get("1"));
                vo.setPoint((String)obj.get("3"));
                vo.setTeacher((String)obj.get("4"));
                vo.setLocation((String)obj.get("5"));
                courseList.add(vo);
            }

        }

        return courseList;
    }



}
