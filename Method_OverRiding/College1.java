class College1{
	Per getPer(){
	return new Per();
	}
}
	
class Exam extends College1{
	Stu getStu(){
	return new Stu();
	}
}
	
class Invigi extends College1{
	Fac getFac(){
	return new Fac();
	}
}