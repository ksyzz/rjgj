package matrix;

import model.Matrix;

/**
 * @author moooory
 * @since <pre>2018/02/08</pre>
 */
public interface MatrixOperation {
    /**
     * 矩阵求和
     * @param a
     * @param b
     * @return a+b
     * @throws IllegalArgumentException
     */
    Matrix add(Matrix a, Matrix b) throws IllegalArgumentException;

    /**
     * 矩阵相减
     * @param a
     * @param b
     * @return a-b
     * @throws IllegalArgumentException
     */
    Matrix minus(Matrix a, Matrix b) throws IllegalArgumentException;

    /**
     * 矩阵相乘
     * @param a
     * @param b
     * @return a*b
     * @throws IllegalArgumentException
     */
    Matrix multiple(Matrix a, Matrix b) throws IllegalArgumentException;

    /**
     * 矩阵点乘
     * @param a
     * @param b
     * @return a.*b
     * @throws IllegalArgumentException
     */
    Matrix dotMultiple(Matrix a, Matrix b) throws IllegalArgumentException;

    /**
     * 矩阵相除
     * @param a
     * @param b
     * @return a./b
     * @throws IllegalArgumentException
     */
    Matrix dotDivide(Matrix a, Matrix b) throws IllegalArgumentException;

    /**
     * 矩阵转置
     * @param a
     * @return a'
     */
    Matrix transpose(Matrix a);

}
