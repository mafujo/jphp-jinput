package mafujo.jphp.jinput.classes;

import mafujo.jphp.jinput.JInputExtension;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("ControllerEnvironment")
@Reflection.Namespace(JInputExtension.NS)
public class WrappControllerEnvironment extends BaseWrapper<ControllerEnvironment>
{
    public WrappControllerEnvironment(Environment env, ControllerEnvironment wrappedObject) { super(env, wrappedObject); }
    public WrappControllerEnvironment(Environment env, ClassEntity clazz) { super(env, clazz); }

    @Reflection.Signature
    public static ControllerEnvironment getDefaultEnvironment()
    {
        return ControllerEnvironment.getDefaultEnvironment();
    }

    interface WrappedInterface
    {
        public Controller[] getControllers();
    }
}
