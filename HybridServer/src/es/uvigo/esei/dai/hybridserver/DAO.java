package es.uvigo.esei.dai.hybridserver;

public interface DAO {
	
	public String getIndex();
	
	public String getPage(String uid);
	
	public String addPage(String value);
	
	public boolean isPage(String uuid);
	
	public String deletePage(String uid);
	
	
}
