package insa.board.notice.dto;

import java.sql.Date;

public class NoticeDto {   //�������� dto
 
	private int num;               //�� ��ȣ
	private String title;           //�� ����
	private String content;     //�� ����
	private String fileName;    //�����̸�
	private Date date;          //�ۼ���¥
	private String id;            //���ۼ��� 
	
	
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