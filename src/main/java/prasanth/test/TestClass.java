package prasanth.test;

public class TestClass {
	 public static String generateDiamond(int rows) {
	        StringBuilder diamond = new StringBuilder();
	        for (int i = 1; i <= rows; i++) {
	            for (int j = rows; j > i; j--) {
	                diamond.append(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                diamond.append("*");
	            }
	            diamond.append("\n");
	        }
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = rows; j > i; j--) {
	                diamond.append(" ");
	            }
	            
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                diamond.append("*");
	            }
	            diamond.append("\n");
	        }
	        return diamond.toString();
	    }
	 public String generateDiamondNonStatic(int rows){
	        StringBuilder diamond = new StringBuilder();
	        for (int i = 1; i <= rows; i++) {
	            for (int j = rows; j > i; j--) {
	                diamond.append(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                diamond.append("*");
	            }
	            diamond.append("\n");
	        }
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = rows; j > i; j--) {
	                diamond.append(" ");
	            }
	            
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                diamond.append("*");
	            }
	            diamond.append("\n");
	        }
	        return diamond.toString();
	    }
}
