package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs
		switch (month)
		{
			case 1:
				if (day <= 19){
					zodiac = "Capricorn";
				}
				else zodiac = "Aquarius";
				break;
			case 2:
				if (day <= 18){
					zodiac = "Aquarius";
				}
				else zodiac = "Pisces";
				break;
			case 3:
				if (day <= 20){
					zodiac = "Pisces";
				}
				else zodiac = "Aries";
				break;
			case 4:
				if (day <= 19){
					zodiac = "Aries";
				}
				else zodiac = "Taurus";
				break;
			case 5:
				if (day <= 20){
					zodiac = "Taurus";
				}
				else zodiac = "Gemini";
				break;
			case 6:
				if (day <= 20){
					zodiac = "Gemini";
				}
				else zodiac = "Cancer";
				break;
			case 7:
				if (day <= 22){
					zodiac = "Cancer";
				}
				else zodiac = "Leo";
				break;
			case 8:
				if (day <= 22){
					zodiac = "Leo";
				}
				else zodiac = "Virgo";
				break;
			case 9:
				if (day <= 22){
					zodiac = "Virgo";
				}
				else zodiac = "Libra";
				break;
			case 10:
				if (day <= 22){
					zodiac = "Libra";
				}
				else zodiac = "Scorpio";
				break;
			case 11:
				if (day <= 21){
					zodiac = "Scorpio";
				}
				else zodiac = "Sagittarius";
				break;
			case 12:
				if (day <= 21){
					zodiac = "Sagittarius";
				}
				else zodiac = "Capricorn";
				break;
			}

		return zodiac;
	}
	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(19, 1));
        System.out.println(getZodiac(20, 1));
        System.out.println(getZodiac(18, 2));
        System.out.println(getZodiac(19, 2));
        System.out.println(getZodiac(20, 3));
        System.out.println(getZodiac(21, 3));
        System.out.println(getZodiac(19, 4));
        System.out.println(getZodiac(20, 4));
        System.out.println(getZodiac(20, 5));
        System.out.println(getZodiac(21, 5));
        System.out.println(getZodiac(20, 6));
        System.out.println(getZodiac(21, 6));
        System.out.println(getZodiac(22, 7));
        System.out.println(getZodiac(23, 7));
        System.out.println(getZodiac(22, 8));
        System.out.println(getZodiac(23, 8));
        System.out.println(getZodiac(22, 9));
        System.out.println(getZodiac(23, 9));
        System.out.println(getZodiac(22, 10));
        System.out.println(getZodiac(23, 10));
        System.out.println(getZodiac(21, 11));
        System.out.println(getZodiac(22, 11));
        System.out.println(getZodiac(21, 12));
        System.out.println(getZodiac(22, 12));
	}

}
