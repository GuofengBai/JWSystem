package edu.nju.service.impl;

import edu.nju.service.SelectService;
import edu.nju.util.UtilTool;
import edu.nju.vo.SelectVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
@Service
public class SelectServiceImpl implements SelectService{
    public List<SelectVO> transSelect(String a,String b,String c){
        List<SelectVO> selectList=new ArrayList<SelectVO>();

        List<SelectVO> selectListA=transSelectA(a);
        List<SelectVO> selectListB=transSelectB(b);
        List<SelectVO> selectListC=transSelectC(c);
        for(int i=0;i<selectListA.size();i++){
            selectList.add(selectListA.get(i));
        }
        for(int i=0;i<selectListB.size();i++){
            selectList.add(selectListB.get(i));
        }
        for(int i=0;i<selectListC.size();i++){
            selectList.add(selectListC.get(i));
        }

        return selectList;
    }
    

    public List<SelectVO> transSelectA(String input){
        List<SelectVO> selectList=new ArrayList<SelectVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                SelectVO vo=new SelectVO();
                vo.setCid((String)obj.get("cid"));
                vo.setSid((String)obj.get("sid"));
                selectList.add(vo);
            }

        }

        return selectList;
    }

    public List<SelectVO> transSelectB(String input){
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

    public List<SelectVO> transSelectC(String input){
        List<SelectVO> selectList=new ArrayList<SelectVO>();
        JSONArray jsonArray = JSONArray.fromObject(input);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject obj = jsonArray.getJSONObject(i);
                SelectVO vo=new SelectVO();
                vo.setCid((String)obj.get("0"));
                vo.setSid((String)obj.get("1"));
                selectList.add(vo);
            }

        }

        return selectList;
    }

    @Override
    public List<SelectVO> getAllSelect() {
        String a,b,c;
        a= UtilTool.getAllSelectedByA();
        b=UtilTool.getAllSelectedByB();
        c=UtilTool.getAllSelectedByC();

        return transSelect(a,b,c);
    }

    @Override
    public void select(SelectVO vo) {
        if(vo.getCid().charAt(0)=='a'){
            UtilTool.selectCourseByA(vo.getCid(),vo.getSid());
        }else if(vo.getCid().charAt(0)=='b'){
            UtilTool.selectCourseByB(vo.getCid(),vo.getSid());
        }else {
            UtilTool.selectCourseByC(vo.getCid(),vo.getSid());
        }


    }

    @Override
    public void drop(SelectVO vo) {
        if(vo.getCid().charAt(0)=='a'){
            UtilTool.dropCourseByA(vo.getCid(),vo.getSid());
        }else if(vo.getCid().charAt(0)=='b'){
            UtilTool.dropCourseByB(vo.getCid(),vo.getSid());
        }else {
            UtilTool.dropCourseByC(vo.getCid(),vo.getSid());
        }

    }
}
