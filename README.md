# Merge Sort

The merge of two sorted arrays, the in-place merge the chapter works through, and merge sort in both forms, bottom-up and recursive. A JUnit suite checks each class.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      sorts/
        MergeTwoSortedArrays.java       # two-pointer merge into a new array
        InPlaceMerge.java               # merge two sorted halves without extra space
        MergeSort.java                  # bottom-up and recursive versions
    test/
      sorts/
        MergeTwoSortedArraysTest.java
        InPlaceMergeTest.java
        MergeSortTest.java              # scenarios shared by both merge sort versions
        MergeSortBottomUpTest.java
        MergeSortRecursiveTest.java
  scripts/
    test.sh                             # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh sorts.MergeSortBottomUpTest` — compiles everything and runs only that test class. Use this while you are working on one method and the others are still empty.

There is no demo program; the tests are how you check your work.

## What's here

- `sorts.MergeTwoSortedArrays` — `merge(arr1, arr2)`, which returns a new sorted array. Ties take from `arr1`, which keeps the merge stable.
- `sorts.InPlaceMerge` — `merge(arr, mid)`, which merges the two sorted halves of one array by shifting, with no auxiliary array.
- `sorts.MergeSort` — `mergeSortBottomUp` and `mergeSortRecursive`, both built on the same private `merge(arr, start, mid, end)`, which merges two sorted ranges of one array.
- `sorts.MergeTwoSortedArraysTest` and `sorts.InPlaceMergeTest` — the tests for the two merges.
- `sorts.MergeSortTest` — the abstract scenario suite for merge sort. It has one subclass per version, `MergeSortBottomUpTest` and `MergeSortRecursiveTest`, so you can test one version alone.
