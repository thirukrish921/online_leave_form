package fsdp.level2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST")

public class Request {
	@Id
	@Column(name = "REQ_ID")
	private int requestId;
	@Column(name = "ST_ID")
	private int studentId;
	@Column(name = "FROM_DATE_TIME")
	private String fromDateTime;
	@Column(name = "TO_DATE_TIME")
	private String toDateTime;
	@Column(name = "LEAVE_OD")
	private String leaveOd;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "MS")
	private String mentorStatus;
	@Column(name = "CPS")
	private String chairPersonStatus;
	@Column(name = "HS")
	private String hodStatus;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public String getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(String toDateTime) {
		this.toDateTime = toDateTime;
	}
	public String getLeaveOd() {
		return leaveOd;
	}
	public void setLeaveOd(String leaveOd) {
		this.leaveOd = leaveOd;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMentorStatus() {
		return mentorStatus;
	}
	public void setMentorStatus(String mentorStatus) {
		this.mentorStatus = mentorStatus;
	}
	public String getChairPersonStatus() {
		return chairPersonStatus;
	}
	public void setChairPersonStatus(String chairPersonStatus) {
		this.chairPersonStatus = chairPersonStatus;
	}
	public String getHodStatus() {
		return hodStatus;
	}
	public void setHodStatus(String hodStatus) {
		this.hodStatus = hodStatus;
	}
}
