package org.spring.boot.starter.controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class CSVController {
	
	@RequestMapping("csvfileservice/{inputvariable}")
	public
	ResponseEntity<Resource> single1(@PathVariable String inputvariable) throws FileNotFoundException {
				
		InputStreamResource resource = new InputStreamResource(new FileInputStream("/Users/anmolsinghsuri/eclipse-workspace/Test/src/main/resources/test.csv"));
		
	    return ResponseEntity.ok()
	    		.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=test.csv")
	            .contentType(MediaType.parseMediaType("application/csv"))
	            .body(resource);
	}
}
