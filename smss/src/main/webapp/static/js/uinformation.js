//填入登录管理员用户名的方法
function inset_username(result) {

    var username = result.jsonData.username;
    $("#login_username").text(username);
}

//填入登录管理员级别的方法
function inset_usermark(result){
    var usermark = result.jsonData.usermark;
    if (usermark ==1){
        $("#user_mark").text('超级管理员');
    }else {
        $("#user_mark").text('普通管理员');
    }
}