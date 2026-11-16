class Solution {
    class overlap {
        int d1, d2, pos;

        overlap(int d1, int d2, int pos) {
            this.d1 = d1;
            this.d2 = d2;
            this.pos = pos;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<overlap> li = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            li.add(new overlap(intervals[i][0], intervals[i][1], i));
        }
        li.sort((a, b) -> {
            if (a.d2 == b.d2) {
                return Integer.compare(a.pos, b.pos);
            }
            return Integer.compare(a.d2, b.d2);
        });
        int lastEnd = li.get(0).d2;
        for (int i = 1; i < li.size() ; i++) {
            if (li.get(i).d1 >= lastEnd) {

                lastEnd = li.get(i).d2;
            } else {
                int j = i;
                while (j < li.size()) {
                    if (li.get(j).d1 >= lastEnd) {
                        break;
                    } else {
                        count++;
                    }
                    j++;
                }
                if(j<li.size()){
                    lastEnd=li.get(j).d2;
                }
                i=j;
            }

        }
        return count;
    }
}