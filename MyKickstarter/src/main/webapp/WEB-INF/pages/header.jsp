<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title><c:if test="${not empty param.title}">${param.title}</c:if>
	<c:if test="${empty param.title}">Default title</c:if></title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/business-casual.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/font.open_sans.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/font.josefin_slab.css" />"
	rel="stylesheet" type="text/css">
<script src="<c:url value="/resources/js/jquery.js" />"></script>
<script src="<c:url value="/resources/js/jquery-1.11.3.min.js" />"></script>
<script
	src="<c:url value="/resources/js/jquery-migrate-1.2.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<div class="brand">My Kickstarter</div>
	<div class="address-bar">Anton Smirnov | Kiev, Ukraine 02068 |
		+38(063)109-38-08</div>

	<nav class="navbar navbar-default">
		<div class="container">

			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/kickstarter/">Kickstarter</a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="/kickstarter">Home</a></li>
					<li class="dropdown active"><a href="/kickstarter"
						class="dropdown-toggle" data-toggle="dropdown">Categories<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<c:forEach items="${categories}" var="category">
								<li><a href="/kickstarter/category?id=${category.id}">
										<c:out value="${category.getName()}" />
								</a></li>
							</c:forEach>
						</ul></li>
					<li><a href="/kickstarter/top10">Top 10 categories</a></li>
					<li><a href="/kickstarter/contacts">Contact</a></li>
					<li><a href="/kickstarter/get/file">Download file</a></li>
				</ul>
			</div>
		</div>
	</nav>