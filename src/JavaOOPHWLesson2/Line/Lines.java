package JavaOOPHWLesson2.Line;

import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double sumOfAllLinesLengths() {
        double sum = 0;
        for (Line line :
                lines) {
            sum += line.lenghtOfLine();
        }
        return sum;
    }

    public Line longestLine() {
        int longestLineIndex = 0;
        int index = 0;
        for (Line line :
                lines) {
            if (line.lenghtOfLine() > lines.get(longestLineIndex).lenghtOfLine()) {
                longestLineIndex = index;
            }
            index++;
        }
        return lines.get(longestLineIndex);
    }
}
