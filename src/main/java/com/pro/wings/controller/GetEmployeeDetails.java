package com.pro.wings.controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GetEmployeeDetails {

	public static void main(String[] args) {
		
		String url ="http://localhost:9494/IntegratedSpringAndHibernate/employee/5";
		
		CloseableHttpClient client = HttpClients.createDefault();
		
		try {
			
			HttpGet get = new HttpGet(url);
			
			CloseableHttpResponse response = client.execute(get);
			
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {			
				String employee = EntityUtils.toString(entity);
				System.out.println(employee);
			}
			
		} catch (Exception e) {
			System.out.println("Unable to get entity");
			e.printStackTrace();

		}
		
	}
	
}
