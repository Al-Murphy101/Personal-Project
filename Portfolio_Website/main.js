$(document).ready(function(){
    $('.menu_toggle').on('click', function(){
        $(this).toggleClass('open');
        $('.top_nav').toggleClass('open');
    });

    $('.top_nav .nav_link').on('click', function(){
        $('.menu_toggle').removeClass('open');
        $('.top_nav').removeClass('open');
    });

    $('nav a[href*="#"]').on('click', function(){
        $('html, body').animate(keyframes, {
           scrollTop: $($(this).attr('href')).offset().top - 100 
        }, options, 2000);
    });

    $('#up').on('click', function(){
        $('html, body').animate(keyframes, {
            scrollTop: 0
         }, options, 2000);
    });

    AOS.init({
        easing: 'ease',
        duration: 1800,
        once: true
    });
});
