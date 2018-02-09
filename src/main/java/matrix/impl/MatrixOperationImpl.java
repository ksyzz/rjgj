package matrix.impl;

import matrix.MatrixOperation;
import model.Matrix;

/**
 * @author moooory
 * @since <pre>2018/02/08</pre>
 */
public class MatrixOperationImpl implements MatrixOperation {
    public Matrix add(Matrix a, Matrix b) throws IllegalArgumentException {
        if (a.getM() != b.getM() || a.getN() != b.getN()){
            throw new IllegalArgumentException("矩阵纬度不一致！");
        }
        int m = a.getM();
        int n = a.getN();
        double[][] sum = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a.getA()[i][j] + b.getA()[i][j];
            }
        }
        return new Matrix(sum);
    }

    public Matrix minus(Matrix a, Matrix b) throws IllegalArgumentException {
        if (a.getM() != b.getM() || a.getN() != b.getN()){
            throw new IllegalArgumentException("矩阵纬度不一致！");
        }
        int m = a.getM();
        int n = a.getN();
        double[][] minus = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minus[i][j] = a.getA()[i][j] - b.getA()[i][j];
            }
        }
        return new Matrix(minus);
    }

    public Matrix multiple(Matrix a, Matrix b) throws IllegalArgumentException {
        if (a.getN() != b.getM()) {
            throw new IllegalArgumentException("矩阵a的列数与矩阵b的行数不一致！");
        }
        int am = a.getM();
        int n = a.getN();
        int bn = b.getN();
        double[][] multiplie = new double[am][bn];
        for (int i = 0; i < am; i++) {
            for (int j = 0; j < bn; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a.getA()[i][k] * b.getA()[k][j];
                }
                multiplie[i][j] = sum;
            }
        }
        return new Matrix(multiplie);
    }

    public Matrix dotMultiple(Matrix a, Matrix b) throws IllegalArgumentException {
        if (a.getM() != b.getM() || a.getN() != b.getN()){
            throw new IllegalArgumentException("矩阵纬度不一致！");
        }
        int m = a.getM();
        int n = a.getN();
        double[][] multiple = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                multiple[i][j] = a.getA()[i][j] * b.getA()[i][j];
            }
        }
        return new Matrix(multiple);
    }

    public Matrix dotDivide(Matrix a, Matrix b) throws IllegalArgumentException {
        if (a.getM() != b.getM() || a.getN() != b.getN()){
            throw new IllegalArgumentException("矩阵纬度不一致！");
        }
        int m = a.getM();
        int n = a.getN();
        double[][] divide = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                divide[i][j] = a.getA()[i][j] / b.getA()[i][j];
            }
        }
        return new Matrix(divide);
    }

    public Matrix transpose(Matrix a) {
        int m = a.getM();
        int n = a.getN();
        double[][] trans = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                trans[n][m] = a.getA()[m][n];
            }
        }
        return new Matrix(trans);
    }

    public double det(Matrix a) {
        int m = a.getM();
        int n = a.getN();
        if (m != n) {
            throw new IllegalArgumentException("矩阵必须为方阵！");
        }

    }
}
