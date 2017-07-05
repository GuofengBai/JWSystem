package edu.nju.service;

import edu.nju.vo.SelectVO;

import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
public interface SelectService {

    public List<SelectVO> transSelect(String a, String b, String c);

    public List<SelectVO> getAllSelect();

    public void select(SelectVO vo);

    public void drop(SelectVO vo);

}
