package exampleinterface;

public class ImplementRegister implements RegisterInterface {
	private RegisterStatus status;
    
    /**
     * Constructor for this (ImplementRegister) class
     */
    public ImplementRegister() {
        //init with closed drawer
        this.status = RegisterStatus.Closed;
    }
    
    @Override
    public RegisterStatus getStatus() {
        return this.status;
    }

    @Override
    public void Open() {
        this.status = RegisterStatus.Open;
    }

    @Override
    public void Close() {
        this.status = RegisterStatus.Closed;
    }

    @Override
    public boolean isOpen() {
        return this.status == RegisterStatus.Open;
    }

    @Override
    public boolean isClosed() {
        return this.status == RegisterStatus.Closed;
    }
}
