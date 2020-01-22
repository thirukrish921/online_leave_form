package fsdp.level2.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DETAILS")

public class StudentDetails {
	@Id
	@Column(name = "SD_ID")
	private int studenDepartmentId;
	@Column(name = "STD_ID")
	private int studentId;
	@Column(name = "STD_MENTOR_ID")
	private int studentMentor;
	@Column(name = "STD_CP_ID")
	private int studentChairpersonId;
	@Column(name = "STD_HOD_ID")
	private int studentHodId;
	@Column(name = "STD_SEM")
	private int studentSemester;
	@Column(name = "STD_STATUS")
	private int studentStatus;
	public int getStudenDepartmentId() {
		return studenDepartmentId;
	}
	public void setStudenDepartmentId(int studenDepartmentId) {
		this.studenDepartmentId = studenDepartmentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentMentor() {
		return studentMentor;
	}
	public void setStudentMentor(int studentMentor) {
		this.studentMentor = studentMentor;
	}
	public int getStudentChairpersonId() {
		return studentChairpersonId;
	}
	public void setStudentChairpersonId(int studentChairpersonId) {
		this.studentChairpersonId = studentChairpersonId;
	}
	public int getStudentHodId() {
		return studentHodId;
	}
	public void setStudentHodId(int studentHodId) {
		this.studentHodId = studentHodId;
	}
	public int getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(int studentSemester) {
		this.studentSemester = studentSemester;
	}
	public int getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(int studentStatus) {
		this.studentStatus = studentStatus;
	}
	
}
