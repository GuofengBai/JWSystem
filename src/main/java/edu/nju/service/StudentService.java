package edu.nju.service;

import edu.nju.vo.StudentVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/6/12.
 */
@Service
public class StudentService {

    public List<StudentVO> transStudentA(String input){
        List<StudentVO> studentList=new ArrayList<StudentVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                StudentVO vo=new StudentVO();
                vo.setId((String)obj.get("id"));
                vo.setName((String)obj.get("name"));
                vo.setMajor((String)obj.get("major"));

                studentList.add(vo);
            }

        }

        return studentList;
    }

    public List<StudentVO> transStudentB(String input){
        List<StudentVO> studentList=new ArrayList<StudentVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                StudentVO vo=new StudentVO();
                vo.setId((String)obj.get("id"));
                vo.setName((String)obj.get("name"));
                vo.setMajor((String)obj.get("major"));

                studentList.add(vo);
            }

        }

        return studentList;
    }

    public List<StudentVO> transStudentC(String input){
        List<StudentVO> studentList=new ArrayList<StudentVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                StudentVO vo=new StudentVO();
                vo.setId((String)obj.get("0"));
                vo.setName((String)obj.get("1"));
                vo.setMajor((String)obj.get("2"));

                studentList.add(vo);
            }

        }

        return studentList;
    }
}
