
package kata5.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/25 09:52 GMT
 *
 */

public class Histogram <T> {

    private final Map <T, Integer> map = new HashMap<>();
    
    public Integer get (T key) {
        return this.map.get(key);
    }
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment (T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) + 1: 1);
    }
}
