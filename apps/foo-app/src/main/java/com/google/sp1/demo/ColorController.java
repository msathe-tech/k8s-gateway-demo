package com.google.sp1.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@RestController
public class ColorController {
    
    HashMap<String, String> map = new HashMap<>();
    
    @GetMapping("/metadata")
    public Map<String, String> metadata() {
        
        if (map.isEmpty()) {
            
            map.put("color", "Beige");
            map.put("Node_Name", System.getenv().get("NODE_NAME"));
            map.put("Host_IP", System.getenv().get("HOST_IP"));
            map.put("Pod_IP", System.getenv().get("POD_IP"));
            map.put("Pod_Namespace", System.getenv().get("POD_NAMESPACE"));
            map.put("Pod_Name", System.getenv().get("POD_NAME"));
            map.put("Service_Account", System.getenv().get("POD_SERVICE_ACCOUNT"));
            
        }
        return map;
    }

}
