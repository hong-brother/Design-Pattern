package singleton;

import me.hsnam.singleton.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("1. 기본적인 싱글톤 테스트")
    public void baseSingletonTest() {
        DefaultAppConfig defaultAppConfig1 = DefaultAppConfig.getInstance();
        DefaultAppConfig defaultAppConfig2 = DefaultAppConfig.getInstance();

        Assertions.assertEquals(defaultAppConfig1, defaultAppConfig2);
    }

    @Test
    @DisplayName("2. 스레드 환경에서 안전한 싱글톤 테스트")
    public void threadSafetySingletonTest() {
        ThreadSafetyAppConfig threadSafetyAppConfig1 = ThreadSafetyAppConfig.getInstance();
        ThreadSafetyAppConfig threadSafetyAppConfig2 = ThreadSafetyAppConfig.getInstance();

        Assertions.assertEquals(threadSafetyAppConfig1, threadSafetyAppConfig2);
    }

    @Test
    @DisplayName("3. 더블 체크 싱글톤 테스트")
    public void doubleCheckSingletonTest() {
        DoubleCheckAppConfig doubleCheckAppConfig1 = DoubleCheckAppConfig.getInstance();
        DoubleCheckAppConfig doubleCheckAppConfig2 = DoubleCheckAppConfig.getInstance();

        Assertions.assertEquals(doubleCheckAppConfig1, doubleCheckAppConfig2);
    }

    @Test
    @DisplayName("4. enum 싱글톤 테스트")
    public void enumSingletonTest() {
        EnumAppConfig enumAppConfig1 = EnumAppConfig.getInstance();
        EnumAppConfig enumAppConfig2 = EnumAppConfig.getInstance();

        Assertions.assertEquals(enumAppConfig1, enumAppConfig2);
    }

    @Test
    @DisplayName("5. static inner 싱클톤 테스트")
    public void lazySingletonTest() {
        LazyAppConfig lazyAppConfig1 = LazyAppConfig.getInstance();
        LazyAppConfig lazyAppConfig2 = LazyAppConfig.getInstance();

        Assertions.assertEquals(lazyAppConfig1, lazyAppConfig2);
    }

    @Test
    @DisplayName("6. eager 싱글톤 테스트")
    public void  eagerInitialization() {
        EagerAppConfig eagerAppConfig1 = EagerAppConfig.getInstance();
        EagerAppConfig eagerAppConfig2 = EagerAppConfig.getInstance();

        Assertions.assertEquals(eagerAppConfig1, eagerAppConfig2);
    }
}
