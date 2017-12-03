(function () {
    contactsApp = angular.module("contactsApp");
    contactsApp.service("contactsAppSvc", function ($http) {
        var self = this;
        this.getContacts = function () { 
        var promiosie1 = $http.get("http://localhost:3000/contacts");
        var promiosie2 = promiosie1.then(function (response) {
            return response.data;
        });
        return promiosie2;
    }
    });
})();