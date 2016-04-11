package io.paprika.model;



import java.util.ArrayList;
import java.util.Observer;


/**
 * Created by Sarra on 08/04/2016.
 */
public class PaprikaMessage extends Entity implements Observer{
    private PaprikaMethod callingMethod;
    private Entity calledMethod;//PaprikaMethod or a PaprikaExternalMethod
    private Entity receiver; // The class of the receiver
    private Entity reciverEntity; // The entity which received the call
    private ArrayList<Observer> observers;

    private PaprikaMessage(Entity calledMethod, Entity receiver,Entity receiverEntity, PaprikaMethod callingMethod) {
        this.calledMethod = calledMethod;
        this.receiver = receiver;
        this.callingMethod = callingMethod;
        this.reciverEntity = receiverEntity;
        this.observers = new ArrayList<>(0);
    }

    public static PaprikaMessage createPaprikaMessage(Entity calledMethod, Entity receiver, Entity reciverEntity, PaprikaMethod callingMethod){
        PaprikaMessage paprikaMessage = new PaprikaMessage(calledMethod,receiver,reciverEntity, callingMethod);
        callingMethod.addPaprikaMessage(paprikaMessage);
        return paprikaMessage;
    }

    public Entity getCalledMethod() {
        return calledMethod;
    }

    public void setCalledMethod(Entity calledMethod) {
        this.calledMethod = calledMethod;
    }

    public Entity getReceiver() {
        return receiver;
    }

    public void setReceiver(Entity receiver) {
        this.receiver = receiver;
    }


    public PaprikaMethod getCallingMethod() {
        return callingMethod;
    }

    public void setCallingMethod(PaprikaMethod callingMethod) {
        this.callingMethod = callingMethod;
    }

    public Entity getReciverEntity() {
        return reciverEntity;
    }

    public void setReciverEntity(Entity reciverEntity) {
        this.reciverEntity = reciverEntity;
        this.reciverEntity.addObserver(this);
    }



    //Observer
    @Override
    public void update(java.util.Observable o, Object arg) {
        //TODO update
    }

    //Observable
    @Override
    public synchronized void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        for(Observer o : this.observers){
            o.update(this,arg);
        }
    }
}
