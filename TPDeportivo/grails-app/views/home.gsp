<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Deportes <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="/Deporte/index">Ver</a></li>
                <li><a href="/Deporte/Create">Crear</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Torneos <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Ver</a></li>
                <li><a href="#">Crear</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Alumnos <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="/Alumno/index">Ver</a></li>
                <li><a href="/Alumno/Create">Crear</a></li>
            </ul>
        </li>
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Bienvenido</h1>

            <p>
                Carga inicial de Datos de Prueba:
            </p>

            <div id="controllers" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <li class="controller">
                        <g:link controller="Alumno" action="generarAlumnos">Cargar Alumnos</g:link>
                    </li>
                    <li class="controller">
                        <g:link controller="Deporte" action="generarDeporte">Cargar Deportes</g:link>
                    </li>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
