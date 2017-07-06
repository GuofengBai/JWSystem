package test;

import edu.nju.service.CourseService;
import edu.nju.service.impl.CourseServiceImpl;
import edu.nju.util.UtilTool;

/**
 * Created by Administrator on 2017/7/5.
 */
public class test {
    public static void main(String args[]){
        UtilTool.init();
        //System.out.println(UtilTool.httpGet("http://172.17.245.220:80/jwb/getAll"));
        CourseService courseService = new CourseServiceImpl();
        courseService.transCourse("[{\"cid\":\"a001\",\"cname\":\"微积分1\",\"point\":3,\"teacher\":\"老师1\",\"place\":\"教201\",\"share\":1},{\"cid\":\"a002\",\"cname\":\"离散数学\",\"point\":5,\"teacher\":\"老师2\",\"place\":\"教102\",\"share\":1},{\"cid\":\"a003\",\"cname\":\"计组\",\"point\":3,\"teacher\":\"老师3\",\"place\":\"教101\",\"share\":1},{\"cid\":\"a004\",\"cname\":\"大学英语\",\"point\":2,\"teacher\":\"老师4\",\"place\":\"逸夫楼201\",\"share\":1},{\"cid\":\"a005\",\"cname\":\"游泳\",\"point\":3,\"teacher\":\"老师5\",\"place\":\"体育馆\",\"share\":1},{\"cid\":\"a006\",\"cname\":\"软工1\",\"point\":3,\"teacher\":\"老师6\",\"place\":\"教501\",\"share\":1},{\"cid\":\"a007\",\"cname\":\"j2ee\",\"point\":3,\"teacher\":\"老师7\",\"place\":\"教301\",\"share\":1},{\"cid\":\"a008\",\"cname\":\"嵌入式\",\"point\":2,\"teacher\":\"老师8\",\"place\":\"教205\",\"share\":1},{\"cid\":\"a009\",\"cname\":\"羽毛球\",\"point\":3,\"teacher\":\"老师9\",\"place\":\"体育馆\",\"share\":1},{\"cid\":\"a010\",\"cname\":\"编译原理\",\"point\":2,\"teacher\":\"老师10\",\"place\":\"教101\",\"share\":1}]", "[]", "[]");
    }
}
