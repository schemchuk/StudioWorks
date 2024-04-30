package de.telran.javaPro.summary.work_24_04_26.filter;

public class FilderDivThree implements Filter<Integer> {
//    private List<Integer> num;
//
//    public FilderDivThree(List<Integer> num) {
//        this.num = num;
//    }

    @Override
    public boolean apply(Integer num) {
        return num % 3 == 0;
    }
}
