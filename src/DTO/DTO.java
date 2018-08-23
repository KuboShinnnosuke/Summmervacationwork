package DTO;

public class DTO {
	private int id;
	private String status;
	private int amount;

	public DTO(int id,String status,int amount){
		this.id=id;
		this.status=status;
		this.amount=amount;

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
