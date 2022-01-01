package mafujo.jphp.jinput.classes;

import mafujo.jphp.jinput.JInputExtension;
import net.java.games.input.Rumbler;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("Rumbler")
@Reflection.Namespace(JInputExtension.NS)
public class WrappRumbler extends BaseWrapper<Rumbler>
{
    public WrappRumbler(Environment env, Rumbler wrappedObject) { super(env, wrappedObject); }
    public WrappRumbler(Environment env, ClassEntity clazz) { super(env, clazz); }
}
