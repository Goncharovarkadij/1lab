public class Palindrome
{	
    public static void main(String[] args) 
	{
		for (int i = 0; i < args.length; i++)
		{
			String s = args[i]; //перезапись в переменную s каждого из входных значений
			if (isPalindrome(s))
				System.out.println(s + " is a palindrome");
			else
				System.out.println(s + " is NOT a palindrome");
		}
    }
	
	public static boolean isPalindrome(String s) //Метод, проверяющий условие палиндрома
	{
		if (s.equals(reverseString(s))) //сравнение строковых переменных
			return true;
		return false;
	}
	
		public static String reverseString(String s) //Метод, "переворачивающий" строку
	{
		String rev = ""; //локальная переменная
		for (int i = s.length(); i > 0 ; i--)
			rev += s.charAt(i-1); //к локальной переменной rev добавляются буквы исходной строки с конца
		return rev;
	}
}
