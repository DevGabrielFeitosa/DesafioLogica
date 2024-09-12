package br.com.service;

import java.util.ArrayList;
import java.util.List;

public class MatrixService {
        private int[][] matrix;

        public MatrixService(String input) {
            this.matrix = formatMatrix(input);
        }

        private int[][] formatMatrix(String input) {
            if (input.trim().isEmpty()) {
                return new int[0][0];
            }

            input = input.replaceAll("[\\[\\]]", "");
            String[] values = input.split("\\s*,\\s*|\\s+");

            List<Integer> elements = new ArrayList<>();
            for (String value : values) {
                elements.add(Integer.parseInt(value));
            }

            int n = (int) Math.sqrt(elements.size());
            if (n * n != elements.size()) {
                throw new IllegalArgumentException("O número de elementos não corresponde a uma matriz N x N.");
            }

            int[][] matrix = new int[n][n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = elements.get(index++);
                }
            }

            return matrix;
        }

        public List<Integer> transformMatrix() {
            List<Integer> result = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return result;
            }

            int top = 0;
            int bottom = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return result;
    }
}
