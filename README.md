# Hello World
## Introdución
Mi primer proyecto en Android Studio con Java.

Donde he aprendido:
- Utilizar recursos para cambiar colores y cambiar texto en las etiqutas de texto.
- Utilizar diferentes atributos de la etiqueta <TextView></TextView> como el tamaño de las letras, centralizar el texto,  estilo de las letras
- Instanciar en Java un objeto TextView
- Crear el icono para el programa
- Añadir el proyecto a GitHub
- Borrar el cache y añadir de nuevo todos los ficheros a GitHub
- Generar JavaDoc
- Hacer comentarios el en proyecto


### Recursos de colores y strings
###### Colores:
```html
<resources>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="orange">#FFC107</color>
    <color name="green">#4CAF50</color>
</resources>
```
Cambiar el color de fondo:

`<TextView android:background="@color/orange" />`

Cambiar el color de letras:

`<TextView android:foreground="@color/orange" />`
###### Texto:
```html
<resources>
    <string name="app_name">Hola Mundo</string>
    <string name="tvMessageStartText">Hola Mundo</string>
    <string name="tvMessageEndTetx">Muy Cruel</string>
    <string name="txtMessageOptimist">En este maravilloso dia</string>
</resources>
```
Cambiar el texto:

` <TextView android:text="@string/tvMessageStartText" />`

### Instanciar en Java un objeto TextView
**Ejemplo:**
```
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.white));           
        tvMessageEnd=findViewById(R.id.tvMessageEnd);
        tvMessageEnd.setText(R.string.txtMessageOptimist);
    }
}
```

### Crear icono
En el File -> New-> Image Asset

Ponemos el nombre del icono, la imagen, también se puede cambiar el color de fondo...

### Subir a GitHub
`git push origin`

#### Borrar el cache
`git rm -r --cached .`
#### Añadir de nuevo los archivos del programa
`git add .`

#### Confirmar los cambios
`git commit -m "Solucion correcta donde se aplica el nuevo fichero .gitignore"`

`git push origin master`


### Generar JavaDoc
Tools  ->  Generate JavaDoc

**Ponemos la ruta donde queremos generar el archivo:**

C:\Users\kniki\Documentos\AndroidStudioProjects\HolaMundo\app\doc

**Visibilidad:** protected

**Y marcamos**

@autor

@version

@deprecated

**Generar**


Si sale error

**Abrimos:**

File -> Project Structure -> SDK Location

**Android SDK Location ponemos la ruta:**

C:\Users\kniki\AppData\Local\Android\Sdk\platforms\android-33\android.jar

**Otra vez generamos JavaDoc**

**Y ahora con  con cualquier navegador podemos abrirlo**

### Comentarios

- /* Sirve para comentar varias lineas*/

- //Sirve para comentar solo una linea

- //TODO

- <--Comentarios en xml -->

##### Ejemplo del comentario en clase

```
/**
 * @author kniki
 * @version 1.0
 * <br>Aplicacion que muetra el tipico ejemplo de Hola Mundo</br>
 *<ol>
 *     <li>Se ha visto como se creen los recursos en xml</li>
 *     <li>Se ha instansiado en Java un objeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicacion</li>
 *</ol>
**/
```



### Imagen:
Para añadir la imagen, he hecho una foto del programa en mi movil, la he subido al github igual como agregar un archivo de codigo
y con esto ya tengo el enlace para poner la imagen aquí
![](https://github.com/nikitenkokatya/HelloWorld/blob/master/HelloWorld.jpg)

> Hola Mundo


