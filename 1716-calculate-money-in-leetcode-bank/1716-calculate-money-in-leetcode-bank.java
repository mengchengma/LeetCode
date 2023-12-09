class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int day = n % 7;
        int week = n / 7;

        res = (week * (week - 1) / 2) * 7 + (week * 28);
        res = res + ((week + 1) + (day + week)) * day / 2;
        
        return res;
    }
}