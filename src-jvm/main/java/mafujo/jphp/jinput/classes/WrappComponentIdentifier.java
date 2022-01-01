package mafujo.jphp.jinput.classes;

import mafujo.jphp.jinput.JInputExtension;
import net.java.games.input.Component;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("ComponentIdentifier")
@Reflection.Namespace(JInputExtension.NS)
public class WrappComponentIdentifier extends BaseWrapper<Component.Identifier>
{
    public WrappComponentIdentifier(Environment env, Component.Identifier wrappedObject) { super(env, wrappedObject); }
    public WrappComponentIdentifier(Environment env, ClassEntity clazz) {  super(env, clazz); }

    interface WrappedInterface
    {
        public String getName();
        public String toString();

    }
}
