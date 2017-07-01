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

    @Override
    public List<SelectVO> getAllSelect(String input) {
        return null;
    }

    @Override
    public void select(SelectVO vo) {

    }

    @Override
    public void drop(SelectVO vo) {

    }
}
