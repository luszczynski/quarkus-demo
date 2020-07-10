/*jshint unused:false */


(function (exports) {
    
    'use strict';
    
    //var serverUrl = "http://todo-backend-todo-app.apps.techtour.luszczynski.me/todo"
    var serverUrl = "http://localhost:8080/todo"
    


    exports.todoStorage = {
        fetch: async function () {
            const response = await axios.get(serverUrl);
            console.log(response.data);
            return response.data;
        },
        add : async function(item) {
          console.log("Adding todo item " + item.title);
          return (await axios.post(serverUrl, item)).data;
        },
        save: async function (item) {
            console.log("save called with", item);
            await axios.put(serverUrl + "/" + item.id, item);
        },
        delete: async function(item) {
            await axios.delete(serverUrl + "/" + item.id);
        },
        deleteCompleted: async function() {
            await axios.delete(serverUrl);
        }
    };

})(window);
