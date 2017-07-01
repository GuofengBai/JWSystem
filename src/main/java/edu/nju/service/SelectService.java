package edu.nju.service;

import edu.nju.vo.SelectVO;

import java.util.List;

/**
 * Created by xinyu on 2017/7/1.
 */
public interface SelectService {

    public List<SelectVO> getAllSelect(String input);

    public void select(SelectVO vo);

    public void drop(SelectVO vo);

}
