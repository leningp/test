
(function () {
    contactsApp = angular.module("contactsApp");

    contactsApp.controller("showdetails", showdetails);

    function showdetails(showdetailsSvc){

        var self = this;
        showdetailsSvc.getDetailsOfContact()
        .then(function(data) {
            self.selectedContact=data;
        })

    }
    
})();