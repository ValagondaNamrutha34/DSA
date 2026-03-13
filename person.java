
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int person=0;
        int cookie=0;
        Arrays.sort(g);
        Arrays.sort(s);

            while(person<g.length && cookie<s.length){
                if(s[cookie]>=g[person]){
                    person++;
                }
                cookie++;
            }
        return person;
    }
}
```
