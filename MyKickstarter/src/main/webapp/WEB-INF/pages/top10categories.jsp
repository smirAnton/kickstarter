<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp">
	<jsp:param value="Top 10 categories" name="title" />
</jsp:include>

	<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-lg-8">
					<table class = "table">					   
					   <thead class="thead-inverse">
					      <tr>
					         <th><p>#</p></th>
					         <th><p>Name</p></th>
					         <th><p>Overall amount of pledges</p></th>
					      </tr>
					   </thead>
					   
						<tbody>
							<c:forEach var="category" items="${top10Categories}" varStatus="loop">						
								<tr class="table-active">
									<td><p>${loop.index}</p></td>
									<td><p>${category[0]}</p></td>
									<td><p>${category[1]}</p></td>
								</tr>
					      	</c:forEach>
					   </tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
<jsp:include page="footer.jsp" />