<?php 
require _DIR_.'/vendor/autoload.php';
use \App\Pix\Payload;

/**
 * utilizar chave pix aqui
 */
$obPayLoad = (new Payload)->setPixKey('12345678900');
                            ->setPixKey('12345678900');
                            ->setMerchanName('Marcus Vinicius');
                            ->setMerchanCity('São Paulo');
                            ->setAmount(100.00)
                            ->setTxid('MV2004');

 $payloadQrCode = $obPayLoad ->getPayload();
 
 



















?>