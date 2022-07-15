echo Initialize the resource file once to copy the resources
del 1.12.2\src\main\resources\assets\eic\*
del 1.14.4\src\main\resources\assets\eic\*

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