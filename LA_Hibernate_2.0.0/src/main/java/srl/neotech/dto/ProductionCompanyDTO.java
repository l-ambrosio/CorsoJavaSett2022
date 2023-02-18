package srl.neotech.dto;

public class ProductionCompanyDTO {
	
	private Integer id;
	private String companyName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return companyName;
	}
	public void setName(String name) {
		this.companyName = name;
	}
	
	@Override
	public String toString() {
		return "ProductionCompanyDTO [id=" + id + ", name=" + companyName + "]";
	}
	public ProductionCompanyDTO(Integer id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	
	
	
}
