package mafujo.jphp.jinput.classes;

import mafujo.jphp.jinput.JInputExtension;
import net.java.games.input.Component;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("Component")
@Reflection.Namespace(JInputExtension.NS)
public class WrappComponent extends BaseWrapper<Component>
{
    public WrappComponent(Environment env, Component wrappedObject) { super(env, wrappedObject); }
    public WrappComponent(Environment env, ClassEntity clazz) { super(env, clazz); }



    interface WrappedInterface
    {
        public Component.Identifier getIdentifier();
        public boolean isRelative();
        public boolean isAnalog();
        float getDeadZone();
        float getPollData();
        public String getName();
    }
}
