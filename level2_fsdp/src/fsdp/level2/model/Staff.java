package fsdp.level2.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STAFF")

public class Staff {
	@Id
	@Column(name = "STF_ID")
	private int staffId;
	@Column(name = "STF_NAME")
	private String staffName;
	@Column(name = "STF_PASSWORD")
	private String staffPassword;
	@Column(name = "STF_EMAIL")
	private String staffEmail;
	@Column(name = "STF_DEPT_ID")
	private int staffDepartment;
	@Column(name = "STF_STATUS")
	private int staffStatus;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public int getStaffDepartment() {
		return staffDepartment;
	}
	public void setStaffDepartment(int staffDepartment) {
		this.staffDepartment = staffDepartment;
	}
	public int getStaffStatus() {
		return staffStatus;
	}
	public void setStaffStatus(int staffStatus) {
		this.staffStatus = staffStatus;
	}
	
}
