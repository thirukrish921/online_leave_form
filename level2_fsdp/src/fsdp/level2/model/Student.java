package fsdp.level2.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")

public class Student {
	@Id
	@Column(name = "ST_ID")
	private int studentId;
	@Column(name = "ST_NAME")
	private String studentName;
	@Column(name = "ST_PASSWORD")
	private String studentPassword;
	@Column(name = "ST_DEPT_ID")
	private String studentDepartmentId;
	@Column(name = "ST_YEAR")
	private String studentYear;
	@Column(name = "ST_SEM")
	private int studentSemester;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentDepartmentId() {
		return studentDepartmentId;
	}
	public void setStudentDepartmentId(String studentDepartmentId) {
		this.studentDepartmentId = studentDepartmentId;
	}
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	public int getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(int studentSemester) {
		this.studentSemester = studentSemester;
	}
	
}
