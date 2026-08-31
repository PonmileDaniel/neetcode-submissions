class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }
        return encoded.toString();
    }
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()){
            // Find the separator after the length
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            String stri = str.substring(i, i + length);

            result.add(stri);
            i = i + length;

        }
        return result;

    }
}
