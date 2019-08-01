    //关于页面获取数据的总方法
    function toPage(page){
        $.ajax({
            url:'/articles',
            data:'page='+page,
            type:'GET',
            success:function(result){
                draw_table(result);
                inset_articletotal(result);
                inset_pageinfo(result);
                inset_nav(result);
                bind_click(result);
            }
        });
    }

    //填入总文章数的方法
    function inset_articletotal(result) {
        var articletotal = result.jsonData.PageInfo.total;
        $("#article_total").text(articletotal);
    }

    //创建文章数量消息显示
    function inset_pageinfo(result) {
        var start = result.jsonData.PageInfo.startRow;
        var end = result.jsonData.PageInfo.endRow;
        var total = result.jsonData.PageInfo.total;
        $("#article_pageinfo").empty();
        $("#article_pageinfo").prepend('显示'+start+'条到'+'<span id="change_end">'+end+'</span>条，共'+'<span id="change_total">'+total+'</span>'+'条');

    }

    //创建导航条
    function inset_nav(result) {
        $("#article_nav").empty();

        $.each(result.jsonData.PageInfo.navigatepageNums,function (index,item) {
            var pagenums = $("<td></td>").addClass('paginate_button').append(item);
            if (result.jsonData.PageInfo.pageNum == item){
                pagenums.addClass('current');
            }else {
                pagenums.click(function () {
                    toPage(item);
                });
            }
            $("#article_nav").append(pagenums);
        });
    }

    //导航条上下页按钮绑定单击事件
    function bind_click(result) {
        if(result.jsonData.PageInfo.hasPreviousPage == false){
            $("#article_previous").addClass('disabled');
        }else {
            $("#article_previous").click(function(){
                toPage(result.jsonData.PageInfo.pageNum - 1);
            });
        }

        if(result.jsonData.PageInfo.hasNextPage == false){
            $("#article_next").addClass('disabled');
        }else{
            $("#article_next").click(function(){
                toPage(result.jsonData.PageInfo.pageNum + 1);
            });
        }
    }

    //创建表格
    function draw_table(result) {
        $("#article_tbody").empty();

        var articles = result.jsonData.PageInfo.list;

        $.each(articles,function(index,item) {

            //表格显示元素
            var articleCheckbox = $("<td></td>").append('<input type="checkbox" value="" name="">');
            var articleId = $("<td></td>").addClass('sorting_1').append(item.id);
            var articleTitle = $("<td></td>").append(item.title);
            var articleTypeid = $("<td></td>").append(item.typeid);
            var articleHotid = $("<td></td>").append(item.hotid);
            var articleDescription = $("<td></td>").addClass('article-content').append(item.description);
            var articleDate = $("<td></td>").append(item.date);
            var articleKeywords = $("<td></td>").append(item.keywords);
            var articleZuozhe = $("<td></td>").append(item.zuozhe);
            var articleState  = $("<td></td>").addClass('td-status').append('<span class="label label-success radius">已发布</span>');

            //表格中操作按钮
            var btn_1 = $("<a></a>").click(function () {
                article_stop(this,'10001');
            }).attr('style','text-decoration:none').attr('title','下架').append('<i class="Hui-iconfont">&#xe6de;</i>')
            var btn_2 = $("<a></a>").addClass('ml-5').click(function () {
                article_edit('资讯编辑','article-add.html','10001');
            }).attr("style","text-decoration:none").attr('title',"编辑").append('<i class="Hui-iconfont">&#xe6df;</i>')
            var btn_3 = $("<a></a>").addClass('ml-5').click(function () {
                article_del(this);
            }).attr('article-id',item.id).attr('style','text-decoration:none').attr('title','删除').append('<i class="Hui-iconfont">&#xe6e2;</i>')

            var articleCaozuo  = $("<td></td>").addClass('f-14 td-manage').append(btn_1).append(btn_2).append(btn_3);

            $("<tr></tr>").addClass('text-c').append(articleCheckbox).append(articleId).append(articleTitle)
            .append(articleTypeid).append(articleHotid).append(articleDescription).append(articleDate)
            .append(articleKeywords).append(articleZuozhe).append(articleState).append(articleCaozuo)
            .appendTo("#article_tbody");
        });
    }

    /*文章-操作方法*/
    /*添加*/
    function article_add(title,url,w,h){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*编辑*/
    function article_edit(title,url,id,w,h){
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*删除*/
    function article_del(obj){
        var id = $(obj).attr('article-id');
        var total1 = $("#article_total").text();
        var end = $("#change_end").text();

        layer.confirm('确认要删除吗？',function(index){
            $.ajax({
                url: '/articles/'+id,
                type: 'DELETE',
                dataType: 'json',
                success: function(data){
                    $(obj).parents('tr').remove();
                    //toPage(page);
                    $("#article_total").text(total1-1);
                    $("#change_end").text(end-1);
                    $("#change_total").text(total1-1);
                    layer.msg('已删除!',{icon:1,time:1500});
                },
                error:function(data) {
                    console.log(data.msg);
                },
            });
        });
    }

    /*审核*/
    function article_shenhe(obj,id){
        layer.confirm('审核文章？', {
                btn: ['通过','不通过','取消'],
                shade: false,
                closeBtn: 0
            },
            function(){
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
                $(obj).remove();
                layer.msg('已发布', {icon:6,time:1000});
            },
            function(){
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
                $(obj).remove();
                layer.msg('未通过', {icon:5,time:1000});
            });
    }

    /*下架*/
    function article_stop(obj,id){
        layer.confirm('确认要下架吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
            $(obj).remove();
            layer.msg('已下架!',{icon: 5,time:1000});
        });
    }

    /*发布*/
    function article_start(obj,id){
        layer.confirm('确认要发布吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
            $(obj).remove();
            layer.msg('已发布!',{icon: 6,time:1000});
        });
    }

    /*申请上线*/
    function article_shenqing(obj,id){
        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
        $(obj).parents("tr").find(".td-manage").html("");
        layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
    }