package insa.board.notice.dto;

import java.sql.Date;

public class NoticeDto {   //공지사항 dto
 
	private int notice_num;               //글 번호
	private String notice_title;           //글 제목
	private String notice_content;     //글 내용
	private String notice_fileName;    //파일이름
	private Date notice_date;          //작성날짜
	private String notice_id;            //글작성자 
	
	
	
	public NoticeDto(int notice_num, String notice_title,
			String notice_content, String notice_fileName, Date notice_date,
			String notice_id) {
		super();
		this.notice_num = notice_num;
		this.notice_title = notice_title;
		this.notice_content = notice_content;
		this.notice_fileName = notice_fileName;
		this.notice_date = notice_date;
		this.notice_id = notice_id;
	}
	public int getNotice_num() {
		return notice_num;
	}
	public void setNotice_num(int notice_num) {
		this.notice_num = notice_num;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_fileName() {
		return notice_fileName;
	}
	public void setNotice_fileName(String notice_fileName) {
		this.notice_fileName = notice_fileName;
	}
	public Date getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}
	public String getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}
	@Override
	public String toString() {
		return "NoticeDto [notice_num=" + notice_num + ", notice_title="
				+ notice_title + ", notice_content=" + notice_content
				+ ", notice_fileName=" + notice_fileName + ", notice_date="
				+ notice_date + ", notice_id=" + notice_id + "]";
	}

	
	
	
	
}