<%--
  Created by IntelliJ IDEA.
  User: luoFc
  Date: 2019/2/22
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ZH-CN">
<html>
<head>
    <%@include file="_heard.jsp"%>

    <title>Title</title>
</head>
<body>
<%@include file="_hearder.jsp"%>

<%@include file="_menu.jsp"%>

<section class="Hui-article-box">
    <nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页
        <span class="c-gray en">&gt;</span>
        资讯管理
        <span class="c-gray en">&gt;</span>
        资讯列表
        <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
    </nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <div class="text-c">
                <%--<span class="select-box inline">
                <select name="" class="select">
                    <option value="0">全部分类</option>
                    <option value="1">分类一</option>
                    <option value="2">分类二</option>
                </select>
                </span>
                日期范围：
                <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" class="input-text Wdate" style="width:120px;">
                -
                <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" class="input-text Wdate" style="width:120px;">--%>
                <input type="text" name="" id="" placeholder=" 资讯名称" style="width:250px" class="input-text">
                <button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜资讯</button>
            </div>
            <div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
				<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
				<a class="btn btn-primary radius" data-title="添加资讯" _href="article-add.html" onclick="article_add('添加资讯','article-add.html')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加资讯</a>
				</span>
                <span class="r">共有数据：<strong id="article_total">54</strong> 条</span>
            </div>
            <div class="mt-20">
                <div class="dataTables_wrapper no-footer">
                    <table class="table table-border table-bordered table-bg table-hover table-sort" id="article_table">
                        <thead>
                        <tr class="text-c">
                            <th width="25" class="sorting_disabled" rowspan="1" colspan="1" aria-label style="width: 25px;">
                                <input type="checkbox" name="" value="">
                            </th>
                            <th width="80" class="sorting_desc" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-sort="descending" aria-label="ID: 升序排列" style="width: 80px;">ID</th>
                            <th width="200">标题</th>
                            <th width="80">分类</th>
                            <th width="80">热度</th>
                            <th>内容</th>
                            <th width="120">更新时间</th>
                            <th width="75">关键字</th>
                            <th width="80">作者</th>
                            <th width="60">发布状态</th>
                            <th width="120">操作</th>
                        </tr>
                        </thead>
                        <tbody id="article_tbody">
                        <%--<tr class="text-c">
                            <td><input type="checkbox" value="" name=""></td>
                            <td>10001</td>
                            <td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit('查看','article-zhang.html','10001')" title="查看">资讯标题</u></td>
                            <td>行业动态</td>
                            <td>H-ui</td>
                            <td>2014-6-11 11:11:42</td>
                            <td>21212</td>
                            <td class="td-status"><span class="label label-success radius">已发布</span></td>
                            <td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>
                                <a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','article-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
                                <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
                        </tr>--%>

                        </tbody>
                    </table>
                    <div id="article_pageinfo" class="dataTables_info" role="status" aria-live="polite"></div>
                    <div class="dataTables_paginate paging_simple_numbers" id="article_paginate">
                        <a class="paginate_button previous" aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0" id="article_previous">上一页</a>
                        <span id="article_nav">
                            <a class="paginate_button current" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0">1</a>
                        </span>
                        <a class="paginate_button next" aria-controls="DataTables_Table_0" data-dt-idx="2" tabindex="0" id="article_next">下一页</a>
                    </div>
                </div>
            </div>
        </article>
    </div>
</section>

<%@include file="_footer.jsp"%>

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<!--<script type="text/javascript" src="/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>-->
<script type="text/javascript" src="/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="/static/js/article-list.js"></script>
<script type="text/javascript" src="/static/js/uinformation.js.js"></script>

<script>
    //请求后台数据
    $(function(){
        toPage(1);
    });

    $(function () {
        $.ajax({
            url:'/uinformation',
            type:'GET',
            success:function(result){
                inset_username(result);
                inset_usermark(result);
            }
        })
    })
    /*$('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,8]}// 不参与排序的列
        ]
    });*/

</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
