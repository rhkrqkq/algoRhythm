T = int(input())
 
for case in range(1, T+1):
    N = int(input())
    li = list(map(int, input().split()))
    res = max(li) - min(li)
    print(f"#{case} {res}")