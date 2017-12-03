
(function () {
    contactsApp = angular.module("contactsApp");

    contactsApp.controller("contactsControl", contactsControl);

    function contactsControl(contactsAppSvc){

        var self = this;
        contactsAppSvc.getContacts()
        .then(function(data) {
            self.contacts=data;
        })

        self.showDetailsSelectedContact = function(index) {
            self.selectedContact=self.contacts[index];
        }

    }
    
})();