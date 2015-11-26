/* Controllers */
var cntrlObject = angular.module('project.controllers', []);

cntrlObject
		.controller(
				'addPortfolioCntrl',
				[
						"portfolioService",
						"$scope",
						"$window",
						function(portfolioService, $scope, $window) {

							$scope.res12 = [ "sagar" ];

							$scope.addPortfolio = function() {
								$scope.res;

								$scope.res = portfolioService.submit(
										$scope.newPortfolio,function() {
											
										/*	$window.location.href = "#/"+ $scope.res;*/
										
										});

								$scope.newPortfolio = {};

							};

						} ])
		.controller(
				"selectPortfolioCntrl",
				[
						"portfolioService",
						"projectService",
						"projectOperationService",
						"$scope",
						"$routeParams",
						"$window",
						"$rootScope",
						function(portfolioService, projectService,
								projectOperationService, $scope, $routeParams,
								$window, $rootScope) {

							$scope.portfolioList = [];

							$scope.portfolioList = portfolioService
									.getAll(function() {

									});

							console.log("****" + $scope.portfolioList);

							$scope.projectData = [];

							$scope.getProjectDetails = function(portfolioName) {

								$routeParams.portfolioName = portfolioName;

								$scope.projectData = projectService.get({
									portfolioName : $routeParams.portfolioName
								}, function() {
								});

								$scope.projectDetails = [];
								$scope.getProject = function(projectId) {

									$routeParams.projectId = projectId;

									$scope.projectDetails = projectOperationService.get(
													{
														projectId : $routeParams.projectId
													},
													function() {

														$rootScope.projectObjet = $scope.projectDetails;
														$window.location.href = "#/viewProject";

													});

								};

								$scope.deleteProject = function(projectId) {

									$routeParams.projectId = projectId;

									projectOperationService.Delete({
										projectId : $routeParams.projectId
									}, function() {

										console.log("deleted");

									});

								};
								$scope.addEvent = function(projectId) {

									$window.location.href = "#/projectEvent?pid="
											+ projectId;

								};

							};

						} ]).controller(
				'addProjectCntrl',
				[
						"projectService",
						"portfolioService",
						"$scope",
						function(projectService, portfolioService, $scope) {

							$scope.portfolioList = [];
							$scope.portfolioList = portfolioService
									.getAll(function() {
									});

							$scope.addNewProject = function() {

								projectService.submit($scope.newProject);

								console.log("Portfolio added Successfully....."
										+ $scope.newProject);
								/* window.location = "#/success" */
								$scope.newProject = {};
							};
						} ]).controller(
				'addProjectEventCntrl',
				[
						"projectEventService",
						"$scope",
						"$location",
						"$window",
						function(projectEventService, $scope, $location,
								$window) {

							console.log("inside event ppm cntrl ....."
									+ $location.search()['pid']);
							$scope.projectId = $location.search()['pid'];
							$scope.addProjectEvent = function() {
								console.log("inside add event method");

								projectEventService.submit($scope.newEvent);
								console.log("event added Successfully....."
										+ $scope.newEvent);
								$scope.newEvent = {};

								/* $window.location.href = "#/response"; */

							};

						} ]).controller(
				'addProjectResponseCntrl',
				[
						"projectResponseService",
						"$scope",
						function(projectResponseService, $scope) {

							$scope.addProjectResponse = function() {

								projectResponseService
										.submit($scope.newResponse);
								console.log("Portfolio added Successfully....."
										+ $scope.newResponse);
								$scope.newResponse = {};
							};

						} ]);