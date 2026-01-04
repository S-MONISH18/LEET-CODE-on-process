impl Solution {
    pub fn sum_four_divisors(nums: Vec<i32>) -> i32 {
        nums.iter().map(Self::sum_four_divisors_for_num).sum()
    }
    fn sum_four_divisors_for_num(num: &i32) -> i32 {
        let mut sum = 1 + num;
        let mut divisor_cnt = 2;
        let p_bound = num.isqrt();
        if *num == p_bound * p_bound {
            return 0;
        }

        for p in 2..=p_bound {
            if num % p == 0 {
                if divisor_cnt == 4 {
                    return 0;
                }

                sum += p + num / p;
                divisor_cnt += 2;
            }
        }
        if divisor_cnt == 4 { sum } else { 0 }
    }
}