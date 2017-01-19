/*var myApp = angular.module('myApp', ["ngRoute"]);

myApp.config(function($routeProvider) {
	
	$routeProvider
    .when("/", {
        templateUrl : "./pages/Login.html",
        controller : "mainController"
    }).when("/hello", {
        templateUrl : "./pages/home.html",
        controller : "mainController"
    }).otherwise({
	      redirectTo: '/'
	});
	
});*/

var myApp = angular.module('myApp', ['ui.router']);

myApp.config(function($stateProvider, $urlRouterProvider){
	
$urlRouterProvider.otherwise('/home');
    
    $stateProvider
        .state('login', {
            url: '/login',
            templateUrl: 'pages/Login.html',
            controller:'mainController'
        }).
        state('home', {
            url: '/home',
            templateUrl: 'pages/home.html',
            controller:'mainController'
        })
        
	
});
