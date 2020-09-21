<?php

// http://localhost:8111/yii2/basic/web/
// http://localhost:8111/
// http://localhost:8081/users


// // mysql -u root

// // user, pass root
// // db_name example

// try 
// {
// 	$dbh = new PDO('mysql:dbname=example;host=mysql', 'root', 'root');
// } 
// catch (PDOException $e) 
// {
// 	die($e->getMessage());
// }


// error_reporting(E_ALL);

$headers = stream_context_create(array(
	'http' => array(
		'method' => 'GET',
		'header' => 'Content-Type:application/json' . PHP_EOL,
		'content' => '',
	),
));
 
// echo file_get_contents('http://server:8080/create_user');

$url = "http://server:8080/users";



$opts = array(
  'http'=>array(
    'method'=>"GET",
  )
);

$context = stream_context_create($opts);

$file = file_get_contents($url, false, $headers);


echo $file;








// function file_get_contents_curl($url) {
// $ch = curl_init();
// curl_setopt($ch, CURLOPT_URL, $url);
// curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
// curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
// curl_setopt($ch, CURLOPT_HEADER, false);
// $data = curl_exec($ch);
// curl_close($ch);
// return $data;
// }

// $url = "http://user_rest_server:8080/users";
// $t = file_get_contents($url);
// var_dump($t);




// $t = file_get_contents_curl("http://user_rest_server:8080/users");
// //$t = str_replace("авальн", "", $t);
// var_dump($t);

//$t = file_get_contents_curl("http://user_rest_server:8081/users");
//$t = str_replace("авальн", "", $t);
//var_dump($t);


// $url = "http://server:8080/greeting?name=Userkhggkuc";
// $t = file_get_contents($url);
// var_dump($t);
?>