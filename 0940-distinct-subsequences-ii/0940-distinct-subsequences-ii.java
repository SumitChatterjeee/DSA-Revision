class Solution {
    public int distinctSubseqII(String s) {
        long[] count = new long[26];
        long total = 0;
        long MOD = 1_000_000_007;

        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';

            long newSubseq = (total + 1) % MOD;

            total = (total + newSubseq - count[idx] + MOD) % MOD;

            count[idx] = newSubseq;
        }

        return (int) total;
    }
}