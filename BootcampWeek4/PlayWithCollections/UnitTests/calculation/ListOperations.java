
package calculation;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    
    private List<String> names;
    
    
    public boolean addNameToList(String name){
        boolean result = false;
        if(names == null){
            names = new ArrayList();
        }
        if(name != null){
            result = names.add(name);
        }
        return result;
    }
    
    public void removeNameFromList(String name){
        names.remove(name);
    }
    
    public int getSizeOfList(){
        
        return names.size();
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
    
}
