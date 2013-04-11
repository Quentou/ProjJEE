package qmark

class Teacher extends Account {
	static hasMany = [stugroups:Stugroup]
	
    static constraints = {
    }
}
