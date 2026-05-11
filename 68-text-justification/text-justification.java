class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> lines = new ArrayList<>();

        int index = 0;

        while (index < words.length) {

            int count = words[index].length();

            int last = index + 1;

            while (last < words.length) {

                if (count + 1 + words[last].length() > maxWidth)
                    break;

                count += 1 + words[last].length();

                last++;
            }

            StringBuilder sb = new StringBuilder();

            sb.append(words[index]);

            int diff = last - index - 1;

            // Left justified
            if (last == words.length || diff == 0) {

                for (int i = index + 1; i < last; i++) {
                    sb.append(" ");
                    sb.append(words[i]);
                }

                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }

            } else {

                int spaces = (maxWidth - count) / diff;
                int extraSpaces = (maxWidth - count) % diff;

                for (int i = index + 1; i < last; i++) {

                    for (int s = 0; s <= spaces; s++) {
                        sb.append(" ");
                    }

                    if (extraSpaces > 0) {
                        sb.append(" ");
                        extraSpaces--;
                    }

                    sb.append(words[i]);
                }
            }

            lines.add(sb.toString());

            index = last;
        }

        return lines;
    }
}