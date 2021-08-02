package ru.job4j.array2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheck2Test {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean rslt = MatrixCheck2.monoHorizontal(board, row);
        Assert.assertTrue(rslt);
    }

    @Test
    public void whenHasFalse() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean rslt = MatrixCheck2.monoHorizontal(board, row);
        Assert.assertFalse(rslt);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean rslt = MatrixCheck2.monoVertical(board, column);
        Assert.assertTrue(rslt);
    }

    @Test
    public void whenHasFalseMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean rslt = MatrixCheck2.monoVertical(board, column);
        Assert.assertFalse(rslt);
    }


        @Test
        public void whenDiagonalFullX() {
            char[][] input = {
                    {'X', ' ', ' '},
                    {' ', 'X', ' '},
                    {' ', ' ', 'X'},
            };
            char[] result = MatrixCheck2.extractDiagonal(input);
            char[] expected = {'X', 'X', 'X'};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
        public void whenDiagonalFullOne() {
            char[][] input = {
                    {'1', ' ', ' '},
                    {' ', '1', ' '},
                    {' ', ' ', '1'},
            };
            char[] result = MatrixCheck2.extractDiagonal(input);
            char[] expected = {'1', '1', '1'};
            Assert.assertArrayEquals(expected, result);
        }

        @Test
        public void whenDiagonalMix() {
            char[][] input = {
                    {'X', ' ', ' '},
                    {' ', 'Y', ' '},
                    {' ', ' ', 'Z'},
            };
            char[] result = MatrixCheck2.extractDiagonal(input);
            char[] expected = {'X', 'Y', 'Z'};
            Assert.assertArrayEquals(expected, result);
        }



}