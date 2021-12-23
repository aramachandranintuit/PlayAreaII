package DS;

import java.util.HashMap;

public class MaximumScoreByLetters {
	
	static HashMap<String,Integer> wordScores=new HashMap<String,Integer>();
	 
	public static void main(String[] args)
	{
		MaximumScoreByLetters scoreOfLetters = new MaximumScoreByLetters();
		String[] words = {"dog","cat","dad","good"};
		char[] letters = {'a','a','c','d','d','d','g','o','o'};
		int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
		scoreOfLetters.maxScoreWords(words,letters,score);
		System.out.println(wordScores.keySet());
		System.out.println(wordScores.values());
				
	}
	public int maxScoreWords(String[] words, char[] letters, int[] score) {
		MaximumScoreByLetters scoreOfLetters = new MaximumScoreByLetters();
		HashMap<Character,Integer> map = scoreOfLetters.getMapOfCharacters(letters);
		int max =Integer.MIN_VALUE;
		for(int i=0;i<words.length;i++)
		{
			if(FormWord(map,words[i],score))
			{
				max= Math.max(max,wordScores.get(words[i]));
			}
		}
		
        return max;
    }
	
	private HashMap<Character,Integer> getMapOfCharacters(char[] letters)
	{
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<letters.length;i++)
		{
			map.put(letters[i],map.containsKey(letters[i]) ? map.get(letters[i])+1 : 1);			
		}
		return map;
	}
	
	private boolean FormWord(HashMap<Character,Integer> map , String word,int[] score)
	{
		HashMap<Character,Integer> mapClone = (HashMap<Character, Integer>) map.clone();
		int wordScore=0;
		for(int i=0;i<word.length();i++)
		{
			if(mapClone.containsKey(word.charAt(i)))
			{
				if(mapClone.get(word.charAt(i)) == 0 || mapClone.get(word.charAt(i))==null)
				{
					wordScores.put(word,0);
					return false;
				}
				else
				{
					mapClone.put(word.charAt(i), mapClone.get(word.charAt(i))-1);
					wordScore= wordScore + score[Math.abs('a' - word.charAt(i))]; 
				}
			}
			else if(!mapClone.containsKey(word.charAt(i)))
			{
				wordScores.put(word,0);
				return false;
			}
		}
		wordScores.put(word,wordScore);
		map = mapClone;
		return true;
	}

}
