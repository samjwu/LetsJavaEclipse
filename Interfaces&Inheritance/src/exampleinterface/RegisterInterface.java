package exampleinterface;

/**
 * Interface for register
 * models the behavior that register should have but does not implement methods
 * 
 * Interfaces define specification, not implementation
 */
public interface RegisterInterface {
    
    public RegisterStatus getStatus();
    public void Open();
    public void Close();
    public boolean isOpen();
    public boolean isClosed();
       
}