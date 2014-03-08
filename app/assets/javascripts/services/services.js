

//$.ready(function() {
//
//    (function($) {
//        $.fn.goTo = function() {
//            $('html, body').animate({
//                scrollTop: $(this).offset().top + 'px'
//            }, 'fast');
//            return this; // for chaining...
//        }
//    })(jQuery);
//
//
//});




var Scroller = function() {
    return {
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