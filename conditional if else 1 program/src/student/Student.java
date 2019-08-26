package student;

public class Student {
	private int id;
	private String Name;
	private float score;
	private char grade;
	
	public Student(int id, String name, Float score, char grade)
	{
		this.id=id;
		this.score=score;
		this.grade=grade;
		this.Name=name;
	}
		public void setid(int id) {
			this.id=id;
		}
		public void setname(String name) {
			Name=name;
		}
		public void setscore(float score) {
			this.score=score;
		}
		public void setgrade(char grade) {
			this.grade=grade;
		}
		public int getid() {
			return id;
		}
		public String getname() {
			return Name;
		}
		public float getscore() {
			return score;
		}
		public char getgrade() {
			return grade;
		}
		
	}
