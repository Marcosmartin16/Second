# SECOND

1. Splash Screen(#id1)
2. Login(#id2)
3. Register(#id3)
4. Main(#id4)

## Splash Screen<a name="id1"></a>

En esta Activity podemos ver una imagen cargada con Glide en el SplashScreen.java. Tambien tenemos el logo de la aplicacion que en este caso es un gnomo, 
este tiene una animacion en la carpeta anim y usamos el archivo rotate.xml simulando dar saltos.

![capturas](https://github.com/Marcosmartin16/Second/blob/materialLogin/capturas/CapturaSplass.PNG)

[xml rotate](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/anim/rotate.xml)
[xml SplashScreen](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/layout/activity_splash_screen.xml)
[java SplashScreen](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/java/com/first/second/SplashScreen.java)


gif animacion splash

## Login<a name="id2"></a>

Podemos ver que en esta Activity el logo tiene una animacion adicional. Ahora el gnomo despues de saltar lanza una bola de fuego roja hacia el margen izquierdo creada con la animacion translation.xml.
Ademas tenemos la posibilidad de logearnos insertando el nombre de usuario y contraseña o tambien puedes registrarte pulstando el boton de register. La imagen de fondo esta cargada con Glide como la del SplashScreen.

![capturas](https://github.com/Marcosmartin16/Second/blob/materialLogin/capturas/CapturaLogin.PNG)

[xml rotate](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/anim/rotate.xml)
[xml translation](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/anim/translation.xml)
[xml Login](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/layout/activity_login.xml)
[java Login](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/java/com/first/second/Login.java)


gif animacion login

## Register<a name="id3"></a>

Esta Activity es mas sencilla que las anteriores solamente aparecen EditText como en la Activity de login pero añadiendo el de email. Ademas como en las anteriores esta cargada la imagen de 
fondo con Glide.

![capturas](https://github.com/Marcosmartin16/Second/blob/materialLogin/capturas/CapturaRegister.PNG)

[xml Register](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/layout/activity_register.xml)
[java Register](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/java/com/first/second/Register.java)

## Main<a name="id4"></a>
Esta es la Activity a diferencia de la anterior mas compleja contamos con una app bar superior en la que aparece el nombre de la aplicacion a la izquierda y en la derecha un boton de una lupa, de
un corazon y un menu icon donde podremos ver dos opciones una que nos sacara un AlertDialog y otra que nos llevara a la pantalla de registro.

[xml app_bar](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/menu/app_bar.xml)
[xml toast_custom](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/layout/toast_custom.xml)

Ademas tenemos un menu context el cual nos muestra la opcion de copy o download. Si pulsamos copy nos mostrara una snackbar con el mensaje 'item copied' y la opcion de 'UNDO'.
Si pulsamos en download nos mostrara un toast con el mensaje item download.

[xml menu_context](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/menu/menu_context.xml)

Para terminar tenemos un WebView que nos permite ver una pagina web que cada vez que refresquemos la pagina aparece una nueva foto. Ademas cada vez que refresquemos nos aparece un toast como 
al pulsar download pero con una imagen.

![capturas](https://github.com/Marcosmartin16/Second/blob/materialLogin/capturas/main.PNG)

[xml Main](https://github.com/Marcosmartin16/Second/blob/materialLogin/app/src/main/res/layout/activity_main.xml)


gif aplicacion entera









