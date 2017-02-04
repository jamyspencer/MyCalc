/**
 * Created by jamy on 2/3/17.
 */
package umsl.edu.mycalc;
public class CalcModel {

    private String display = "0";
    private char operator = '\0';
    private double total = 0;
    private boolean putDecimal = false;
    private boolean isDecimal = false;
    private boolean isZero = true;

    void setPutDecimal(){
        if(!isDecimal) {
            putDecimal = true;
        }
    }

    String enterNum(char num) {
        if(putDecimal){
            this.display = this.display + "." + num;
            putDecimal = false;
        }
        else if(display.compareTo("0") == 0){
            this.display = String.valueOf(num);
        }
        else {
            this.display = this.display + num;
        }
        return this.display;
    }

    String backSpace(){
        if (putDecimal){
            putDecimal = false;
        }
        else {
           this.display = this.display.substring(0, (this.display.length()-1));
        }
        return this.display;
    }

    String setOperator(char op){
        this.operator = op;
        this.total = Double.parseDouble(this.display);
        this.display = "";
        return display;
    }

    String doEquals() {
        if (this.operator == '+') {
            this.total = this.total + Double.parseDouble(this.display);
        } else if (this.operator == '-') {
            this.total = this.total - Double.parseDouble(this.display);
        } else if (this.operator == '*') {
            this.total = this.total * Double.parseDouble(this.display);
        } else if (this.operator == '/') {
            this.total = this.total / Double.parseDouble(this.display);
        }

        this.display = String.valueOf(this.total);
        this.operator = '\0';
        return this.display;
    }
}
