function g(id){
     return document.getElementById(id);
}

function replaceHTML(data){
    return data.replace(/\</g,"");
}

function checkResearchContent(){
    if(g("research_content")!=null){
        if(g("research_content").value=="") return false;
        var contlen = g("research_content").value.length;
        if(contlen>500){
            g("research_result").innerHTML = "限制为500字！目前字数为"+contlen+"字";
            return false;
        }
        return true;
    }
}

var http=null;
var POST_URL="http://docapi.dangdang.com/Research/PostResearch.ashx";
function postResearch(agentHandler){
    if(checkResearchContent()==false) return;

    var type = g("research_type").value;
    var content = replaceHTML(g("research_content").value);
    var custId = getCookie("custid");
    var postUrl = window.location.href;	
    g("research_result").innerHTML = "提交中...";

    if(window.XMLHttpRequest) // Mozilla
    { 
        http=new XMLHttpRequest();
        if(http.overrideMimeType)
            http.overrideMimeType("text/html;");
    }
    else if(window.ActiveXObject) // IE
    {
        try
        {
            http=new ActiveXObject("Msxml2.XMLHTTP");
        }
        catch(e)
        {
            try
            {
                http=new ActiveXObject("Microsoft.XMLHTTP");
            }catch(e)
            {
            }
        }
    }

	if(http==null) return;
	
    http.onreadystatechange = postResearchProcessResponse;
    http.open("POST", agentHandler, true);
    //HttpRequest.setRequestHeader("if-Modified-Since","0");
    http.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"); 
    try
    {
         http.send("request_url="+POST_URL+"&type="+type+"&content="+content+"&custId="+custId+"&postUrl="+postUrl);
    } catch (e)
    {
    }
}

function postResearchProcessResponse(){
    if(http!=null){
        if(http.readyState == 4){
            if(http.status != 200)
                return;

            var result = http.responseText;
            if(result == "false"){
                g("research_result").innerHTML ="提交有误！";
            }
            else{
                g("research_content").value="";
                g("research_result").innerHTML = "感谢您的反馈！";
            }
        }
    }
}

function getCookie(name) {
  var search;
  search = name + "="
  offset = document.cookie.indexOf(search) 
  if (offset != -1) {
    offset += search.length ;
    end = document.cookie.indexOf(";", offset) ;
    if (end == -1)
      end = document.cookie.length;
    return unescape(document.cookie.substring(offset, end));
  }
  else
    return "";
}