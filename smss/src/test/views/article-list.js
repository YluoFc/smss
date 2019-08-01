	//抽取跳转页面的公共方法
	function toPage(page){
		$.ajax({
			url:"/articles",
			data:"page="+page,
			type:"GET",
			success:function(result){
				draw_article_table(result);
				draw_page_info(result);
				draw_article_nav(result);
			}
		});
	}

	//创建文章表格的方法
	function draw_article_table(result){
		//每次构建表格时要先清空原有数据
		$("#article_table tbody").empty();
		
		var articles = result.jsonData.PageInfo.list;
		
		$.each(articles,function(index,item){
			
			//表格显示元素
			var articleId = $("<td></td>").append(item.id);
			var articleTypeid = $("<td></td>").append(item.typeid);
			var articleHotid = $("<td></td>").append(item.hotid);
			var articleTitle = $("<td></td>").append(item.title);
			var articleImages = $("<td></td>").append(item.images);
			var articleDate = $("<td></td>").append(item.date);
			var articleKeywords = $("<td></td>").append(item.keywords);
			var articleZhaiyao = $("<td></td>").append(item.zhaiyao);
			var articleZuozhe = $("<td></td>").append(item.zuozhe);
			
			//操作按钮元素
			var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm")
							.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("修改");
			var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm")
							.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
			var btn = $("<td></td>").append(editBtn).append(delBtn);
			
			$("<tr></tr>").append(articleId).append(articleTypeid).append(articleHotid).append(articleTitle)
						  .append(articleImages).append(articleDate).append(articleKeywords)
						  .append(articleZhaiyao).append(articleZuozhe).append(btn)
						  .appendTo("#article_table tbody");
		});
    }
    	
    	//创建分页信息
    	function draw_page_info(result){
    		$("#page_info").empty();
    		
    		$("#page_info").append("当前"+result.jsonData.PageInfo.pageNum+"页，共"+result.jsonData.PageInfo.pages+"页，共"+result.jsonData.PageInfo.total+"条记录");
    	}
    	
    	//创建导航条
    	function draw_article_nav(result){
    		$("#page_nav").empty();
    		
    		/**
    		 * 导航条固定元素
    		 */
    		var ul = $("<ul></ul>").addClass("pagination");
    		
    		//创建首页和前一页按钮元素
    		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    		var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
    		if(result.jsonData.PageInfo.hasPreviousPage == false){
    			firstPageLi.addClass("disabled");
    			prePageLi.addClass("disabled");
    		}else{
    			//为首页和前一页按钮绑定点击事件
        		firstPageLi.click(function(){
        			toPage(1);
        		});
        		prePageLi.click(function(){
        			toPage(result.jsonData.PageInfo.pageNum - 1);
        		});
    		}
    		
    		//创建尾页和下一页按钮元素
    		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
    		var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href","#"));
    		if(result.jsonData.PageInfo.hasNextPage == false){
    			nextPageLi.addClass("disabled");
    			lastPageLi.addClass("disabled");
    		}else{
    			//为尾页和后一页按钮绑定点击事件
        		lastPageLi.click(function(){
        			toPage(result.jsonData.PageInfo.pages);
        		});
        		nextPageLi.click(function(){
        			toPage(result.jsonData.PageInfo.pageNum + 1);
        		});
    		}
    		    		
    		//把首页和前一页加入到ul元素中
    		ul.append(firstPageLi).append(prePageLi);
    		
    		//遍历得到的元素，加入ul元素中
    		$.each(result.jsonData.PageInfo.navigatepageNums,function(index,item){
    			var numLi = $("<li></li>").append($("<a></a>").append(item));
    			if(result.jsonData.PageInfo.pageNum == item){
    				numLi.addClass("active");
    			}
    			numLi.click(function(){
    				toPage(item);
    			});
    			ul.append(numLi);
    		});
    		
    		//把下一页和最后一页加入到ul元素中
    		ul.append(nextPageLi).append(lastPageLi);
    		
    		//把ul元素加入到nav元素中
    		var navPage = $("<nav></nav>").append(ul);
    		
    		//把nav中所有的元素通过选择器加入到div中
    		navPage.appendTo("#page_nav");
    		
    	}