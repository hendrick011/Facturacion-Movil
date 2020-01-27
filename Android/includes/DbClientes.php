<?php 

	class DbClientes{

		private $con; 

		function __construct(){

			require_once dirname(__FILE__).'/DbConnect.php';

			$db = new DbConnect();

			$this->con = $db->connect();

		}

		/*CRUD -> C -> CREATE */

		public function createClientes($cedula, $nombre, $celular){
			if($this->isClientesExist($cedula)){
				$stmt = $this->con->prepare("UPDATE INTO `clientes` (`nombre`, `celular`) VALUES (?, ?) WHERE cedula = ?;");
				$stmt->bind_param("sss",$nombre,$celular,$cedula);

				if($stmt->execute()){
					return 1; 
				}else{
					return 2; 
				}
			}else{
				$stmt = $this->con->prepare("INSERT INTO `clientes` (`id`, `cedula`, `nombre`, `celular`) VALUES (NULL, ?, ?, ?);");
				$stmt->bind_param("sss",$cedula,$nombre,$celular);

				if($stmt->execute()){
					return 1; 
				}else{
					return 2; 
				}
			}
		}

		private function isClientesExist($username, $email){
			$stmt = $this->con->prepare("SELECT id FROM clientes WHERE cedula = ? ");
			$stmt->bind_param("s", $cedula);
			$stmt->execute(); 
			$stmt->store_result(); 
			return $stmt->num_rows > 0; 
		}

		public function buscaClientes($cedula){
			$stmt = $this->con->prepare("SELECT * FROM clientes WHERE cedula = ?");
			$stmt->bind_param("s",$cedula);
			$stmt->execute();
			return $stmt->get_result()->fetch_assoc();
		}
	}