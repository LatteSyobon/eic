echo Initialize the resource file once to copy the resources
del 1.12.2\src\main\resources\assets\eic\*
del 1.14.4\src\main\resources\assets\eic\*
del 1.12.2\src\main\data\eic\*
del 1.14.4\src\main\data\eic\*

echo Copy the texture resource to 1.12.2 (copy source 1.15.2)
mkdir 1.12.2\src\main\resources\assets\eic\textures\item
mkdir 1.12.2\src\main\resources\assets\eic\textures\block
copy 1.15.2\src\main\resources\assets\eic\textures\item\* 1.12.2\src\main\resources\assets\eic\textures\item\
copy 1.15.2\src\main\resources\assets\eic\textures\block\* 1.12.2\src\main\resources\assets\eic\textures\block\

echo Copy the texture resource to 1.14.4 (copy source 1.15.2)
mkdir 1.14.4\src\main\resources\assets\eic\textures\item
mkdir 1.14.4\src\main\resources\assets\eic\textures\block
copy 1.15.2\src\main\resources\assets\eic\textures\item\* 1.14.4\src\main\resources\assets\eic\textures\item\
copy 1.15.2\src\main\resources\assets\eic\textures\block\* 1.14.4\src\main\resources\assets\eic\textures\block\

echo Copy the language files (copy source 1.15.2)
mkdir 1.12.2\src\main\resources\assets\eic\lang
mkdir 1.14.4\src\main\resources\assets\eic\lang
copy 1.15.2\src\main\resources\assets\eic\lang\* 1.14.4\src\main\resources\assets\eic\lang\
copy 1.15.2\src\main\resources\assets\eic\lang\* 1.12.2\src\main\resources\assets\eic\lang\

echo Copy the recipe definition file (copy source 1.15.2)
mkdir 1.12.2\src\main\resources\data\eic\recipes
mkdir 1.14.4\src\main\resources\data\eic\recipes
copy 1.15.2\src\main\resources\data\eic\recipes\* 1.14.4\src\main\resources\data\eic\recipes\
copy 1.15.2\src\main\resources\data\eic\recipes\* 1.12.2\src\main\resources\data\eic\recipes\