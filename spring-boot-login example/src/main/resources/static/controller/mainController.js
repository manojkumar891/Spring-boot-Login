myApp.controller('mainController', function($scope,$state,$http,$location) {
	    
		$scope.login = function(user){
			$http.post('/verify-login',user).then(function(result){
				alert(JSON.stringify(result));
				$state.go('home');
			});
		}
});