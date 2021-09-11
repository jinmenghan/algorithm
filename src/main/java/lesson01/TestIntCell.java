package lesson01;

// Exercise the IntCell class
public class TestIntCell
{
    public static void main( String [ ] args )
    {
        MemoryCell m = new MemoryCell( );

        m.write( 5 );
        System.out.println( "Cell contents: " + m.read( ) );
        // The next line would be illegal if uncommented
//      m.storedValue = 0;
    }
}