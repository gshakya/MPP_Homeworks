package week1.extraCredit1;

public class Magazine extends AItem {

	private int issueNo;
	private int limit;

	public Magazine(String title, int issueNo , int limit) {
		super(title);
		this.issueNo = issueNo;
		this.limit = limit;
	}

	public int getIssueNo() {
		return issueNo;
	}

	@Override
	public int getLimit() {
		return limit;
	}

}
