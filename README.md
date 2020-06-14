# spring-boot-jpa-RestAPI


PreRequisites
 
        Install JDK 1.8 or above
        
        Install Maven or Gradle and H2 as follows below 
        
             https://github.com/somisettyv/venly_spring-boot-jpa-h2
             
  Execute using Gradel:
 
          ./gradlew clean bootRun
          
   Notes:
   
      @Controller
     public class EmployeeController 
   
      GET :
      	@RequestMapping(value = "/org/dept/{deptNo}/employee", method = RequestMethod.GET, produces = {
      			MediaType.APPLICATION_JSON_VALUE })
    
     POST :
      	//@PostMapping("org/dept/{deptNo}/employee")
    @RequestMapping(value="/org/dept/{deptNo}/employee", method=RequestMethod.POST, produces= {
        MediaType.APPLICATION_JSON_VALUE
    })
      
     PUT :
       
        	
	@RequestMapping(value = "", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> updateEmployee(@PathVariable Long deptNo, @PathVariable Long empNo,
  
  
  JDK 1.8 . Lamda Expressions and Streams
  
         List<EmployeeDto> employeeDtos = employees.stream().map(p -> new EmployeeDto(p)).collect(Collectors.toList());
  
  
  Docker :
  
    Building Image :
        
	 Docker build -t somisettyv/springjpa .
	 
    Check Image    :
        
	 Docker Images 
	 
    Get the Container List 
       
         Docker ps -a
	 
    Run Docker Container :
       
         Docker run -p 8080:8080 somisettyv/springjpa
	 
	 
    Push to Docker hub: 
    
          docker login --username=somisettyv --email=somisettyv@yahoo.com

          docker tag memberservice somisettyv/springjpa

          docker push somisettyv/springjpa

          docker rmi -f memberservice
	  
	  Get the Image and Run

             docker run -p 8889:8080 somisettyv/springjpa
	 
	 
	 
  
  
