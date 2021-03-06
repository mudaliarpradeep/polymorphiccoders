package com.polymorphiccoders;

import static spark.Spark.setIpAddress;
import static spark.Spark.setPort;
import static spark.SparkBase.staticFileLocation;

public class Bootstrap {
	 private static final String IP_ADDRESS = System.getenv("OPENSHIFT_DIY_IP") != null ? System.getenv("OPENSHIFT_DIY_IP") : "localhost";
	    private static final int PORT = System.getenv("OPENSHIFT_DIY_PORT") != null ? Integer.parseInt(System.getenv("OPENSHIFT_DIY_PORT")) : 8080;
	 
	    public static void main(String[] args) throws Exception {
	        setIpAddress(IP_ADDRESS);
	        setPort(PORT);
	        staticFileLocation("/public");
	        new Resource(new Service());
	    }
	 
	    
}
