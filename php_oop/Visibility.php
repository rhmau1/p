<?php
class Rekening
{
    protected $nama, $saldo, $rekening;
    public function __construct($nama, $rekening)
    {
        $this->nama = $nama;
        $this->saldo = 0;
        $this->rekening = $rekening;
    }
    public function getNama()
    {
        return $this->nama;
    }
    public function getRekening()
    {
        return $this->rekening;
    }
    public function getSaldo()
    {
        return $this->saldo;
    }

    public function setSaldo($saldo)
    {
        $this->saldo = $saldo;
    }
}
$rekeningSaya = new Rekening("Rahma", 123456);
echo "\n" . $rekeningSaya->getNama();
echo "\n" . $rekeningSaya->getRekening();
echo "\n" . $rekeningSaya->getSaldo();
