package insa.board.notice.dto;

import java.sql.Date;

public class NoticeDto {   //공지사항 dto
 
	private int num;               //글 번호
	private String title;           //글 제목
	private String content;     //글 내용
	private String fileName;    //파일이름
	private Date date;          //작성날짜
	private String id;            //글작성자 
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

	
	
}