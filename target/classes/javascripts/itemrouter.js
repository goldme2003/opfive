/**
 * 
 */

var itemrouter = angular.module('itemr',['ui.router']);

itemrouter.config(function($stateProvider){
	var state1 = {
			name:'stateone',
			url:'/hello',
			templateUrl:'view/19.jsp'
	}
	
	var state2 = {
			name:'statetwo',
			url:'/two',
			template:'<h2>state two</h2>'
	}
	
	
	
	$stateProvider.state(state1);
	$stateProvider.state(state2);
});

/*itemrouter.controller('itemcontroller', function($scope){
	
});*/