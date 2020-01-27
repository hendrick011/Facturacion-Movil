<?php 

require_once '../includes/DbOperations.php';

$response = array(); 

$aviso1 = "CLIENTE INVALIDO";
$aviso = "NO EXISTE EL CLIENTE";

if($_SERVER['REQUEST_METHOD']=='POST'){
	if(isset($_POST['cedula']) ){
		$db = new DbOperations(); 
        if(isset($_POST['cedula']))
             {$aviso0 = $_POST['cedula'];}
        else {
            $aviso0="";
        }
        $aviso1 = $aviso1." mas ".$aviso0;
		if($db->buscaClientes($_POST['cedula'])){
			$user = $db->buscaClientes($_POST['cedula']);
			$response['error'] = false; 
			$response['cedula'] = $user['cedula'];
			$response['nombre'] = $user['nombre'];
			$response['direccion'] = $user['direccion'];
			$response['ruta'] = $user['ruta'];
			$response['celular'] = $user['celular'];
		}else{
			$response['error'] = true; 
			$response['message'] = $aviso1;			
		}
	}else{
		$response['error'] = true; 
		$response['message'] = $aviso; 
	}
}

echo json_encode($response);