
<?php 

require_once '../includes/DbOperations.php';

$response = array();

if($_SERVER['REQUEST_METHOD']=='POST'){
	if(
		isset($_POST['cedula']) and 
			isset($_POST['nombre']) and 
			isset($_POST['nombre']) and 
			isset($_POST['direccion']) and 
			isset($_POST['ruta']) and 
				isset($_POST['celular']))
		{
		//operate the data further 

		$db = new DbOperations(); 

		$result = $db->createClientes( 	$_POST['cedula'],
									$_POST['nombre'],
									$_POST['direccion'],
									$_POST['ruta'],
									$_POST['celular']
								);
		if($result == 1){
			$response['error'] = false; 
			$response['message'] = "Cliente Registrado";
		}elseif($result == 2){
			$response['error'] = true; 
			$response['message'] = "Some error occurred please try again";			
		}elseif($result == 3){
			$response['error'] = false; 
			$response['message'] = "Cliente Actualizado";
		}elseif($result == 0){
			$response['error'] = true; 
			$response['message'] = "It seems you are already registered, please choose a different email and username";						
		}

	}else{
		$response['error'] = true; 
		$response['message'] = "Required fields are missing";
	}
}else{
	$response['error'] = true; 
	$response['message'] = "Invalid Request";
}


echo json_encode($response);
