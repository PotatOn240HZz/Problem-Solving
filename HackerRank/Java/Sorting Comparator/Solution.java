

class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        if (b.score < a.score)
            return -1;
        if(b.score > a.score)
            return 1;
        return a.name.compareTo(b.name);
    }
}

//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem