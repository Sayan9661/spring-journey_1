<%@include file="common/header.jspf"%>

<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Welcome to my app!!</h1>
	<div>You are logged in as: ${name}</div>
	<div>
		<a href="list-todos">Manage</a> your todos
	</div>
</div>

<%@include file="common/footer.jspf"%>