<?php 

	class DbOperations{
		private $con; 
		function __construct(){

			require_once dirname(__FILE__).'/DbConnect.php';
			$db = new DbConnect();
			$this->con = $db->connect();
		}

		/*CRUD -> C -> CREATE */

		public function createUser($username, $pass, $email){
			if($this->isUserExist($username,$email)){
				return 0; 
			}else{
				$password = md5($pass);
				$stmt = $this->con->prepare("INSERT INTO `users` (`id`, `username`, `password`, `email`) VALUES (NULL, ?, ?, ?);");
				$stmt->bind_param("sss",$username,$password,$email);

				if($stmt->execute()){
					return 1; 
				}else{
					return 2; 
				}
			}
		}

		public function userLogin($username, $pass){
			$password = md5($pass);
			$stmt = $this->con->prepare("SELECT id FROM users WHERE username = ? AND password = ?");
			$stmt->bind_param("ss",$username,$password);
			$stmt->execute();
			$stmt->store_result(); 
			return $stmt->num_rows > 0; 
		}

		public function getUserByUsername($username){
			$stmt = $this->con->prepare("SELECT * FROM users WHERE username = ?");
			$stmt->bind_param("s",$username);
			$stmt->execute();
			return $stmt->get_result()->fetch_assoc();
		}
		

		private function isUserExist($username, $email){
			$stmt = $this->con->prepare("SELECT id FROM users WHERE username = ? OR email = ?");
			$stmt->bind_param("ss", $username, $email);
			$stmt->execute(); 
			$stmt->store_result(); 
			return $stmt->num_rows > 0; 
		}
        
		public function createClientes($cedula, $nombre, $direccion, $ruta, $celular){
			if($this->isClientesExist($cedula)){
				$stmt = $this->con->prepare("UPDATE `clientes` SET `nombre` = ?, `direccion` = ?, `ruta` = ?, `celular` = ?  WHERE cedula = ?;");
				$stmt->bind_param("sssss",$nombre,$direccion,$ruta,$celular,$cedula);

				if($stmt->execute()){
					return 3; 
				}else{
					return 2; 
				}
			}else{
				$stmt = $this->con->prepare("INSERT INTO `clientes` (`id`, `cedula`, `nombre`, `direccion`, `ruta`, `celular`) VALUES (NULL, ?, ?, ?, ?, ?);");
				$stmt->bind_param("sssss",$cedula,$nombre,$direccion, $ruta, $celular);

				if($stmt->execute()){
					return 1; 
				}else{
					return 2; 
				}
			}
		}

		private function isClientesExist($cedula){
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