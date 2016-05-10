/**
 * Created by User on 2015/12/5.
 */
$(function(){
    $(".link .button").hover(function(){
        var title=$(this).attr("data-title");
        $(".tip .tipContent").text(title);
        var btnLeft=$(this).offset().left;
        var dis=($(".tip").outerWidth()-$(this).outerWidth())/2;
        var tipLeft=btnLeft-dis;
        $(".tip").css({"left":tipLeft+"px"}).animate({"top":325,"opacity":1},300);
    },function(){
        $(".tip").animate({"top":280,"opacity":0},300);
    });

})
