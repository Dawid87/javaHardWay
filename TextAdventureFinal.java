import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventureFinal {
	public static void main( String[] args ) throws Exception {
		Scanner keyboard = new Scanner(System.in);

		// initialize room from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

		// showAllRooms(rooms); // for debugging

		// Okay, so let's play the game!
		int currentRoom = 0;
		String  ans = "", load;
		System.out.print("Would you like to load last saved game? (y/n)" );
		load = keyboard.nextLine();
		if ( load.equals("y") || load.equals("yes") || load.equals("Y") || load.equals("Yes")) {
			currentRoom = loadGame();
		}
		while ( currentRoom >= 0 && ! ans.equals("quit")) {
			Room cur = rooms[currentRoom];
			System.out.print ( cur.description );
			System.out.print ("Travel/save/quit > ");
			ans = keyboard.nextLine();

			// See if what they typed matches any of our exit names
			boolean found = false;
			for ( int i=0; i<cur.numExits; i++) {
				if ( cur.exits[i].equals(ans) ) {
					//if so, change our next room to that exit's room number
					currentRoom = cur.destinations[i];
					found = true;
				}
			}
				
				if ( ans.equals("save") || ans.equals("Save") || ans.equals("s") ) {
					saveGame(currentRoom);
					found = true;
				}
			if ( ! found && ! ans.equals("quit"))
				System.out.println("Sorry I don't understand.");	
			
			
		}
	}

	public static Room[] loadRoomsFromFile( String filename ) {
		Scanner file = null;
		try {
			file = new Scanner(new File(filename));
		}
		catch ( java.io.IOException e ) {
			System.err.println("Can't open '" + filename + "' for reading." );
			System.exit(1);
		}

		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];

		//initialize rooms from file
		int roomNum = 0;
		while ( file.hasNext() ) {
			Room r = getRoom(file);
			if (r.roomNumber != roomNum ) {
				System.err.print("Just read room # " + r.roomNumber);
				System.err.print(", but " + roomNum + " was expected.");
				System.exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();

		return rooms;
	}

	public static void showAllRooms( Room[] rooms ) {
		for ( Room r : rooms ) {
			String exitString = "";
			for ( int i=0; i<r.numExits; i++ )
				exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
			System.out.println( r.roomNumber + ") " + r.roomName );
			System.out.println( exitString );
		}
	}

	public static Room getRoom( Scanner f ) {
		// any rooms left in the file?
		if ( ! f.hasNextInt() )
			return null;

		Room r = new Room();
		String line;

		// read in the room # for error-checking later
		r.roomNumber = f.nextInt();
		f.nextLine(); // skip "\n" after room #

		r.roomName = f.nextLine();

		// read in the room's description
		r.description = "";
		while ( true ) {
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			r.description += line + "\n";
		}

		//finally, we'll read in the exits
		int i = 0;
		while ( true ) {
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			String[] parts = line.split(":");
			r.exits[i] = parts[0];
			r.destinations[i] = Integer.parseInt(parts[1]);
			i++;
		}
		r.numExits = i;

		// should be done; return the Room
		return r;
	}

	public static void saveGame(int room) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String prompt;
		while ( true ) {
			System.out.println("Are you sure you want to overwrite current save? (y/n)");
			prompt = keyboard.nextLine();
			if (prompt.equals("y")) {
				PrintWriter out = new PrintWriter("game-save-file.txt");
					out.println(room);
				out.close();
				System.out.println("File saved.");	
				break;	
			}
			else {
				break;
			}

		}

	}

	public static int loadGame() throws Exception{
		Scanner f = new Scanner(new File("game-save-file.txt"));
			int s = f.nextInt();
			f.close();
			return s;
	}
}