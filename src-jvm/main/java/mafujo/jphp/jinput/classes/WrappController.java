package mafujo.jphp.jinput.classes;

import mafujo.jphp.jinput.JInputExtension;
import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.Rumbler;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("Controller")
@Reflection.Namespace(JInputExtension.NS)
public class WrappController extends BaseWrapper<Controller>
{
    public WrappController(Environment env, Controller wrappedObject) { super(env, wrappedObject);  }
    public WrappController(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        public Controller[] getControllers();
        //public Controller.Type getType();
        public Component[] getComponents();
        //public Component getComponent();
        public Rumbler[] getRumblers();
        public boolean poll();

        //queue not like

        //public Controller.PortType getPortType();
        public int getPortNumber();
        public String getName();



    }
}
