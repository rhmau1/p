<?php
require 'Mahasiswa.php';

use php_oop\Mahasiswa\mahasiswa;

$mahasiswa1 = new mahasiswa("123", 'joko', null, 12);

echo json_encode($mahasiswa1);

$mahasiswa1->gantiKelas('1a');
echo json_encode($mahasiswa1);
