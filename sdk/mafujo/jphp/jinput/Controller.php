<?php
namespace mafujo\jphp\jinput;

class Controller
{    
    public function getControllers() : array {}
    public function getType() {}
    
    public function getComponents() : array {}
    public function getComponent(ComponentIdentifier $identifier) : Component {}
    public function getRumblers() : array {}
    public function poll() : bool {}

    //queue

    public function getPortType() {}
    public function getPortNumber() {}
    public function getName() {}
}