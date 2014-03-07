

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
        scrollTo: function(elemName) {
            if ((elemName == undefined) || (elemName == null)) return;

            var elem = angular.element(elemName)

            $('html, body').animate({
                scrollTop: elem.offset().top + 'px'
            }, 'ease');
        }
    };
}

willApp.factory("Scroller", [Scroller]);