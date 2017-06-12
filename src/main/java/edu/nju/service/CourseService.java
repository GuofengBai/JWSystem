package edu.nju.service;

import edu.nju.vo.CourseVO;

import edu.nju.vo.SelectVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/6/12.
 */
@Service
public class CourseService {

    public List<CourseVO> transCourseA(String input){
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


    public List<SelectVO> transSelect(String input){
        List<SelectVO> selectList=new ArrayList<SelectVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                SelectVO vo=new SelectVO();
                vo.setCid((String)obj.get("cid"));
                vo.setSid((String)obj.get("id"));
                selectList.add(vo);
            }

        }

        return selectList;
    }

}
