/**
 * Created by jamy on 2/3/17.
 */
package umsl.edu.mycalc;
public class CalcModel {

    private String display = "0";
    private char operator = '\0';
    private double total = 0;

    String putDecimal(){
        if(this.display.indexOf('.') == -1) {
            this.display = this.display + '.';
        }
        return this.display;
    }

    String enterNum(char num) {
        if(display.compareTo("0") == 0){
            this.display = String.valueOf(num);
        }
        else {
            this.display = this.display + num;
        }
        return this.display;
    }

    String backSpace(){
        this.display = this.display.substring(0, (this.display.length()-1));
        return this.display;
    }

    String setOperator(char op){
        this.operator = op;
        if(this.display.compareTo("") != 0) {
            this.total = Double.parseDouble(this.display);
            this.display = "";
        }
        return this.display;
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
        } else{
            return this.display;
        }

        this.display = String.valueOf(this.total);
        this.operator = '\0';
        return this.display;
    }

    String flipSign(){
        if (this.display.compareTo("0") != 0){
            this.display = String.valueOf(Double.valueOf(this.display) * -1);
        }
        return this.display;
    }

    String clear() {
        this.display = "0";
        total = 0;
        return this.display;
    }
}
