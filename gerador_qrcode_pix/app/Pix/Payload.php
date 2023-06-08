<?php
namespace App\Pix;

class Payload {

    /**
       * IDs do Payload do Pix
       * @var string
       */
      const ID_PAYLOAD_FORMAT_INDICATOR = '00';
      const ID_MERCHANT_ACCOUNT_INFORMATION = '26';
      const ID_MERCHANT_ACCOUNT_INFORMATION_GUI = '00';
      const ID_MERCHANT_ACCOUNT_INFORMATION_KEY = '01';
      const ID_MERCHANT_ACCOUNT_INFORMATION_DESCRIPTION = '02';
      const ID_MERCHANT_CATEGORY_CODE = '52';
      const ID_TRANSACTION_CURRENCY = '53';
      const ID_TRANSACTION_AMOUNT = '54';
      const ID_COUNTRY_CODE = '58';
      const ID_MERCHANT_NAME = '59';
      const ID_MERCHANT_CITY = '60';
      const ID_ADDITIONAL_DATA_FIELD_TEMPLATE = '62';
      const ID_ADDITIONAL_DATA_FIELD_TEMPLATE_TXID = '05';
      const ID_CRC16 = '63';
      
      /**
       * Chave pix
       * @var string
       */
      private $pixKey;
      /**
       * Descrição do pagamento
       * @var string
       */
      private $description;
      /**
       * Nome do titular da conta
       * @var string
       */
      private $merchanName;
      /**
       * Cidade do titular da conta
       * @var string
       */
      private $merchanCity;
      /**
       * ID da transação pix
       * @var string
       */
     private $txid;
     /**
       * IDs do Payload do Pix
       * @param float
       */
    private $amount;

    
    /**
       * Método responsável por definir o valor de $pixKey
       * @param string
       */
      public function setPixKey($pixKey){
        $this ->pixKey= $pixKey;
        return $this;
      }
      /**
       * Método responsável por definir o valor de $description
       * @param string
       */
      public function setDescription($description){
        $this ->description= $description;
        return $this;
      }
      /**
       * Método responsável por definir o valor de $merchanName
       * @param string
       */
      public function setMerchanName($merchanName){
        $this ->merchanName= $merchanName;
        return $this;
      }
      /**
       * Método responsável por definir o valor de $merchanCity
       * @param string
       */
       public function setMerchanCity($merchanCity){
        $this ->merchanCity= $merchanCity;
        return $this;
      }
      /**
       * Método responsável por definir o valor de $amount
       * @param float
       */
      public function setAmount($amount){
        $this ->amount= (string)number_format($amount,2,'.','');
        return $this;
      }


      /**
       * Método responsável por retornar um valor completo de um objeto do payload
       * @param string $id
       * @param string $value
       * @return string $id.$size.$value
       */
      private function getValue($id,$value){
        $size = str_pad(strlen($value),2,'0',STR_PAD_LEFT);
        return $id.$size.$value;

      }

      /**
       * Método responsável por retornar os valores completos da informação da conta
       * @return string
       * 
       */

      private function getMerchanAccountInformation(){
        //DOMÍNIO DO BANCO
        $gui = $this ->getValue(self::ID_MERCHANT_ACCOUNT_INFORMATION_GUI,'br.gov.bcb.pix');
        //CHAVE PIX     
        $key =$this ->getValue(self::ID_MERCHANT_ACCOUNT_INFORMATION_KEY,$this->pixkey);

        //DECRIÇÃO DO PAGAMENTO
        $description = strlen($this->description) ? $this->getValue(self::ID_MERCHANT_ACCOUNT_INFORMATION_DESCRITPION,$this->description) :'';




      }

 /**
       * Método responsável por um codigo completo  do payload
     
       * @return string
       */
      public function getPayload(){
        //cria o payload
        $payload = $this->getValue(self::ID_PAYLOAD_FORMART_INDICATOR,'01');

        return $payload;
      }
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      












?>


