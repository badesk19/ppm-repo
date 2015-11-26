var project = angular.module('project', ['ngRoute','ngResource',
                                         'project.controllers',
                                         'project.services']);
 


project.config(['$routeProvider',function($routeProvider,$locationProvider) {
    $routeProvider.
        when('/portfolio', {templateUrl: 'app/partials/addPortfolio.html',controller:'addPortfolioCntrl'}).
        when('/portfolios', {templateUrl: 'app/partials/selectPortfolio.html'}).
        when('/project', {templateUrl: 'app/partials/addProject.html',controller:'addProjectCntrl'}).
        when('/success', {templateUrl: 'index.html'}).
        when('/viewProject',{templateUrl:'app/partials/viewProject.html',controller:'selectPortfolioCntrl'}).
        when('/projectEvent', {templateUrl: 'app/partials/addProjectEvent.html',controller:'addProjectEventCntrl'}).
        when('/response', {templateUrl: 'app/partials/addResponse.html',controller:'addProjectResponseCntrl'}).
        otherwise({
            redirectTo: ''
          });
    
}]);




