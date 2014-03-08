


//willApp.directive('ngMaxNum', function() {
//	return {
//		restrict: 'A',
//		scope: {
//			ngMaxNum: '='
//		},
//		controller: function($scope, $element, $attrs, $location) {
//			$scope.$watch(function() {
//											return $scope.ngMaxNum;
//										}, function() {
//											console.log($scope.ngMaxNum)
//											$element[0].setAttribute("max", $scope.ngMaxNum);
//										});
//		}
//
//	}
//});


willApp.directive('scrollTo', function($document, Scroller) {
   return {
       restrict: 'A',
       scope: {
            elemName: '@scrollTo'
       },
       link: function( $scope, $element ) {
           $element.on("click", function() {
               Scroller.scrollTo($scope.elemName, $(".home-menu").height() + 15)
           })

       }
   }
});