package edu.nju.service.impl;

import edu.nju.service.StudentService;
import edu.nju.util.UtilTool;
import edu.nju.vo.StudentVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
@Service
public class StudentServiceImpl implements StudentService{

    public List<StudentVO> GetAllStudents() {
        String a,b,c;
        a=UtilTool.getAllStuByA();
        b=UtilTool.getAllStuByB();
        c= UtilTool.getAllStuByC();

        return transStudent(a,b,c);
    }

    public List<StudentVO> transStudent(String a, String b, String c) {
        List<StudentVO> studentList=new ArrayList<StudentVO>();
        List<StudentVO> studentListA=transStudentA(a);
        List<StudentVO> studentListB=transStudentB(b);
        List<StudentVO> studentListC=transStudentC(c);
        for(int i=0;i<studentListA.size();i++){
            studentList.add(studentListA.get(i));
            System.out.println(studentListA.get(i).toString());
        }
        for(int i=0;i<studentListB.size();i++){
            studentList.add(studentListB.get(i));
            System.out.println(studentListB.get(i).toString());
        }
        for(int i=0;i<studentListC.size();i++){
            studentList.add(studentListC.get(i));
            System.out.println(studentListC.get(i).toString());
        }


        return studentList;
    }


    public List<StudentVO> transStudentA(String input){
        List<StudentVO> studentList=new ArrayList<StudentVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                StudentVO vo=new StudentVO();
                vo.setId((String)obj.get("sid"));
                vo.setName((String)obj.get("name"));
                vo.setMajor((String)obj.get("college"));
                vo.setGender((String)obj.get("sex"));

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
                vo.setGender((String)obj.get("gender"));
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
                JSONArray obj = jsonArray.getJSONArray(i);
                StudentVO vo=new StudentVO();
                vo.setId((String) obj.get(0));
                vo.setName((String) obj.get(1));
                vo.setMajor((String) obj.get(3));
                vo.setGender((String) obj.get(2));
                studentList.add(vo);
            }

        }

        return studentList;
    }
}
