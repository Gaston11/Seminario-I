<!doctype html>
<html>
	<head>
		
		<title></title>
		<style type="text/css">
			label{
				float:left;
				width:65px;
			}
	</head>
	<body>
		<g:form controller="user" action="login" style="padding-left:200px">
			<div style="220px">
				<label>Usuario:</label><input type="text" name="username"/>
				<label>Contraseña:</label><input type="password" name="password"/>
				<label>&nbsp;</label><input type="submit" value="Login">
			</div>
		</g:form>
	</body>

</html>