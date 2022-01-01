<?php

use mafujo\jphp\jinput\Controller;
use mafujo\jphp\jinput\ControllerEnvironment;
use php\gui\UXApplication;
use php\gui\UXButton;
use php\gui\UXForm;

UXApplication::launch(function(UXForm $form)
{
    $controller = null;
    foreach((ControllerEnvironment::getDefaultEnvironment())->getControllers() as $c)
    {
        if($c->getName() == "Wireless Controller") $controller = $c;
    }

    $buttonPOOL = new UXButton("pool");
    $buttonPOOL->x = 100;
    $buttonPOOL->on('action', function() use ($controller)
    {
        var_dump($controller->getRumblers());
    });
    $form->add($buttonPOOL);

    $buttonCheck = new UXButton("check");
    $buttonCheck->x = 400;
    $buttonCheck->on('action', function() use ($controller)
    {
        var_dump("===========================================================");
        var_dump("===========================================================");
        var_dump("===========================================================");
        $controller->poll();
        foreach($controller->getComponents() as $component)
        {
            var_dump($component->getName() . " // " . $component->getPollData() . " // " . $component->getIdentifier()->getName());
        }
    });
    $form->add($buttonCheck);

    $form->size = [800, 800];
    $form->show();
});