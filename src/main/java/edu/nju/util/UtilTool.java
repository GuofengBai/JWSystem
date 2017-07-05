package edu.nju.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.*;
import java.net.URI;

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
		ipA="http://"+ipA;
		ipB="http://"+ipB;
		ipC="http://"+ipC;
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

	public static String httpGet(String url) {
		// get请求返回结果
		BufferedReader in = null;

		String content = null;
		try {
			// 定义HttpClient
			HttpClient client = new DefaultHttpClient();
			// 实例化HTTP方法
			HttpGet request = new HttpGet();
			request.setURI(new URI(url));
			HttpResponse response = client.execute(request);

			in = new BufferedReader(new InputStreamReader(response.getEntity()
					.getContent()));
			StringBuffer sb = new StringBuffer("");
			String line = "";
			String NL = System.getProperty("line.separator");
			while ((line = in.readLine()) != null) {
				sb.append(line + NL);
			}
			in.close();
			content = sb.toString();
		} finally {
			if (in != null) {
				try {
					in.close();// 最后要关闭BufferedReader
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return content;
		}
	}

}
