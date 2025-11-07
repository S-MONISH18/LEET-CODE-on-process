import math

class Solution(object):
    def numSquares(self, n):
        def is_square(x):
            r = int(x**0.5)
            return r*r == x

        # Remove factors of 4: n = 4^a * m
        while n % 4 == 0:
            n //= 4

        # If m ≡ 7 (mod 8), answer is 4
        if n % 8 == 7:
            return 4

        # If perfect square, answer is 1
        if is_square(n):
            return 1

        # If sum of two squares, answer is 2
        i = 1
        while i*i <= n:
            if is_square(n - i*i):
                return 2
            i += 1

        # Otherwise, answer is 3
        return 3