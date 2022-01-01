package mafujo.jphp.jinput;

import mafujo.jphp.jinput.classes.*;
import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;
import net.java.games.input.Rumbler;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JInputExtension extends Extension
{
    public static final String NS = "mafujo\\jphp\\jinput";

    @Override
    public Status getStatus() { return Status.EXPERIMENTAL; }

    @Override
    public void onRegister(CompileScope compileScope)
    {
        registerWrapperClass(compileScope, ControllerEnvironment.class, WrappControllerEnvironment.class);
        registerWrapperClass(compileScope, Controller.class, WrappController.class);

        registerWrapperClass(compileScope, Component.class, WrappComponent.class);
        registerWrapperClass(compileScope, Component.Identifier.class, WrappComponentIdentifier.class);
        //registerWrapperClass(compileScope, Component.Identifier.Key.class, WrappComponentIdentifierKey.class);

        registerWrapperClass(compileScope, Rumbler.class, WrappRumbler.class);

    }
}
