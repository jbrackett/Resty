'use strict';

/* Controllers */

function MyCtrl1($scope, $http) {
  $http.get('/Resty/hello.json').success(function(data) {
    $scope.result = data.result;
  });
}
MyCtrl1.$inject = ['$scope', '$http'];


function MyCtrl2($scope, $http) {
 $http.get('/Resty/random.json').success(function(data) {
  $scope.result = data.message;
});
}
MyCtrl2.$inject = ['$scope', '$http'];