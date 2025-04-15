package gpt;

public class StringCompression {

    public static void main(String[] args) {
        compressString("aaabbccccdd");
    }

    private static StringBuilder compressString(String str) {
        String[] split = str.split("");
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < split.length; i++) {
            if (i + 1 < split.length && (split[i].equals(split[i + 1]))) {
                count++;
            } else {
                builder.append(split[i]);
                builder.append(count);
                count = 1;
            }
        }
        return builder;
    }
}
