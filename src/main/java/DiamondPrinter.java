import java.util.List;
import java.util.ArrayList;
class DiamondPrinter {
    
    List<String> printToList(char a) {
        
        List<String> list = new ArrayList<String>();
        
        if (a == 'A') {
            list.add(Character.toString(a));
            return list;
        }
        
        int width = (int)(a - 'A') * 2 + 1;
        int height = (int)(a-'A') + 1;
        
        int charIndex1 = width/2;
        int charIndex2 = width/2;
        

        for (int i = 0; i < height; i++, charIndex1--,
            charIndex2++) {
            
            StringBuilder builder = new StringBuilder();
            
            for (int j = 0; j < width; j++) {
                if (j == charIndex1 || j == charIndex2) {
                    builder.append(Character.toString('A' + i));
                } else {
                    builder.append(" ");                
                }
            }
            list.add(builder.toString());
        }
        
        // adds the bottom half of the diamond
        for (int i = list.size() - 2; i >= 0; i--) {
            list.add(list.get(i));
        }
        return list;
    }
}