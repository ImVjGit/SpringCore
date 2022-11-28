package Com.SpringStandaloneCollectionsDay12Yt;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String, Integer> feestructre;
	private Properties propertiesInClass;

	public Properties getPropertiesInClass() {
		return propertiesInClass;
	}

	public void setPropertiesInClass(Properties propertiesInClass) {
		this.propertiesInClass = propertiesInClass;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructre() {
		return feestructre;
	}

	public void setFeestructre(Map<String, Integer> feestructre) {
		this.feestructre = feestructre;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ",\n feestructre=" + feestructre + "]";
	}

}
