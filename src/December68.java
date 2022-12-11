import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class December68 {
    public static void main(String[] args) {
        int modifiersOfThisClass = December68.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));
    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifiers) {
        int mod = allModifiers & specificModifiers;
        return mod == specificModifiers ? true : false;
    }

    private static Method getMainMethod() {
        Method[] methods = December68.class.getMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }
        return null;
    }
}
