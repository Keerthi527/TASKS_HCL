package collections.com;

public class Hashh {

	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();
		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
	}
}
package collections.com;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {
	private HashMap<String, String> M1;
	
	public CountryMap() {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
}