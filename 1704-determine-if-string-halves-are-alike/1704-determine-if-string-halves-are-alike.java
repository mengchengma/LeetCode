class Solution {
    public boolean halvesAreAlike(String s) {
        String firsthalf = s.substring(0, s.length()/2);
        String secondhalf = s.substring(s.length()/2, s.length());
        int i = vowelamt(firsthalf);
        int j = vowelamt(secondhalf);

        return i == j ? true : false;
    }

    public int vowelamt(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                total++;
            }
        }
        return total;
    }
}