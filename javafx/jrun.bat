set arg1=%1
javac --module-path %PATH_TO_FX% --add-modules javafx.controls %arg1%.java

java --class-path . --module-path "%PATH_TO_FX%" --add-modules javafx.controls %arg1%

