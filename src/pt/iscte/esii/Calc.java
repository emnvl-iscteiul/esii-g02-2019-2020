package pt.iscte.esii;

/**
 * Encapsulates a simple calculator
 */
public class Calc {
    private float result; // The cumulative result in this calculator object

    /**
     * Creates a new instance of this class
     */
    public Calc() {
        result = 0f;
    }

    /**
     * Adds a value to the result
     *
     * @param value The value to add to the result
     * @return This Calc object with the altered result
     */
    public Calc sum(float value){
        result += value;
        return this;
    }

    /**
     * Subtracts a value from the result
     *
     * @param value The value to subtract from the result
     * @return This Calc object with the altered result
     */
    public Calc sub(float value){
        result -= value;
        return this;
    }

    /**
     * Divides the result by the given value
     *
     * @param value The value to divide the result by
     * @return This Calc object with the altered result
     */
    public Calc div(float value){
        result /= value;
        return this;
    }

    /**
     * Multiplies the result by a given value
     *
     * @param value The value to multiply the result by
     * @return This Calc object with the altered result
     */
    public Calc mul(float value){
        result *= value;
        return this;
    }

    /**
     * Clears the calculator result
     *
     * @return This Calc object with the altered result
     */
    public Calc clear(){
        result = 0;
        return this;
    }

    /**
     * Returns the result on this calculator
     *
     * @return The result on the calculator
     */
    public float result(){
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()){
            Calc temp = (Calc)obj;
            return temp.result == this.result;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(result);
    }
}
