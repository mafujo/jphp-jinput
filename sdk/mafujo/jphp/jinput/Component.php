<?php
namespace mafujo\jphp\jinput;

class Component
{
    public function getIdentifier() : ComponentIdentifier {}
    public function isRelative() {}
    public function isAnalog() {}
    public function getDeadZone() {}
    public function getPollData() {}
    public function getName() {}
}