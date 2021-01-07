package tpdeportivo

class UserController {

    def index() { }

    def login(){

    	if(params.username =="admin" && params.password=="pass"){
    		request.withFormat {
	            form multipartForm {
	                
	                redirect views:home
	            }
	            '*'{ render status: NOT_FOUND }
        	}
    	}
    }
}
