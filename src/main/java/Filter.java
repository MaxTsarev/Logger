import java.util.List;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int value = source.size();

        List<Integer> result = source.stream()
                .filter(i -> i >= threshold).toList();

        int value2 = result.size();
        logger.log("Прошло фильтр " + value2 + " элемента из " + value);

        return result;
    }
}
