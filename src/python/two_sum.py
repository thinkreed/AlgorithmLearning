#!/usr/bin/env python3


def two_sum(nums, target):
    if len(nums) <= 1:
        return False
    diff_dict = {}
    for i in nums:
        if nums[i] in diff_dict:
            return [diff_dict[nums[i]], i]
        else:
            diff_dict[target - nums[i]] = i


if __name__ == '__main__':
    test_nums = [7, 3, 9, 1, 5]
    print(two_sum(test_nums, 8))
