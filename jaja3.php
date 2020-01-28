<?php
 $host="localhost";
 $usuario="root";
 $clave="duarte";
 $base="android";

 $response = array();
 $conexion = mysqli_connect($host, $usuario, $clave, $base);

 if(!$conexion)
 { 
   echo "Fallo la conexion:(". $conexion->connect_errno. ")". $conexion->connect_error;
 } 
 $usernamea="h5";
 $todos="SELECT * FROM users where username = '$usernamea'";
  //$todos="SELECT * FROM users ";
 $reg_todos=mysqli_query($conexion, $todos);
 $minombre='no existe';
     $a=0;
     while ($marcos = mysqli_fetch_array($reg_todos))
      {
            $response['id'] = $marcos['id'];
            $response['email'] = $marcos['email'];
            $response['username'] = $marcos['username'];
       $minombre = $marcos['username'];
       $a++;
       $salida=$a." ".$marcos['id']." ".$marcos['username']." ".$marcos['email'] . "\n";
      echo $salida;

      }
 echo "\n Mi usuario es : ";
 echo $minombre;
 echo "\n";
 echo "\n----------------------\n";
 echo json_encode($response);
 echo "\n----------------------\n";
 mysqli_free_result($reg_todos);
 mysqli_close($conexion);
?>
