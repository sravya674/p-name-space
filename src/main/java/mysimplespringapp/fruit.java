package mysimplespringapp;

public class fruit {

        public fruit() {};
        private String myName;

    	public String getMyName() {
    		return myName;
    	}

    	public void setMyName(String myName) {
    		this.myName = myName;
    	}
    	
    	public fruit(String pName)
    	{
    		setMyName(pName);
    	}
		public String talkaboutyourself() {
	
			String speech= "Hello i am a fruit";
		    if( myName != null  && myName != "")  
		    	speech = speech +"my name is "+ myName ;
		    return speech;
	}

}
