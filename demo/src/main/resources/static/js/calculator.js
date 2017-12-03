var calc = angular.module("caculatorApp", []) ;

calc.controller("calCtrl",calCtrl);

function calCtrl() {
    this.result=0;
    this.a = Number(this.a || 0);
    this.b = Number(this.b || 0);
    this.buttonClicked = function (operator) {
            this.selectedOperation = operator;
   }

   this.calculate=function() {

        var x = parseFloat(this.a);
        var y = parseFloat(this.b);

       // alert(x + ":" + y)
        if(this.selectedOperation == '+') {
            this.result= x+y;
        } else if (this.selectedOperation == '-'){
            this.result=x-y;
        }else if (this.selectedOperation == '*'){
            this.result=x*y;
        }else if (this.selectedOperation == '/'){
            this.result=x/y;
        }
       
   }
   
}




