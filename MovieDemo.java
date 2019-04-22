public class MovieDemo
{
	public static void main(String[] args)
	{
		Movie movie = new Movie("R", 1111, "Deadpool");
		Action action = new Action("R", 2222, "Deadpool 2");
		Comedy comedy = new Comedy("R", 3333, "Deadpool 3");
		Drama drama = new Drama("", 4444, "Avengers");

		System.out.println(movie);
		System.out.println("Late Fee: $" + movie.calcLateFees(6));

		System.out.println(action);
		System.out.println("Late Fee: $" + action.calcLateFees(6));

		System.out.println(comedy);
		System.out.println("Late Fee: $" + comedy.calcLateFees(6));

		System.out.println(drama);
		System.out.println("Late Fee: $" + drama.calcLateFees(6));
	}
}