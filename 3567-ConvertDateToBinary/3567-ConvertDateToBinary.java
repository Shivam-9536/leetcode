// Last updated: 1/18/2026, 1:41:17 PM
class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");
        String yearBin=Integer.toBinaryString(Integer.parseInt(parts[0]));
        String monthBin=Integer.toBinaryString(Integer.parseInt(parts[1]));
        String dayBin=Integer.toBinaryString(Integer.parseInt(parts[2]));
        return yearBin+"-"+monthBin+"-"+dayBin;
    }
}
