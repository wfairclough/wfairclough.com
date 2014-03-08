
/* ScrollTo Directive is used as an attribute that takes the id of the
 * element to scroll to when it is clicked.
 *
 * Requires the Scroller services.
 *
 */
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

