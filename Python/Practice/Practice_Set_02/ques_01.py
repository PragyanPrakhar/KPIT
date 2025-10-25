from typing import List, Tuple

def format_numbers(nums: List[int]) -> Tuple[List[int], List[str]]:
    evens_sq = [x ** 2 for x in nums if x % 2 == 0]
    odds_label = ["odd" for x in nums if x % 2 != 0]
    return (evens_sq, odds_label)

def filter_even(nums: List[int]) -> List[int]:
    return [x for x in nums if x % 2 == 0]

def sum_of_squares(nums: List[int]) -> int:
    return sum([x ** 2 for x in nums])

def concat_strings(strs: List[str]) -> str:
    return " ".join(strs)

def range_from_min_max(nums: List[int]) -> List[int]:
    return [] if not nums else [x for x in range(min(nums), max(nums) + 1)]


# ------------------------------
# Example Tests
# ------------------------------
if __name__ == "__main__":
    nums_list = [
        [1,2,3,4,5],
        [],
        [0,-2,-3],
        [7,8,9],
        [5],
        [-4,-3,-2,-1,0,1],
        [1000],
        [0,0,0]
    ]

    strs_list = [
        ["a","b","c"],
        [],
        ["x"],
        ["hello","world"],
        ["solo"],
        ["x","y"],
        ["large"],
        [""]
    ]

    for i, (nums, strs) in enumerate(zip(nums_list, strs_list), 1):
        print(f"\n# Test {i}")
        print("format_numbers:", format_numbers(nums))
        print("filter_even:", filter_even(nums))
        print("sum_of_squares:", sum_of_squares(nums))
        print("concat_strings:", concat_strings(strs))
        print("range_from_min_max:", range_from_min_max(nums))
