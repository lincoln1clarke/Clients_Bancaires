package application;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="clients")
public class ClientListWrapper {
	
	private List<Client> clients;
	
	@XmlElement(name = "client")
	public List<Client> getClients(){
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	

}
