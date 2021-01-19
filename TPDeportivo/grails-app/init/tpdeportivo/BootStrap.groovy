package tpdeportivo

class BootStrap {

    def init = { servletContext ->
        def alumno1 = new Alumno(nombre:'Frank',
            fechaNacimiento:new Date('5/5/1990'),
            telefono:1122334455,
            email:'fgarciarico@gmail.com'
        ).save()
        def alumno2 = new Alumno(nombre:'Nelson',
            fechaNacimiento:new Date('5/12/1991'),
            telefono:11212349,
            email:'fnelli@gmail.com'
        ).save()
        def alumno3 = new Alumno(nombre:'Julian',
            fechaNacimiento:new Date('1/10/1990'),
            telefono:1121234565,
            email:'juliP@gmail.com'
        ).save()
        def alumno4 = new Alumno(nombre:'Juan',
            fechaNacimiento:new Date('1/1/1994'),
            telefono:11223455,
            email:'juanGim@gmail.com'
        ).save()
        def alumno5 = new Alumno(nombre:'Jorge',
            fechaNacimiento:new Date('10/10/1993'),
            telefono:11876555,
            email:'jorgeReina@gmail.com'
        ).save()
        def alumno6 = new Alumno(nombre:'Cris',
            fechaNacimiento:new Date('4/4/1997'),
            telefono:1345678,
            email:'crisCaza@gmail.com'
        ).save()

    }
    def destroy = {
    }
}
