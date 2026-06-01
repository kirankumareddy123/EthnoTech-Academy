class Arraylist
{
    public static void main(String args[])
	{
		java.util.ArrayList<String> playlist=new java.util.ArrayList<>();
		java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter 1st Song");
		String song1=sc.nextLine();
        playlist.add(song1);
        System.out.println("Enter 2nd Song");
		String song2=sc.nextLine();
        playlist.add(song2);
        System.out.println("Enter 3rd Song");
		String song3=sc.nextLine();
        playlist.add(song3);

        System.out.println("All Songs: "+playlist);

        playlist.remove(1);
        System.out.println("After Removing 2nd Song: "+playlist);
        
        System.out.println("Total Songs: "+playlist);

        System.out.println("Getting 1st song:"+playlist.get(0));

        System.out.println(playlist.contains("Animal"));

        System.out.println(playlist.set(1, "Shape of You"));

        System.out.println("Updated Playlist: "+playlist);
        System.out.println("Song search: "+playlist.indexOf("Shape of You"));

        for(String song: playlist)
        {
            System.out.println(song);
        }

        sc.close();
        

    }

		
}