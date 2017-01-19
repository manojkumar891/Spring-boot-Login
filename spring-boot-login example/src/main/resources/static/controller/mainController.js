myApp.controller('mainController', function($scope,$rootScope,$state,$http,$location) {
	    
		$scope.login = function(user){
			$http.post('/verify-login',user).then(function(result){
				alert(JSON.stringify(result.data));
				$rootScope.data = result.data;
				$state.go('home');
			});
		}
});