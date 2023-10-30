package rocketship;

public class rocket {
	
	public static final int DEFAULT_SIZE = 3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		drawPyramid();
		drawSeparator();
		drawDiamondSection();
		drawSeparator();
		drawHourglassSection();
		drawSeparator();
		drawPyramid();
	}

	/**
	 * This method help to draw the following part:
	 *       /**\
     *      //**\\
     *     ///**\\\
     *    ////**\\\\
     *   /////**\\\\\
     * 
     * of the rocket.
	 */
	public static void drawPyramid() {
		for (int row = 1; row <= (DEFAULT_SIZE * 2 - 1); row++) {
			System.out.print(" ");
			//Print the spaces using this nested loop
			for (int space = 1; space <= (DEFAULT_SIZE * 2 - 1) - row; space++) {
				System.out.print(" ");
			}
			//Print the slashes using this loop
			for (int slash = 1; slash <= row; slash++) {
				System.out.print("/");
			}
			//Print the stars here
			System.out.print("**");
			//Print the back-slashes using this loop
			//Need to escape the back-slash character before printing
			for (int bslash = 1; bslash <= row; bslash++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	
	/**
	 * This method help to draw the separator of each
	 * sub-section of the rocket as follows:
	 * 
	 * 	+=*=*=*=*=*=*+
	 *    
	 */
	public static void drawSeparator() {
		System.out.print("+");
		//This loop helps print the entire row with "+="
		for (int col = 1; col <= DEFAULT_SIZE * 2; col++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	
	public static void drawDiamondSection() {
		drawTopSectionOfBody();
		drawBottomSectionOfBody();
	}
	
	public static void drawHourglassSection() {
		drawBottomSectionOfBody();
		drawTopSectionOfBody();
	}
	
	/**
	 * This method helps build the following portion
	 * of the body of the rocket:
	 * 
	 *   |../\..../\..|
     *   |./\/\../\/\.|
     *   |/\/\/\/\/\/\|
	 * 
	 */
	public static void drawTopSectionOfBody() {
		for (int row = 1; row <= DEFAULT_SIZE; row++) {
			System.out.print("|");
			//This section should repeat twice
			drawTriangle(row);
			drawTriangle(row);
			System.out.println("|");
		}
	}

	/**
	 * Draws a triangle as follows:
	 *   ../\..
     *   ./\/\.
     *   /\/\/\ 
	 * @param row
	 */
	public static void drawTriangle(int row) {
		//This loop helps to print the dot(s)
		for(int dot = 1; dot <= DEFAULT_SIZE - row; dot++) {
			System.out.print(".");
		}
		//This loop helps print the slashes
		for (int slashes = 1; slashes <= row; slashes++) {
			System.out.print("/\\");
		}
		//This loop helps to print the dot(s)
		for(int dot = 1; dot <= DEFAULT_SIZE - row; dot++) {
			System.out.print(".");
		}
	}

	/**
	 * This method helps build the following portion
	 * of the body of the rocket:
	 * 
	 *   |\/\/\/\/\/\/|
     *   |.\/\/..\/\/.|
     *   |..\/....\/..|
	 *
	 */
	public static void drawBottomSectionOfBody() {
		//This loop will work backwards
		for (int row = DEFAULT_SIZE; row >= 1; row--) {
			System.out.print("|");
			//This section should repeat twice
			drawInvertedTriangle(row);
			drawInvertedTriangle(row);
			System.out.println("|");			
		}
	}

	/**
	 * Draws and inverted triangle as follows:
	 * 
	 *   \/\/\/
     *   .\/\/.
     *   ..\/..

	 * @param row
	 */
	public static void drawInvertedTriangle(int row) {
		//This loop helps to print the dot(s)
		for(int dot = 1; dot <= DEFAULT_SIZE - row; dot++) {
			System.out.print(".");
		}
		//This loop helps print the inverted slashes
		for (int slashes = 1; slashes <= row; slashes++) {
			System.out.print("\\/");
		}
		//This loop helps to print the dot(s)
		for(int dot = 1; dot <= DEFAULT_SIZE - row; dot++) {
			System.out.print(".");
		}
	}
}


