
public class RomanNumerals {
	
	public int convert(String s)
	{
		int num = 0;
		switch(s)
		{
		case "I": num = 1;
		break;
		case "V": num = 5;
		break;
		case "X": num = 10;
		break;
		case "L": num = 50;
		break;
		case "C": num = 100;
		break;
		case "D": num = 500;
		break;
		case "M": num = 1000;
		break;
		default:
			break;
		}
		return num;
	}
	
}
