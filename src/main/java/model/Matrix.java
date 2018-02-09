package model;

/**
 * @author moooory
 * @since <pre>2018/02/08</pre>
 */
public class Matrix {
    private int m; // matrix rows
    private int n; // matrix columns
    private double[][] a; // matrix entries

    public Matrix() {
    }

    public Matrix(int[][] data){
        m = data.length;
        n = data[0].length;
        a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = data[i][j];
            }
        }
    }

    public Matrix(double[][] data){
        m = data.length;
        n = data[0].length;
        a = data;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double[][] getA() {
        return a;
    }

    public void setA(double[][] a) {
        this.a = a;
    }
}
