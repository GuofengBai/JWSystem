package edu.nju.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by lenovo on 2017/7/1.
 */
public class UtilTool {
	public static String ipA;
	public static String ipB;
	public static String ipC;

	public static void init() {
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("ip.txt"));
			ipA = bf.readLine();
			ipB = bf.readLine();
			ipC = bf.readLine();
			bf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public static String getAllCourseByA() {
		return httpGet(ipA + "/sysA/getallcourse");

	}

	public static String getAllCourseByB() {
		return httpGet(ipB + "/jwb/getAll");
	}

	public static String getAllCourseByC() {
		return httpGet((ipC + "/jwc/getCourse"));
	}

	public static String getAllStuByA() {
		return httpGet(ipA + "sysA/getallstu");
	}

	public static String getAllStuByB() {
		return httpGet(ipB + "/api/jwb/getStudents");
	}

	public static String getAllStuByC() {
		return httpGet(ipC + "/jwc/getStudent");
	}

	public static String getAllSelectedByA() {
		return httpGet(ipA + "sysA/getallselected");
	}

	public static String getAllSelectedByB() {
		return httpGet(ipB + "jwb/getAllSelect");
	}

	public static String getAllSelectedByC() {
		return httpGet(ipC + "/jwc/getElective");
	}

	public static String getSelectedByA(String sid) {
		return httpGet(ipA + "sysA/getselected/" + sid);
	}

	public static String getSelectedByB(String sid) {
		return httpGet(ipB + "/api/jwb/getSelect/" + sid);
	}

	public static String getSelectedByC(String sid) {
		return httpGet(ipC + "/jwc/getUserElective/" + sid);
	}

	public static String getUnselectedByA(String sid) {
		return httpGet(ipA + "sysA/getunselected/" + sid);
	}

	public static String getUnselectedByB(String sid) {
		return httpGet(ipB + "/api/jwb/getUnSelect/" + sid);
	}

	public static String getUnselectedByC(String sid) {
		return httpGet(ipC + "/jwc/getUserNotElective/" + sid);
	}

	public static String selectCourseByA(String cid, String sid) {
		return httpGet(ipA + "/SysA/select/" + cid + "/" + sid);
	}

	public static String selectCourseByB(String cid, String sid) {
		return httpGet(ipB + "/api/jwb/select/" + sid + "/" + cid);

	}

	public static String selectCourseByC(String cid, String sid) {
		return httpGet(ipC + "/jwc/remoteElective/" + sid + "/" + cid);
	}

	public static String dropCourseByA(String cid, String sid) {
		return httpGet(ipA + "/sysA/cancel/" + cid + "/" + sid);
	}

	public static String dropCourseByB(String cid, String sid) {
		return httpGet(ipB + "/api/jwb/quit/" + sid + "/" + cid);
	}

	public static String dropCourseByC(String cid, String sid) {
		return httpGet(ipC + "/jwc/remoteUnElective/" + sid + "/" + cid);
	}

	public static String httpGet(String urlstr) {
		// get请求返回结果
		String strResult = "";
		try {
			DefaultHttpClient client = new DefaultHttpClient();
			// 发送get请求
			URL url = new URL(urlstr);
			URI uri = null;
			try {
				uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			HttpGet request = new HttpGet(uri);
			HttpResponse response = client.execute(request);

			/** 请求发送成功，并得到响应 **/
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				/** 读取服务器返回过来的json字符串数据 **/
				strResult = EntityUtils.toString(response.getEntity());
			}
		} catch (IOException e) {
			System.out.println("get请求提交失败:" + urlstr);
		}
		return strResult;
	}

}
