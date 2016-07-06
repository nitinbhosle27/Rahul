<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
 <script>
       
       $(document).ready(
       function()
       { 
    	  // alert("hello");
       $('#mylist').change(
       function()
       {
       	var name=document.myform.mylist[document.myform.mylist.selectedIndex].text;
       	alert(name);
            // alert("inside first change");
             $.ajax({url : 'city.do',
           	  data: {citymap : name},
               success : function(data)
               {
               //	alert(data);
               	  var html = '<option value="">----Select menu----</option>';
                   var len = data.length;
                   for ( var i = 0; i < len; i++) {
                     
                      html += '<option value="' + data[i]+'">'+ data[i]+ '</option>';
                   }
                   html += '</option>';
                   $('#second').html(html);
               }
           	  	
             });
         });
     });
  
</script>
<title>State</title>
</head>
<body>
 <form:form method="post" name="myform" commandName="go">
<form:select id="mylist" path="statename" >
 <form:option value="select"/> 
<form:options items="${statename}"/>
</form:select>
<br/>
<br/>
<div id="test"></div>
 <select  id="second" > <option value="select">----select----</option> </select>   
<br/>
<br/>
<input type="submit" value="submit">
</form:form>
</body>
</html> 