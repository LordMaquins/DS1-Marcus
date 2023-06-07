<?php 
<required_DIR_.'/vendor/autoload.php';
use \App\Pix\Payload;

/**
 * utilizar chave pix aqui
 */
$obPayLoad = (new Payload)->setPixKey('12345678900');

echo "<pre>";
print_r_($obPayload);
echo "</pre>"; exit;


















?>