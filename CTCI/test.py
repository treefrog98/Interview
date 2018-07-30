
" prints out every pair of integers where a^3 + b^3 = c^3 + d^3 where a, b, c, d < n "


# Brute force solution
def solution1(n):
    for a in range(1, n):
        for b in range(1, n):
            for c in range(1, n):
                for d in range(1, n):
                    if a ** 3 + b ** 3 == c ** 3 + d ** 3:
                        print(a, b, c, d)

# Optimized solution
def solution2(n):
    dict = {}
    for c in range(1, n):
        for d in range(1, n):
            dict[c ** 3 + d ** 3] = (c, d)
    for a in range(1, n):
        for b in range(1, n):
            if dict[a ** 3 + b **3]:
                print(a, b, dict[a ** 3 + b **3][0], dict[a**3 + b**3][1])

solution2(1000)
