class College1{
	Per getPer(){
	return new Per();
	}
}
	
class Exam extends College1{
	Stu getPer(){
	return new Stu();
	}
}
	
class Invigi extends College1{
	Fac getPer(){
	return new Fac();
	}
}