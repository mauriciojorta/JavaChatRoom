package Logica;


public abstract class Colleague{

	  private Mediator mediator;

	  public Colleague(Mediator m) {

	    this.mediator = m;

	  }

	  /**
	   * It sends a message to the mediator to be resent to the rest of colleagues of the system.
	   * In this case, the mediator is the chat room and the colleagues the users connected to it
	   * @param message - Message to send to the chat room
	   */

	  public abstract void send(String message);

	  /**
	   * @return System mediator (chat room)
	   */

	  public Mediator getMediator() {return mediator;}

	  /**
	   * It receives a message from other user or itself sent to the mediator and it
	   * displays it in the chat window.
	   * @param mensaje - Message sent by the mediator (chat room)
	   */
	  public abstract void receive(String mensaje);

		/**
		 * @return the nick
		 */
		public abstract String getNick();




	}
