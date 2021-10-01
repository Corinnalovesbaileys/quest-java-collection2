import java.util.Comparator;

class HeroesSortByAgeComparator implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        if (o2.getAge() > o1.getAge()) {
            return 1;
        }
        else if (o2.getAge() < o1.getAge()){
            return -1;
        }
        else return 0;
    }
}
