

/* Scroller Services manages the functions to animate scrolling to an
 * element in the DOM.
 *
 */
var Scroller = function() {
    return {
        /*
         * scrollTo: Function to scroll to an element in the DOM
         *
         * param elementName The name of the element to scroll to in the DOM
         * param headerSize [Optional] size of the header if it is fixed
         *                  and you want it to scroll to the bottom of the header
         *
         */
        scrollTo: function(elemName, headerSize) {
            if ((elemName == undefined) || (elemName == null)) return;

            var elem = angular.element(elemName)
            headerSize = typeof headerSize !== undefined ? headerSize : 0;

            $('html, body').animate({
                scrollTop: (elem.offset().top - headerSize) + 'px'
            }, 'ease');
        }
    };
}

willApp.factory("Scroller", [Scroller]);