@RestController
class ThisWillActuallyRun{
	@RequestMapping("/")
	String home(){
		"hello Worid!"
	}
}