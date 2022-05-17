package com.learn.springmybatis.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.util.CollectionUtils;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUtil {
	//add by liusen start 20200716 增加日志的打印
	private static Logger log = LoggerFactory.getLogger(HttpUtil.class);
	//add by liusen end 20200716 增加日志的打印
	/**
	 * 发起https请求并获取结果
	 * @param requestUrl 地址
	 * @param requestMethod GET/POST
	 * @param outputStr 发送的数据
	 * @param encoding 编码
	 * @param time 请求连接超时时间
	 * @return
	 */
	public static String httpRequest(String requestUrl, String requestMethod, 
			String outputStr, String encoding, Integer time) throws Exception{
		String jsonObject = null;
		OutputStream outputStream = null;
		BufferedReader bufferedReader = null;
		try {
			StringBuffer buffer = new StringBuffer();
			URL url = new URL(requestUrl);
			HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
			/**
			 * 设置连接超时
			 */
			if(time != null && time != 0){
				httpUrlConn.setConnectTimeout(time);
			}
			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			
			// 设置请求方式（GET/POST）
			httpUrlConn.setRequestMethod(requestMethod);
			httpUrlConn.setRequestProperty("Content-Type", "application/json");
			if ("GET".equalsIgnoreCase(requestMethod))
				httpUrlConn.connect();
			// 当有数据需要提交时
			if (outputStr != null) {
				outputStream = httpUrlConn.getOutputStream();
				// 注意编码格式，防止中文乱码
				outputStream.write(outputStr.getBytes(encoding));
				outputStream.close();
				outputStream= null;
			}
			// 将返回的输入流转换成字符串
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, encoding);
			bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			bufferedReader = null;
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			httpUrlConn.disconnect();
			jsonObject = buffer.toString();
		} catch(MalformedURLException e){
			e.printStackTrace();
			throw new Exception("地址不符合http协议规范");
		} 
		catch (ConnectException ce) {
			System.out.println("连接异常");
			ce.printStackTrace();
			throw new Exception("无法建立连接");
		} catch (FileNotFoundException e) {
			System.out.println("服务端无数据返回");
			e.printStackTrace();
			throw new Exception("服务端无数据返回");
		} catch (SocketTimeoutException e) {
			System.out.println("连接超时了");
			e.printStackTrace();
			throw new Exception("连接超时");
		} catch (Exception e) {
			System.out.println("未知异常");
			e.printStackTrace();
		} finally{
			try {
				if(outputStream != null){
					outputStream.close();
				}
				if(bufferedReader != null){
					bufferedReader.close();
				}
			} catch (Exception e) {
			}
		}
		return jsonObject;
	}
	/**
	 * 调用车妈妈
	 * lipeiran 20210222
	 * @param url
	 * @param data
	 * @param contentType
	 * @param header
	 * @return
	 */
	public static String execute(String url, String data, String contentType, Header[] header) {
		String respContent = null;
		// http请求
		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
		cm.setDefaultMaxPerRoute(80);// 设置每个路由基础的连接
		cm.setMaxTotal(200);//设置最大连接数//cm.setMaxPerRoute(new HttpRoute(httpHost), maxRoute);// 设置目标主机的最大连接数
		CloseableHttpClient client = HttpClients.custom().setConnectionManager(cm).build();

		HttpPost httpPost = new HttpPost(url);
//		CloseableHttpClient client = HttpClients.createDefault();

		StringEntity entity = new StringEntity(data, ContentType.create(contentType, Charset.forName("UTF-8")));
		httpPost.setEntity(entity);
		httpPost.setHeaders(header);
		HttpResponse resp;
		try {
			resp = client.execute(httpPost);
//			if (resp.getStatusLine().getStatusCode() == 200) {
			HttpEntity he = resp.getEntity();
			respContent = EntityUtils.toString(he, Charset.forName("UTF-8"));
//			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error("execute  ",e);
		}finally{
			try{
				if(client!=null){
					client.close();
				}
				if(cm!=null){
					cm.close();
				}
			}
			catch(IOException ex){
				log.error("e ",ex);
			}
		}

		return respContent;
	}


	/**
	 * lipeiran
	 * 调用车妈妈接口
	 * 20210223
	 * @param url
	 * @param headers
	 * @param paramMaps
	 * @return
	 */
	public static String doPost(String url, Header[] headers, Map<String, Object> paramMaps) {
		String result = null;
		HttpPost httpPost = new HttpPost(url);
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
		try {
			httpPost.setHeaders(headers);
			List<NameValuePair> pairList = new ArrayList<>();
			for (Map.Entry<String, Object> entry : paramMaps.entrySet()) {
				String key = entry.getKey();
				String value = (String) entry.getValue();
				pairList.add(new BasicNameValuePair(key, value));
			}
			UrlEncodedFormEntity urlEntity = new UrlEncodedFormEntity(pairList, "UTF-8");
			httpPost.setEntity(urlEntity);
			HttpResponse resp = closeableHttpClient.execute(httpPost);


//	            result = EntityUtils.toString(resp.getEntity(), "UTF-8").trim();
//	            if(resp.getStatusLine().getStatusCode()==400){
//	            	 result = EntityUtils.toString(resp.getEntity(), "UTF-8").trim();
//			            System.out.println("====400");
//			            System.out.println(result);
//	            }
			if (resp.getStatusLine().getStatusCode() == org.apache.http.HttpStatus.SC_OK) {

				result = EntityUtils.toString(resp.getEntity(), "UTF-8").trim();

			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Cmm doPost "+e);
		} finally {
			httpPost.abort();
			try {
				closeableHttpClient.close();
			} catch (Exception e2) {
				throw new RuntimeException("Close CloseableHttpClient failed.", e2);
			}
		}

		return result;
	}

	
	 /**
     * web post 功能模拟
     *
     * @param url 网页地址
     * @param postdata post的数据
     * @return
     * @throws IOException
     * @author： LiuBo
     * 
     */
    public static String post(String url, String postdata) throws IOException {
        URL weburl = new URL(url);
        URLConnection connection = weburl.openConnection();
        connection.addRequestProperty("content-type", "text/html");
        connection.setDoOutput(true);
        OutputStreamWriter out = new OutputStreamWriter(connection
                .getOutputStream());
        out.write(postdata);
        out.flush();
        out.close();
        String sCurrentLine;
        String sTotalString;
        sCurrentLine = "";
        sTotalString = "";
        InputStream l_urlStream;
        l_urlStream = connection.getInputStream();
        BufferedReader l_reader=null;
        try {
        	l_reader = new BufferedReader(new InputStreamReader(
                     l_urlStream, "utf-8"));
             while ((sCurrentLine = l_reader.readLine()) != null) {
                 sTotalString += sCurrentLine;
             }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(l_reader!=null) {				
				l_reader.close();
			}
		}
       
        return sTotalString;
    }
	/**
	 * http 请求设置连接时间和读取时间
	 * @author liusen
	 * @date 20200713
	 * @param obj
	 * @param url
	 * @return
	 */
	public static String postData(String obj, String url, int socketTimeout, int connectTimeout) {
		String retSrc = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			RequestConfig config = RequestConfig.custom()
					.setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();  // 设置请求和传输超时时间
			httpPost.setConfig(config);
			StringEntity se = new StringEntity(obj,"utf-8");
			httpPost.setEntity(se);
			// 发送请求
			HttpResponse httpResponse = httpClient.execute(httpPost);
			retSrc = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
			return retSrc;
		} catch (Exception e) {
			log.error("http post error",e );
			return null;
		} finally {
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (Exception e) {
					log.error("close connection error",e );
				}
			}
		}
	}

	/**
	 * http 请求设置连接时间和读取时间
	 * @author caokuo
	 * @date 20201208
	 * @param obj
	 * @param url
	 * @return
	 */
	public static String sendPost(String obj, String url, int socketTimeout, int connectTimeout) {
		String retSrc = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			RequestConfig config = RequestConfig.custom()
					.setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();  // 设置请求和传输超时时间
			httpPost.setConfig(config);
			StringEntity se = new StringEntity(obj,"utf-8");
			httpPost.setEntity(se);
			httpPost.setHeader("Content-Type","application/json");
			// 发送请求
			HttpResponse httpResponse = httpClient.execute(httpPost);
			retSrc = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
			return retSrc;
		} catch (Exception e) {
			log.error("http post error",e );
			return null;
		} finally {
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (Exception e) {
					log.error("close connection error",e );
				}
			}
		}
	}
	/**
	 * http 请求设置连接时间和读取时间
	 * @author caokuo
	 * @date 20201208
	 * @param obj
	 * @param url
	 * @return
	 */
	public static String sendHttpPost(String obj, String url, int socketTimeout, int connectTimeout,String header) {
		String retSrc = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			RequestConfig config = RequestConfig.custom()
					.setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();  // 设置请求和传输超时时间
			httpPost.setConfig(config);
			StringEntity se = new StringEntity(obj,"utf-8");
			httpPost.setEntity(se);
			httpPost.setHeader("Content-Type",header);
			// 发送请求
			HttpResponse httpResponse = httpClient.execute(httpPost);
			retSrc = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
			return retSrc;
		} catch (Exception e) {
			log.error("http post error",e );
			return null;
		} finally {
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (Exception e) {
					log.error("close connection error",e );
				}
			}
		}
	}

	/**
	 * http 请求设置连接时间和读取时间
	 * @author houruihua
	 * @date 20210205
	 * @param url
	 * @return
	 */
	public static String sendHttpPostForm(Map<String,String> params, String url, int socketTimeout, int connectTimeout,String header,String token) throws IOException {
		String result = null;
		CloseableHttpClient client = null;
		CloseableHttpResponse response = null;
		try {
			List<BasicNameValuePair> parames = new ArrayList<>();
			Set<String> keys = params.keySet();
			for(String key:keys){
				parames.add(new BasicNameValuePair(key, (String) params.get(key)));
			}
			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(new UrlEncodedFormEntity(parames, "UTF-8"));
			if(!StringUtils.isEmpty(token)){
				httpPost.addHeader("Access-Token",token);
			}
			client = HttpClients.createDefault();
			response = client.execute(httpPost);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (response != null) {
				response.close();
			}
			if (client != null) {
				client.close();
			}
		}
		return result;
	}

	public static String sendPostAiRisk(String obj, String url, int socketTimeout, int connectTimeout, Map<String, String> headerMap) {
		String result = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(url);
			RequestConfig config = RequestConfig.custom()
					.setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();  // 设置请求和传输超时时间
			httpPost.setConfig(config);
			StringEntity se = new StringEntity(obj,"utf-8");
			httpPost.setEntity(se);
			if(!CollectionUtils.isEmpty(headerMap)) {
				headerMap.forEach(httpPost::setHeader);
			}
			// 发送请求
			HttpResponse httpResponse = httpClient.execute(httpPost);
			result = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
			return result;
		} catch (Exception e) {
			log.error("http post error",e );
			return null;
		} finally {
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (Exception e) {
					log.error("close connection error",e );
				}
			}
		}
	}
}
