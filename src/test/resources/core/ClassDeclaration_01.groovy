package core

class A {}
class B<T> {}
class C<T extends A> {}
class D<T extends A & B> {}
class E<T extends A & B & C> {}
class F<T extends A & B & C> extends A {}
class G<T extends A & B & C> extends A implements X {}
class H<T extends A & B & C> extends A implements X, Y {}
class I<T extends A & B & C> extends A implements X, Y, Z {}
public class J<T extends A & B & C> extends A implements X, Y, Z {}
@Test2 public class K<T extends A & B & C> extends A implements X, Y, Z {}
@Test2 @Test3 public class L<T extends A & B & C> extends A implements X, Y, Z {}

@Test2
@Test3
@Test4(value={
        def a = someMethod()
        assert a.result() == 'abc'
})
public
class M
<
        T extends
A &
B &
C
>
        extends
                A
        implements
                X,
                Y,
                Z
{

}