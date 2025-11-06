<?php

namespace php_oop\Mahasiswa;

class mahasiswa
{
    public $nim;
    public $nama;
    public $kelas;
    public int $umur;
    public $jurusan;

    public function __construct($nim, $nama, $kelas, int $umur)
    {
        $this->nim = $nim;
        $this->nama = $nama;
        $this->kelas = $kelas ?? '1c';
        $this->umur = $umur;
    }
    public function gantiKelas($kelasGanti)
    {
        $this->kelas = $kelasGanti;
    }
}
