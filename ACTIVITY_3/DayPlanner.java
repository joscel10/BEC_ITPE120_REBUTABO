public class DayPlanner{
	public static void main(String[] args){
		DayOfWeek today = DayOfWeek.SUNDAY;

		switch(today){
		case MONDAY:
			System.out.println("Its Monday. Its your first day of school!");
			break;
		case TUESDAY:
			break;
		case WEDNESDAY:
			System.out.println("Its Wednesday, i dance, dance, dance");
			break;
		case THURSDAY:
			System.out.println("");
			break;
		case FRIDAY:
			System.out.println("Its Friday.Halata man!");
			break;
		case SATURDAY:
			System.out.println("Its weekend. Time to panlaba!");
			break;
        case SUNDAY:
			System.out.println("Its Sunday. Church timee!");
			break;
		default:
			System.out.println("Invalid days of the week.");
		}

	}
}