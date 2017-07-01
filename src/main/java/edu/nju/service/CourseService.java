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

public interface CourseService {
    public List<CourseVO> transCourse(String a, String b, String c);

    public List<CourseVO> getAllCourse();

    public List<CourseVO> getSelectedCourse(String id);

    public List<CourseVO> getUnSelectedCourse(String id);

}
