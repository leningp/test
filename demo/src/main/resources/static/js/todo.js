var todoApp = angular.module("todoApp", ["ngTable"]);
todoApp.controller("todoControl", todoControl);


function todoControl() {
    console.log("IN to do control");
    this.todoList=["Java Multithreading", "Spring boot"];
    this.isEdit = false;

   // var data=["Java Multithreading", "Spring boot"];
   // this.tableParams = new NgTableParams({},{dataset : data})

    this.add2TodoList=function() {
        this.isEdit=false;
        var item = this.inTodo;
        this.todoList.push(item);

    }

    

    this.update2TodoList=function() {
        // edit clicked
        this.isEdit=!this.isEdit
        
    }

    this.save2TodoList = function() {
        this.isEdit=false;
    }

    this.removeFrom2doList=function(index) {
        alert("removeFrom2doList");
        this.todoList.splice(index, 1);
        this.isEdit=false;

    }

}   