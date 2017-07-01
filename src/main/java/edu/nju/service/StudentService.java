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

public interface StudentService {
    public List<StudentVO> GetAllStudents();

    public List<StudentVO> transStudent(String a, String b, String c);

}
