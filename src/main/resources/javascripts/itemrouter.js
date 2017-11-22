/**
 * 
 */

var itemrouter = angular.module('itemr',['ui.router']);

itemrouter.config(function($stateProvider){
	var state1 = {
			name:'state19',
			url:'/hello',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}
	}
	
	var state2 = {
			name:'state2',
			url:'/hello',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}
	}
	
	var state3 = {
			name:'state3',
			url:'/hello',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}
	}
	
	var state4 = {
			name:'state4',
			url:'/hello',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}
	}
	
	var state5 = {
			name:'state5',
			url:'/hello',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}
	}
	
	var state6 = {
			name:'state1',
			url:'/subitem/:judItemId',
			templateUrl:function(){
				return 'view/testtemp.jsp'
			}, 
			controller:'itemcontroller',
		    resolve: {
		        post: function($http, $stateParams){
		            // get the post data for the page
		            return $http.get('http://localhost:8080/opfive/item/subitem/'+$stateParams.judItemId).then(function(posts){
		            	
		                return posts.data;
		            });
		        }
		    }
	}
	
	var state7 = {
			name:'state7',
			url:'/two',
			template:'<h2>state 7</h2>'
	}
	
	
	
	$stateProvider.state(state1);
	$stateProvider.state(state2);
	$stateProvider.state(state3);
	$stateProvider.state(state4);
	$stateProvider.state(state5);
	$stateProvider.state(state6);
	$stateProvider.state(state7);
});

itemrouter.controller('itemcontroller', function($scope, post){
	var testname = [1,2,3,4];
	this.post = post;
	$scope.post = post;
	console.log(post);
	console.log($scope.post);
		});
	
	


