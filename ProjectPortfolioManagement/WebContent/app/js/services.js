angular.module('project.services', []).service('portfolioService',
		function($resource) {
			console.log("i am in portfolio servixce");

			return $resource('', {},{
				submit : {
					method : 'POST',
				
					url : 'rest/portfolio'
				},

				getAll : {
					method : 'GET',
					isArray : true,
					url : 'rest/portfolios'
				}
			});

		}).service('projectService', function($resource) {
	console.log("i am in project service");
	return $resource('', {}, {
		submit : {
			method : 'POST',
			url : 'rest/project'

		},
		get : {
			method : 'GET',
			url : 'rest/projects' + '/:portfolioName',
			params : {
				portfolioName : "@portfolioName"
			},
			isArray : true
		},
		
		
		
	/*
	 * getc : { method : 'GET', url : 'rest/project' + '/:projectId', params : {
	 * projectId : "@projectId" }, isArray : true },
	 */
	});

}).service('projectOperationService', function($resource) {
	console.log("i am in project service");
	return $resource('', {}, {
		get : {
			method : 'GET',
			url : 'rest/project' + '/:projectId',
			params : {
				projectId : "@projectId"
			},
			isArray : true
		},
		Delete : {
			method : 'DELETE',
			url : 'rest/project' + '/:projectId',
			params : {
				projectId : "@projectId"
			},
		},
	});

}).service('projectEventService', function($resource) {
	console.log("i am in event service");
	return $resource('', {}, {
		submit : {
			method : 'POST',
			url : 'rest/project/event'
		}
	});

}).service('projectResponseService', function($resource) {
	console.log("i am in project service");
	return $resource('', {}, {
		submit : {
			method : 'POST',
			url : 'rest/project/response'
		}
	});

});
