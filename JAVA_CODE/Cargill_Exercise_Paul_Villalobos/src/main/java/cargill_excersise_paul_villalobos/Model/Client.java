
package cargill_excersise_paul_villalobos.Model;

import java.util.Date;

/**
 *
 * @author Paul Villalobos
 */
public class Client {
    
    String clientID;
    String clientName;
    Address address;
    String clientType;
    String clientSize;
    Date clientSince;
    boolean isCreditWorthy;
    boolean isDealer;

    public Client(String clientID, String clientName, Address address, String clientType, String clientSize, Date clientSince, boolean isCreditWorthy, boolean isDealer) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.address = address;
        this.clientType = clientType;
        this.clientSize = clientSize;
        this.clientSince = clientSince;
        this.isCreditWorthy = isCreditWorthy;
        this.isDealer = isDealer;
    }

    public String getClientID() {
        return clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public Address getAddress() {
        return address;
    }

    public String getClientType() {
        return clientType;
    }

    public String getClientSize() {
        return clientSize;
    }

    public Date getClientSince() {
        return clientSince;
    }

    public boolean isIsCreditWorthy() {
        return isCreditWorthy;
    }

    public boolean isIsDealer() {
        return isDealer;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setClientSize(String clientSize) {
        this.clientSize = clientSize;
    }

    public void setClientSince(Date clientSince) {
        this.clientSince = clientSince;
    }

    public void setIsCreditWorthy(boolean isCreditWorthy) {
        this.isCreditWorthy = isCreditWorthy;
    }

    public void setIsDealer(boolean isDealer) {
        this.isDealer = isDealer;
    }

    @Override
    public String toString() {
        return "Client{" + "clientID=" + clientID + ", clientName=" + clientName + 
                ", address=" + address + ", clientType=" + clientType + ", clientSize=" + clientSize +
                ", clientSince=" + clientSince + ", isCreditWorthy=" + isCreditWorthy + ", isDealer=" + isDealer + '}';
    }
    
    
}
