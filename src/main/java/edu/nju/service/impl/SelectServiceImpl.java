package edu.nju.service.impl;

import edu.nju.service.SelectService;
import edu.nju.vo.SelectVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
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
        a=UtilTool.getSelectByA();
        b=UtilTool.getSelectByB();
        c=UtilTool.getSelectByC();

        return transSelect(a,b,c);
    }

    @Override
    public void select(SelectVO vo) {
        UtilTool.selectByA(vo.getSid(),vo.getCid());
    }

    @Override
    public void drop(SelectVO vo) {
        UtilTool.dropByA(vo.getSid(),vo.getCid());
    }
}
