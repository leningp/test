(function () {
    
        contactsApp = angular.module("contactsApp");
        contactsApp.service("showdetailsSvc", function ($http) {
            var self = this;
            this.getDetailsOfContact = function () { 
            var promiosie1 = $http.get("http://localhost:3000/contacts/1");
            var promiosie2 = promiosie1.then(function (response) {
                return response.data;
            });
            return promiosie2;
        }
        });
    })();