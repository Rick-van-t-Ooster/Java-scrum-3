package hoofdstuk13.quiz3;

abstract class MijnAbstract {
	String str = "N";
	
	MijnAbstract(){
		this("O");
		str += "L";
	}
	MijnAbstract(String str){
		//Door dit te veranderen van str += str naar this.str += str kan this("O") in werking gaan dus krijg je NOL27 ipv NL27
		this.str += str;
	}
}
