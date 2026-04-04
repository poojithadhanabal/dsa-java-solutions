# DSA Practice

A small Java repository for data structure and algorithm practice problems.

## What this project does

This repository contains Java solutions for algorithm problems, currently focused on common interview-style challenges.

## Current example problems

- `Day-01/TwoSum.java` — Java solution for the LeetCode Two Sum problem using a hash map.
- `Day-01/RemoveDuplicatesFromSortedArray.java` — Java solution for the LeetCode Remove Duplicates from Sorted Array problem.

This repository contains LeetCode problem solutions and is organized by problem folders for daily practice.

## Why this project is useful

- Helps practice common coding interview problems.
- Demonstrates simple, clean Java solutions for array-based algorithms.
- Provides a starting point for expanding the repository with additional DSA problems.

## Getting started

### Requirements

- Java JDK 8 or later

### Build

From the repository root, compile your Java source files. For example, compile all current problem files in the first-level folders:

```bash
javac */*.java
```

### Usage

These files define `Solution` classes and do not include a runnable `main` method. To test them, create a simple driver class or use a unit test framework.

Example driver snippet:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution twoSumSolution = new Solution();
        int[] result = twoSumSolution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));

        Solution removeDuplicatesSolution = new Solution();
        int[] nums = {1, 1, 2, 2, 3};
        int newLength = removeDuplicatesSolution.removeDuplicates(nums);
        System.out.println(newLength + ": " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
```

## Where to get help

For questions or issues, use the repository issue tracker or contact the project maintainer.

## Contributing

Contributions are welcome. Add new problem solutions in new folders such as `Day-02/`, `Day-03/`, or `Problem-Name/`, and keep code organized by problem name.
