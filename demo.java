@RestController
public class demo{
	@RequestMapping("/")
	String home(){
		"hello Worid!"
	}

}
public static void main(String[] args){
  SpringApplication.run(demo.class,args);
}
